package org.example.progettorestserver.web;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class MyFirstWebService {

    @WebMethod(operationName = "getHelloWorld")
    public String getHelloWorld(){
        return "hello_world!";
    }

    @WebMethod(operationName = "sommaConDue")
    public int sommaConDue(@WebParam(name="value")int value){
        return value+2;
    }
}
