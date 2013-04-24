package yelloserver;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;
import serverui.ServerUIMain;
public class YelloServer {
	public static ServerUIMain servermain;
	public YelloServer(ServerUIMain abe){
            servermain=abe;
            Mains();
	}
        public YelloServer(){
            
        }
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		
		YelloServer ys=new YelloServer();
		ys.Mains();
		
	}
	public static ControlClient stub ;
	public void Mains(){
		// Security manager
		if (System.getSecurityManager() == null) {
		    System.setSecurityManager(new SecurityManager());
		}
		// Security manager
		try {
			System.setProperty("java.rmi.server.hostname", "7.217.164.255");

			stub = new ControlClientImpl();
			String registry="192.168.11.36";
			String registration="rmi://localhost/RmiServer";
			Remote obj=UnicastRemoteObject.exportObject(stub,1040);
			Registry r=LocateRegistry.createRegistry(1040);
			r.bind(registration,obj);
			
			Vector v1=new Vector();
			
			System.out.println("Object is registered");
			System.out.println("Now Server is Waiting for client");
			System.gc();
			
			
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}

	}

}
