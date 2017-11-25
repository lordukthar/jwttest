package com.jarbytes.lab.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Created by lordukthar on 2017-11-25.
 */
public class OutLoggingInterceptor implements ContainerResponseFilter {

    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        log.info("filter");
    }
}