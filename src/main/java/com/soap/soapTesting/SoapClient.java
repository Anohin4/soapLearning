package com.soap.soapTesting;

import com.siebel.customui.SomeServiceInput;
import com.siebel.customui.SomeServiceOutput;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapClient extends WebServiceGatewaySupport {

  public SomeServiceOutput getOutput(SomeServiceInput request) {
    String mockUri = "http://localhost:8083/mock";
    SomeServiceOutput response = (SomeServiceOutput) getWebServiceTemplate()
        .marshalSendAndReceive(mockUri, request, new SoapActionCallback("test_callback"));
    return response;
  }

}
