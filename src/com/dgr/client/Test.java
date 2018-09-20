package com.dgr.client;

import java.rmi.RemoteException;

import com.dgr.webservice.HelloService;
import com.dgr.webservice.HelloServiceProxy;

public class Test {
	public static void main(String[] args) throws RemoteException {
		HelloServiceProxy helloPxy = new HelloServiceProxy();
		HelloService service = helloPxy.getHelloService();
		String str = service.say("Calling webservice method");
		System.out.println(str);
	}
}
