package com.qnahub.data_managers.rest_api.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qnahub.common.api.SuperResponse;

import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by markth on 10/30/2016.
 */
public class SuperRestResponse extends SuperResponse {
    @Override
    public String parse2String() throws IOException {
        StringWriter stringWriter = new StringWriter();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(stringWriter, this);
        return stringWriter.toString();
    }
}
