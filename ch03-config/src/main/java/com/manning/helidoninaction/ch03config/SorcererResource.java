package com.manning.helidoninaction.ch03config;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.json.JsonObject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/sorcerer")
@RequestScoped
public class SorcererResource {

    private SorcererBean sorcererBean;

    @Inject
    public SorcererResource(SorcererBean sorcererBean) {
        this.sorcererBean = sorcererBean;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getJsonOrc() {
        return sorcererBean.toJson();
    }
}
