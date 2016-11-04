package com.qnahub.data_managers.managers;

import com.qnahub.common.entity.SuperEntity;
import com.qnahub.common.managers.SuperManager;
import com.qnahub.common.utils.EncryptionUtil;
import com.qnahub.data_module.auth.LoginResult;
import com.qnahub.data_module.auth.LoginStatusEnum;
import com.qnahub.data_module.dao.UserDAOIfc;
import com.qnahub.data_module.entity.UserAuthenticationInfoEntity;
import com.qnahub.data_module.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;

/**
 * Created by markth on 10/23/2016.
 */
@Service
public class AuthenticationManager extends SuperManager {

    @Autowired
    private UserDAOIfc userDAO;

    public void authenticate() {

    }

    public LoginResult login(String username, CharSequence password) {
        UserEntity user = userDAO.getSingleEntityBy(UserEntity.class, UserEntity.FIND_BY_USERNAME, username);
        if(user == null){
            return new LoginResult(LoginStatusEnum.FAILED);
        }

        UserAuthenticationInfoEntity securityInfo = user.getSecurityInfo();
        String currentPassword = securityInfo.getPassword();

        LoginResult loginResult;
        if(!EncryptionUtil.matchEncoded(currentPassword, password)) {
            loginResult = new LoginResult(LoginStatusEnum.FAILED);
        }else {
            String token = EncryptionUtil.generateHash(username);
       //     securityInfo.setLastLogin(LocalDateTime.now());
            securityInfo.setAuthToken(token);
            loginResult = new LoginResult(LoginStatusEnum.SUCCESS, user, true, token);
        }

        return loginResult;
    }
}
