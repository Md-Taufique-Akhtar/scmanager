package com.scmanager.controllers;

import org.springframework.web.bind.annotation.RequestMethod;

public @interface RequestMappring {

    String value();

    RequestMethod method();

}
