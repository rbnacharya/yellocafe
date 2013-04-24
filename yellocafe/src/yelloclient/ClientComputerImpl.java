package yelloclient;

import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class ClientComputerImpl  implements ClientComputer {
	private String host_name;
	public double host_id;
	public ClientComputerImpl() throws RemoteException{
		try{
			host_name=java.net.InetAddress.getLocalHost().getHostName();
		}
		catch(UnknownHostException e){
			System.out.println("Error:"+e.getMessage());
			
		}
		
	}
	public boolean Enable(){
		try{
		System.out.println("internet is Enabled");
		return true;
	}
		catch(Exception ex){
			return false;
	}
		

	}
	public boolean Disable(){
		System.out.println("internet is disabled");
		return false;
	}
	public boolean Check(){
		System.out.println("internet is checked");
		try{
			URL url=new URL("http://google.com");
			URLConnection con=url.openConnection();
			return true;
		}
		catch(Exception e){
			return false;
			
		}
	}
	public String getHostNames(){
		return host_name;
	}
	
}	

