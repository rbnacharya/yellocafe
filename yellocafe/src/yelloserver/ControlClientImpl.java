package yelloserver;

import java.rmi.RemoteException;
import java.util.Random;
import java.util.Vector;

import javax.swing.JOptionPane;
import yelloclient.ClientComputer;


public class ControlClientImpl implements ControlClient{
	private Vector<yelloclient.ClientComputer> list = new Vector();
	
	public ControlClientImpl(){
		
	}
	public boolean EnableInternet(ClientComputer host) throws RemoteException {
		String textt="";
				
		for(yelloclient.ClientComputer d: list){
			if(host.getHostNames().equals(d.getHostNames())){
						d.Enable();
						JOptionPane.showMessageDialog(null, "Internet is Enabled in :"+host.getHostNames());
										
				return true;
			}
		}
		
		return false;
	}

	public boolean DisableInternet(ClientComputer host) throws RemoteException {
		for(yelloclient.ClientComputer d: list){
			if(d.getHostNames()==host.getHostNames()){
				d.Disable();
				return true;
			}
			
		}
		return false;
	}

	
	public void AddListener(yelloclient.ClientComputer dis) throws RemoteException{
                YelloServer.servermain.addComputer(dis);
		list.add(dis);
	}

	public void RemoveListener(yelloclient.ClientComputer di) throws RemoteException {
                YelloServer.servermain.removeComputer(di);
		list.remove(di);
                
	}
	public void NotifyListener(int id,int command) throws RemoteException{
		
	
	}
	public boolean SetCommand(){
		return false;
	}
	public Vector getListener(){
		return list;
	}

   

}
