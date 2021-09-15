package com.soap.soapTesting.config;

import com.siebel.customui.SomeServiceInput;
import com.siebel.customui.SomeServiceOutput;
import com.soap.soapTesting.SoapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class Config {
  @Bean
  public Jaxb2Marshaller marshaller() {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    marshaller.setClassesToBeBound(SomeServiceInput.class, SomeServiceOutput.class);
    return marshaller;
  }

  @Bean
  public SoapClient countryClient(Jaxb2Marshaller marshaller) {
    SoapClient client = new SoapClient();
    client.setDefaultUri("http://localhost:8083/mock");
    client.setMarshaller(marshaller);
    client.setUnmarshaller(marshaller);
    return client;
  }

}
