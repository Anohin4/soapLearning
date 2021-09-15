package com.soap.soapTesting.controller;

import com.siebel.customui.SomeServiceInput;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @PostMapping
  public void takeInput(@RequestBody SomeServiceInput someServiceInput) {
    System.out.println("zok")
  }
}
