package com.webdemo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/general")
public class GeneralController {

	private static final Logger logger = LoggerFactory.getLogger(GeneralController.class);

	@RequestMapping(value = "/hostname", method = RequestMethod.GET)
	public ResponseEntity<String> getAll() {
		logger.info("get hostname");
		try {
			return new ResponseEntity<String>(InetAddress.getLocalHost().getHostName(), HttpStatus.OK);
		} catch (UnknownHostException e) {
			return new ResponseEntity<String>("UNKNOW", HttpStatus.OK);
		}
	}

}
