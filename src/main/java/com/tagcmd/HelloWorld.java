package com.tagcmd;

/**
 * Hello world!
 *
 */

import static spark.Spark.*;
import spark.*;

public class HelloWorld {

   public static void main(String[] args) {
      
	  setPort(9000);
	   
      get(new Route("/hello") {
         @Override
         public Object handle(Request request, Response response) {
            return "Hello World!";
         }
      });
      
      
      post(new Route("/hello") {
    	  @Override
    	  	public Object handle(Request request, Response response) {
            response.status(200);
    		  	System.out.println(request.contentType());
    		  	System.out.println("=====================");
    		  	System.out.println(request.body());
    		  	System.out.println("xxxxxxxxxxxxxxxxxxxxx");
            System.out.println(request.url());
    		  	
    	    	return request.body();
    	    }
    	 });
      
      
      post(new Route("/goodbye") {
    	  @Override
    	  	public Object handle(Request request, Response response) {
    		  	System.out.println(request.body());
    	    	return request.body();
    	    }
    	 });

      
   }

}