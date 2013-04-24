package yelloserver;

import java.rmi.RemoteException;

public class HelloIMPL implements Hello {

	public HelloIMPL() throws RemoteException {
		super();

	}

	// Definition of Remote method
	public String SayHello() throws RemoteException {
		return "Hello World";
	}
	public void PrintOutPut(String in) throws RemoteException{
		System.out.println("Client"+in);
	}

}
