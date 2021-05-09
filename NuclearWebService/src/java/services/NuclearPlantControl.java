/**
 *
 * @author Gabriel Denys (17223857), Teresa Flaherty (17017157), Raymond Mc Creesh (15211428), Eoghan O'Connor(16110625) 
 *
 * 
 * Provides functions to control the Nuclear power plant Cores and reactors.
 * 
 * The class as well as all functions have been set up with the appropriate tags to create a SOAP Web Service with 
 * seven operations and Web Parameters for each. This setup allows an appropriate WSDL file to be generated for the
 * service, which the ClientInterface then uses to interact with the deployed service.
 * 
 */
package services;

import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "NuclearPlantControl")
public class NuclearPlantControl {
    
    int Core1 = 1; 
    int Core2 = 1;
    int Core3 = 1;
    int Reactor1 = 9;
    int Reactor2 = 9;
    int Reactor3 = 9;

    
    /**
     * Web Service operation turns a core on or off
     * 
     * @param coreID the ID of the Core being turned on or off
     * @param onOff the power setting to change the Core to
     */
    @WebMethod(operationName = "turnCoreOnOff")
    @Oneway  // Signifies the operation returns nothing
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

    
    /**
     * Web Service operation to dump all reactor cores
     * 
     * @return the message that all cores have been dumped
     */
    @WebMethod(operationName = "dumpAllCores")
    public String dumpAllCores() {
        Core1 = 0;
        Core2 = 0;
        Core3 = 0;
               
        String message = "All cores dumped";
        return  message;
    }

    
    /**
     * Web Service operation to restart all Cores and Reactors
     * 
     * @return the message that all Cores and Reactors have been restarted
     */
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

    
    /**
     * Web Service operation to cause a meltdown
     * 
     * @return the message that the meltdown has been initiated
     */
    @WebMethod(operationName = "meltdownAll")
    public String meltdownAll() {
        Core1 = 11;
        Core2 = 11;
        Core3 = 11;
        
        String message = "Meltdown imminent! Enjoy the rest of your day";
        return  message;
    }

    
    /**
     * Web Service operation to pull out reactor rods
     * 
     * @param reactorID the Reactor whose control rods are being pulled
     * @param amountToPullOut the number of control rods to pull out of the Reactor
     * 
     * @return the number of control rods remaining in the reactor
     */
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

    
    /**
     * Web Service operation to get the plant status
     * 
     * @param requestedData the type of Plant Data being requested
     * 
     * @return a String representation of the requested data
     */
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


    /**
     * Web Service operation to write noise to the ReactorObj object
     * 
     * @param reactorInfo the Reactor being modified
     * 
     * @return the manipulated ReactorObj object
     */
    @WebMethod(operationName = "getReactorInfo")
    public ReactorObj getReactorInfo(@WebParam(name = "reactorInfo") ReactorObj reactorInfo) {
        int x =  (int)(Math.random() * 10000);
        reactorInfo.setKey(x);
        reactorInfo.setSector("zxuehnm");
        
        return reactorInfo;
    }
}
