package yelloserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote{
	public String SayHello() throws RemoteException;
	public void PrintOutPut(String inp) throws RemoteException;
}
