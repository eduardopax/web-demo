package com.webdemo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;

import java.net.InetAddress;

@Service
public class HostService {

    private static int count = 1;
    private static final String ERROR = "ERROR";

    public String getHostInformation() {
        try {
            return "Hostname: [" + InetAddress.getLocalHost().getHostName() + "] - SessionId: [" + RequestContextHolder.currentRequestAttributes().getSessionId() + "] - Count: [" + count++ + "]\n";
        } catch (Exception ex) {
            return ERROR;
        }
    }
}
