package com.webdemo.controller;

import com.webdemo.service.HostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/host")
public class HostController {

    private static final Logger logger = LoggerFactory.getLogger(HostController.class);

    @Autowired
    private HostService hostService;

    @RequestMapping(value = "/getInformation", method = RequestMethod.GET)
    public ResponseEntity<String> getAll() {
        logger.info("getting host information");
        String response = this.hostService.getHostInformation();
        logger.info("responding : " + response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
