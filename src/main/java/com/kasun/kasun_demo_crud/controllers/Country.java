package com.kasun.kasun_demo_crud.controllers;

import com.kasun.kasun_demo_crud.services.CountryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class Country {

    @Autowired
    private CountryServices countryServices;

    @GetMapping("/all")
    public String allCountries(){

       return countryServices.findAllCountries();
    }
}
