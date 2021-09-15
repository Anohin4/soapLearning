package com.soap.soapTesting.controller;

import com.siebel.customui.SomeServiceInput;
import com.siebel.customui.SomeServiceOutput;
import com.soap.soapTesting.SoapClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  final SoapClient client;

  public Controller(SoapClient client) {
    this.client = client;
  }

  @PostMapping("/post")
  public ResponseEntity takeInput(@RequestBody SomeServiceInput request) {
    SomeServiceOutput response = client.getOutput(request);
    return ResponseEntity.status(200)
        .body(response);
  }
}
