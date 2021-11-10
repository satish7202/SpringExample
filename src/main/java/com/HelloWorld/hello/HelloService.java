package com.HelloWorld.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String Hello()
    {
        return "Hello Satish";
    }
    @RequestMapping(value = "/Home",method = RequestMethod.GET)
    public String New()
    {
        return "This Other Class";
    }

}
