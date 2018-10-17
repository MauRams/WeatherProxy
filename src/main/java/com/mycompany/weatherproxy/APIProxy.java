/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weatherproxy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;



/**
 *
 * @author Maurice
 */
@Path("/weather")
public class APIProxy {
    @GET
    @Path("/{param}")
    public Response GetWeather(@QueryParam("city") String city, @PathParam("key")String key){
        key = "854d8956603ab7dd275d8b29147913ac";
        String URL= "http://api.openweathermap.org/data/2.5/forecast?q="+city+"&mode=json&appid="+key;
        System.out.println("com.mycompany.weatherproxy.APIProxy.Get()");
        System.out.println(city);
        Client c = ClientBuilder.newClient();
        Response r = c.target(URL).request().get();
        return r;
    }
    
}