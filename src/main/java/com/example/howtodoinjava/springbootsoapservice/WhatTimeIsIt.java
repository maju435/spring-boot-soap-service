package com.example.howtodoinjava.springbootsoapservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Date;

@Endpoint
public class WhatTimeIsIt {
	private static final String NAMESPACE_URI = "http://www.howtodoinjava.com/xml/school";

	private Date timeRepository;

	@Autowired
	public WhatTimeIsIt() {
		this.timeRepository = new Date();
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "TimeRequest")
	@ResponsePayload
	public Date getTimeRepository() {
		return timeRepository;
	}
}