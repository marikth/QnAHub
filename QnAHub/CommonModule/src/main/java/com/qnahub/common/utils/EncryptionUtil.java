package com.qnahub.common.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;

/**
 * Created by markth on 10/23/2016.
 */
public class EncryptionUtil {

    public static String encode(CharSequence str){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(str);
    }

    public static boolean matchEncoded(String encodedData, CharSequence rawData){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(rawData, encodedData);
    }

    public static String generateHash(CharSequence str){

        return encode(str + LocalDateTime.now().toString());
    }
}
