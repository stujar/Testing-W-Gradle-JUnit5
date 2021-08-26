package com.nordico.controllers;

import com.nordico.exceptionhandlers.ValueNotFoundException;

public class IndexController {

    public String index(){
        return "index";
    }

    public String oupsHandler() throws ValueNotFoundException {
        throw new ValueNotFoundException();
    }


}
