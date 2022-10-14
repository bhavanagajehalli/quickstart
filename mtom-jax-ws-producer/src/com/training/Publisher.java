package com.training;

import javax.xml.ws.Endpoint;

import com.training.service.ImagaeProcessingImpl;



public class Publisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9000/images", new ImagaeProcessingImpl());
		System.out.println("Image Service Started");
	}

}
