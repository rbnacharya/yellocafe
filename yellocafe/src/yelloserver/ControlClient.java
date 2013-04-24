package yelloserver;

import java.rmi.RemoteException;

import yelloclient.ClientComputer;

public interface ControlClient extends java.rmi.Remote{
	public boolean EnableInternet(ClientComputer hostname) throws RemoteException;
	public boolean DisableInternet(ClientComputer hostname) throws RemoteException;
	public void AddListener(ClientComputer di)throws RemoteException;
	public void RemoveListener(ClientComputer di)throws RemoteException;
	
	

}
