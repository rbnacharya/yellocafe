package yelloclient;

import java.rmi.RemoteException;


public interface ClientComputer extends java.rmi.Remote{
	public String getHostNames() throws RemoteException;
	public boolean Disable() throws RemoteException;
	public boolean Enable() throws RemoteException;
	public boolean Check() throws RemoteException;

}
