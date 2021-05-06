/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

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

    /**
     * Web service operation
     */
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

    /**
     * Web service operation
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
     * Web service operation
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
     * Web service operation
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
     * Web service operation
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
     * Web service operation
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
     * Web service operation
     */
    @WebMethod(operationName = "getReactorInfo")
    public Reactor getReactorInfo(@WebParam(name = "reactorInfo") Reactor reactorInfo) {
        //TODO write your implementation code here:
        return null;
    }
}
