package com.qnahub.data_managers.managers;

import com.qnahub.common.managers.SuperManager;
import com.qnahub.common.utils.EncryptionUtil;
import com.qnahub.data_module.auth.LoginResult;
import com.qnahub.data_module.auth.LoginStatusEnum;
import com.qnahub.data_module.entity.UserAuthenticationInfoEntity;
import com.qnahub.data_module.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by markth on 10/23/2016.
 */
@Service
public class AuthenticationManager extends SuperManager {

    public void createAuthenticationEntity(UserAuthenticationInfoEntity authEntity){
      //  userAuthenticationDAO.saveUserAuthentication(authEntity);
    }

    public void authenticate() {

    }

    public LoginResult login(String username, CharSequence password) {
        //UserEntity user = userDAO.getSingleEntityBy(UserEntity.class, UserEntity.FIND_BY_USERNAME, username);
        UserEntity user = null;
        if(user == null){
            return new LoginResult(LoginStatusEnum.FAILED);
        }

        UserAuthenticationInfoEntity authenticationInfo = user.getAuthenticationInfo();
        String currentPassword = authenticationInfo.getPassword();

        LoginResult loginResult;
        if(!EncryptionUtil.matchEncoded(currentPassword, password)) {
            loginResult = new LoginResult(LoginStatusEnum.FAILED);
        }else {
            String token = EncryptionUtil.generateHash(username);
            authenticationInfo.setLastLogin(LocalDateTime.now());
            authenticationInfo.setAuthToken(token);
         //   userAuthenticationDAO.saveUserAuthentication(authenticationInfo);
            loginResult = new LoginResult(LoginStatusEnum.SUCCESS, user, true, token);
        }

        return loginResult;
    }
}
