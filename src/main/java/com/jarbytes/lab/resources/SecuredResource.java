package com.jarbytes.lab.resources;

import com.jarbytes.lab.auth.annotation.AuthRequired;
import com.jarbytes.lab.beans.Privilege;
import com.jarbytes.lab.beans.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/secured")
public class SecuredResource
{

    Logger log = LoggerFactory.getLogger("SecuredResource");
    @POST
    @Path("/user")
    public String doUserAction(@AuthRequired User user)
    {
        log.info("YEYYSYYSY");
        return "This is user action executed by: " + user.getUsername();
    }

    @POST
    @Path("/moderator")
    public String doModeratorAction(@AuthRequired(Privilege.MODERATOR) User user)
    {
        return "This is moderator action executed by: " + user.getUsername();
    }

    @POST
    @Path("/administrator")
    public String doAdministratorAction(@AuthRequired(Privilege.ADMINISTRATOR) User user)
    {
        return "This is administrator action executed by: " + user.getUsername();
    }
}