package com.webdemo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webdemo.entity.Data;
import com.webdemo.repository.DataRepository;

@RestController
@RequestMapping("/rest/data")
public class DataController {

	private static final Logger logger = LoggerFactory.getLogger(DataController.class);

	@Autowired
	private DataRepository userRepository;

	@RequestMapping(value = "/generateRandonData", method = RequestMethod.GET)
	public ResponseEntity<Data> generateRandonUser() {
		Data newData = new Data();
		newData.setDataCreation(System.nanoTime());
		try {
			newData.setHostname(InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e) {
			newData.setHostname("UNKNOW");
		}
		Data data = this.userRepository.save(newData);

		logger.info("Data created:" + data);
		return new ResponseEntity<Data>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<List<Data>> getAll() {
		logger.info("get all datas requested");
		return new ResponseEntity<List<Data>>(this.userRepository.findAll(), HttpStatus.OK);
	}

}
