/**
 *
 * @author Gabriel Denys (17223857), Teresa Flaherty (17017157), Raymond Mc Creesh (15211428), Eoghan O'Connor(16110625) 
 *
 * The purpose of this program is to create a client interface which allows the automated execution
 * of a SOAP based web service.
 * 
 * The client interface is a jFrame.
 * There is only one button which triggers the whole sequence.
 * All the data is displayed within a jTextPanel
 */
package services;

import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.Random;

/**
 *
 * @author teresaflaherty
 */
@WebService(serviceName = "NuclearPlantControl")
public class NuclearPlantControl {
    
    int Core1 = 1; 
    int Core2 = 1;
    int Core3 = 1;
    int Reactor1 = 9;
    int Reactor2 = 9;
    int Reactor3 = 9;

    //Web service function turns a core on or off
    //takes a (int) core ID and (int) onOff
    @WebMethod(operationName = "turnCoreOnOff")
    @Oneway
    public void turnCoreOnOff(@WebParam(name = "coreID") int coreID, @WebParam(name = "onOff") int onOff) {
        switch (coreID) {
            case 0:
                Core1 = onOff;
                break;
            case 1:
                Core2 = onOff;
                break;
            case 2:
                Core3 = onOff;
                break;
        }  
    }

    // Web Service function to dump all reactor cores
    // returns a string
    @WebMethod(operationName = "dumpAllCores")
    public String dumpAllCores() {
        Core1 = 0;
        Core2 = 0;
        Core3 = 0;
               
        String message = "All cores dumped";
        return  message;
    }

    // Web Service function to restart all cores & reactors
    // returns a string
    @WebMethod(operationName = "restartAll")
    public String restartAll() {
        Core1 = 1;
        Core2 = 1;
        Core3 = 1;
        Reactor1 = 9;
        Reactor2 = 9;
        Reactor3 = 9;
        
        String message = "All cores & reactors restarted";
        return  message;
    }

    // Web Service function to cause a meltdown
    // returns a string
    @WebMethod(operationName = "meltdownAll")
    public String meltdownAll() {
        Core1 = 11;
        Core2 = 11;
        Core3 = 11;
        
        String message = "Meltdown imminent! Enjoy the rest of your day";
        return  message;
    }

    // Web Service function to pull out reactor rods
    // takes two integer values 
    // returns a integer
    @WebMethod(operationName = "pullOutControlRods")
    public int pullOutControlRods(@WebParam(name = "reactorID") int reactorID, @WebParam(name = "amountToPullOut") int amountToPullOut) {
        int amountLeft = 0;
        
        switch(reactorID) {
            case 0:
                Reactor1 = Reactor1 - amountToPullOut;
                amountLeft = Reactor1;
                break;
            case 1:
                Reactor2 = Reactor2 - amountToPullOut;
                amountLeft = Reactor2;
                break;
            case 2:
                Reactor3 = Reactor3 - amountToPullOut;
                amountLeft = Reactor3;
                break;       
        }
        return amountLeft;
    }

    // Web Service function to get the plant status
    // Takes a string - either "CoreStats" or "ReactorStats"
    // returns a string
    @WebMethod(operationName = "getPlantStatus")
    public String getPlantStatus(@WebParam(name = "requestedData") String requestedData) {
        String message;
        String c1 = Integer.toString(Core1);
        String c2 = Integer.toString(Core2);
        String c3 = Integer.toString(Core3);
        
        String r1 = Integer.toString(Reactor1);
        String r2 = Integer.toString(Reactor2);
        String r3 = Integer.toString(Reactor3);
        
        if( requestedData.equals("CoreStats")){
            
           message = "Core Activity Status" + "\nCore 1 : " + c1 + "\nCore 2 : " + c2 + "\nCore 3 : " + c3 ;
         
        } else if ( requestedData.equals("ReactorStats")){
          
            message = "Reactor Activity Status" + "\n> Reactor 1 Active Rods: " + r1 + "\n> Reactor 2 Active Rods : " + r2 + "\n> Reactor 3 Active Rods : " + r3 ;
            
        } else{
            
            message = "Invalid data request";
        }
        
        return message;
    }

    // Web Service function to write noise to the reactor info object
    // takes a reactor object
    // returns a reactor object
    @WebMethod(operationName = "getReactorInfo")
    public ReactorObj getReactorInfo(@WebParam(name = "reactorInfo") ReactorObj reactorInfo) {
        //TODO write your implementation code here:
        
        int x =  (int)(Math.random() * 10000);
        reactorInfo.setKey(x);
        reactorInfo.setSector("zxuehnm");
        
        return reactorInfo;
    }
}
