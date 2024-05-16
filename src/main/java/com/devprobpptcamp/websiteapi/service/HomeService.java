package com.devprobpptcamp.websiteapi.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String welcome() {
        return "Welcome to Devpro Bootcamp";
    }
}
