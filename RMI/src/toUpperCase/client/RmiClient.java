package toUpperCase.client;

import toUpperCase.shared.UpperCaseServer;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {

    private  UpperCaseServer server;

    public RmiClient() {
    }

    public void startClient() throws RemoteException, NotBoundException {
        Registry registry =  LocateRegistry.getRegistry("localhost", 1099);
        server = (UpperCaseServer)registry.lookup("Server");
    }

    public String toUpperCase(String argument) {
        String result = null;
        try {
            result = server.toUpperCase(argument);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return result;
    }


}
