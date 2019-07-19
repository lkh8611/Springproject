package com.example.demo.controller;

import com.example.demo.repository.SessionScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;


@Controller
public class UsingSessionTestController {

    @Autowired
    SessionScope sessionScope;


    //@RequestMapping(path="/session-test", produces="text/plain")
    @ResponseBody
    @GetMapping("/session-test")
    public String sessionTest(HttpSession session)
    {
        session.setAttribute("test", "hello");
        return (String)session.getAttribute("test");
    }

    //@RequestMapping(path = "/redis-set", produces = "text/plain")
    @ResponseBody
    @GetMapping("/seSet")
    public String seSet() throws UnsupportedOperationException
    {
        sessionScope.setMsg("Hi");
        sessionScope.setDate(new Date());
        return "SET session";
    }

    @ResponseBody
    @GetMapping("/seGet")
    public String seGet()
    {
        return sessionScope.toString();
    }
}
