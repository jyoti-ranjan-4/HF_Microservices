package io.qiot.manufacturing.factory.productline.rest;

import java.util.UUID;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;

import io.qiot.manufacturing.all.commons.domain.productline.ProductLineDTO;
import io.qiot.manufacturing.factory.productline.service.productline.ProductLineService;

/**
 * @author andreabattaglia
 *
 */
@Path("productline/service")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.APPLICATION_JSON)
public class ServiceProductLineResource {

    @Inject
    Logger LOGGER;

    @Inject
    ProductLineService productLineService;
    
    @GET
    @Path("/helloSPR")
    public String getSPR() {
        // LOGGER.debug(
        // "Handling request for station id #{} and timezone offset {}",
        // stationId, timezoneOffset);
        return "Inside Dummy API";
    }

//    @GET
//    @Path("/")
//    public List<ProductLineDTO> getAllProductLines() {
//        // LOGGER.debug(
//        // "Handling request for station id #{} and timezone offset {}",
//        // stationId, timezoneOffset);
//        return productLineService.getAllServiceProductLines();
//    }

    @GET
    @Path("/id/{id}")
    public ProductLineDTO getProductLineById(@PathParam("id") UUID id) {
        // LOGGER.debug(
        // "Handling request for station id #{} and timezone offset {}",
        // stationId, timezoneOffset);
        return productLineService.getServiceProductLineById(id);
    }

//    @GET
//    @Path("/last")
//    public ProductLineDTO getLastProductLine() {
//        // LOGGER.debug(
//        // "Handling request for station id #{} and timezone offset {}",
//        // stationId, timezoneOffset);
//        return productLineService.getLatestServiceProductLine();
//    }
}