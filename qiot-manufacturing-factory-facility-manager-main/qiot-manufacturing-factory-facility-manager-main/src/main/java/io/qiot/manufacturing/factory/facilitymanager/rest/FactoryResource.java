package io.qiot.manufacturing.factory.facilitymanager.rest;

import java.util.UUID;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;

import io.qiot.manufacturing.factory.facilitymanager.service.factory.SubscriptionService;

/**
 * Validation through hibernate validator:
 * https://quarkus.io/guides/validation#rest-end-point-validation
 * 
 * @author andreabattaglia
 *
 */
@Path("/factory")
public class FactoryResource {

    @Inject
    Logger LOGGER;

    @Inject
    SubscriptionService subscriptionService;


    @GET
    @Path("/helloFactory")
    public String get() {
    	return "Hellow World";
    }
    
    @GET
    @Path("/id")
    @Produces(MediaType.APPLICATION_JSON)
    public UUID getFactoryId() {
        return subscriptionService.getFactoryId();
    }
}