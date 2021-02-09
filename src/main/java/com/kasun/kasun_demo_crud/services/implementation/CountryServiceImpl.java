package com.kasun.kasun_demo_crud.services.implementation;

import com.kasun.kasun_demo_crud.services.CountryServices;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryServices {

    @Override
    public String findAllCountries() {
        //Database Search
        //All Countries
        return "Return All Countries";
    }
}
