package com.jarbytes.lab.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import java.io.IOException;

/**
 * Created by lordukthar on 2017-11-25.
 */
public class InLoggingInterceptor implements ContainerRequestFilter {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    /*
      private final static String REQUESTING_USER = "X-Requesting-User";
    private final static String PROMO_HEADER = "X-PROMO-Client-Id";

     */


    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        log.info("jl input");/*
         String uriPath = request.getRequestUri().getPath();
        String header = request.getHeaderValue(PROMO_HEADER);
        String requestingUser = request.getHeaderValue(REQUESTING_USER);
        String errMsg;

        log.info("Path:" + uriPath + " User: " + requestingUser + " Header:" + header);

        if (header != null && requestingUser != null) {
            if (this.validateHeader(header)) {
                return request;
            }
            errMsg = "User cannot access the resource. Client header " + header + " is wrong when accessing:" + uriPath;
        } else {
            errMsg = "User cannot access the resource. . At least one header was not specified when accessing: " + uriPath +
                    " X-PROMO-Client-Id = " + header + " :X-Requesting-User = " + requestingUser;

        }
        throw new UnAuthorizedException(errMsg);*/
    }

    /*
    private Boolean validateHeader(String header){
        return CLIENT_HEADERS.contains(header);
    }
     */
}