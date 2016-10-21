package com.qnahub.services.rest_api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by markth on 10/20/2016.
 */

@RestController("rest")
public class LoginService {

    @RequestMapping(value = "/authentication", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> authentication(){



        return new ResponseEntity<String>(new String("aaa"), HttpStatus.OK);
    }
}
