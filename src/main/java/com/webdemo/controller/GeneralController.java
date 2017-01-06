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
import org.springframework.web.context.request.RequestContextHolder;

@RestController
@RequestMapping("/rest/general")
public class GeneralController {

    private static final Logger logger = LoggerFactory.getLogger(GeneralController.class);
    private static final String ERROR = "ERROR";
    private static int count = 1;

    @RequestMapping(value = "/host", method = RequestMethod.GET)
    public ResponseEntity<String> getAll() {
        logger.info("getting host information");
        try {
            return new ResponseEntity<>("Hostname: [" + InetAddress.getLocalHost().getHostName() + "] - SessionId: [" + RequestContextHolder.currentRequestAttributes().getSessionId() + "] - Count: [" + count++ + "]\n", HttpStatus.OK);
        } catch (UnknownHostException e) {
            return new ResponseEntity<>(ERROR, HttpStatus.OK);
        }
    }

}
