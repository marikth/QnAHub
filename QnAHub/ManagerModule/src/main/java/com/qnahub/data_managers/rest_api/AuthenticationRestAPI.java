package com.qnahub.data_managers.rest_api;

import com.qnahub.data_managers.managers.AuthenticationManager;
import com.qnahub.data_managers.managers.UserManager;
import com.qnahub.data_managers.rest_api.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by markth on 10/20/2016.
 */

@RestController()
@RequestMapping(value="/auth")
public class AuthenticationRestAPI {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private UserManager userManager;

//
//    @RequestMapping(value = "/authentication", method = RequestMethod.GET, produces = "application/json")
//    public ResponseEntity<String> authentication(){
//        authManager.authenticate();
//
//
//        return new ResponseEntity<String>(new String("aaa"), HttpStatus.OK);
//    }
//
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<LoginResponse> loginUser(@RequestParam(value="username")String username, @RequestParam(value="password")CharSequence password){
        authManager.login(username, password);
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setToken("asdasd");
    //    return loginResponse;
        return new ResponseEntity<LoginResponse>(loginResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/create_user")
    public  ResponseEntity<LoginResponse> createUser(HttpServletResponse response){
        return new ResponseEntity<LoginResponse>(new LoginResponse() ,HttpStatus.OK);
//        response.setContentType("application/json");
//        LoginResponse loginResponse = new LoginResponse();
////        loginResponse.setToken("asdasd");
//        System.out.print(loginResponse);
//
//        ResponseEntity<LoginResponse> kk = new ResponseEntity<>(HttpStatus.OK);
//
//        try {
//            return loginResponse.parse2String();
//        } catch (IOException e) {
//            throw new HttpClientErrorException(HttpStatus.SERVICE_UNAVAILABLE, "Output Parsing Error");
//        }
        //   return "lll";
    }
}
