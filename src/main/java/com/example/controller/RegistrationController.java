package com.example.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.RegisterModel;
import com.example.service.RegisterService;
import com.example.serviceImpl.RegisterServiceImpl;

@RestController
public class RegistrationController {

	@Autowired
	RegisterServiceImpl registerServiceImpl;
	
	@RequestMapping(value="/Register", method = RequestMethod.POST)
	@Consumes("application/json")
	public Response register(@RequestBody RegisterModel data) {
		System.out.println("Data is : "+data.getName() + data.getRegId());
//		JSONObject jsonObject = new JSONObject(data);
//		System.out.println("Json data is : "+jsonObject);
		registerServiceImpl.register(data);
		return Response.status(201).entity("successfully created").build();
	}
}
