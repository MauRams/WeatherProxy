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
 * @author Arezki
 */
@Path("/w")
public class Proxy {
    @GET
    @Path("/{city}")
    
    // try in your local hot: http://localhost:49000/api/w/paris
    public Response GetWeather(@PathParam("city") String city){
        String key = "854d8956603ab7dd275d8b29147913ac";
        String URL="http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=fa859e6383804088539dfe06a49a5832";
  
        System.out.println(" The link is  "+URL);
        Client c = ClientBuilder.newClient();
        Response r = c.target(URL).request().get();
        return r;
    }

}