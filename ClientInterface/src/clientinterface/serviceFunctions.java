/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientinterface;

/**
 *
 * @author Ray
 */
public class serviceFunctions {
    
int Core1 = 1; 
int Core2 = 1;
int Core3 = 1;
int Reactor1 = 9;
int Reactor2 = 9;
int Reactor3 = 9;
    
    public void TurnCoreOffOn(int CoreID, int OnOff){
        
                switch (CoreID) {
            case 0:
                Core1 = OnOff;
                break;
            case 1:
                Core2 = OnOff;
                break;
            case 2:
                Core3 = OnOff;
                break;
                }    
    }
                
    public String DumpAllCores(){
        
        Core1 = 0;
        Core2 = 0;
        Core3 = 0;
               
        String message = "All cores dumped";
        return  message;
    }
    
        public String RestartAll(){
        
        Core1 = 1;
        Core2 = 1;
        Core3 = 1;
        
        String message = "All cores restarted";
        return  message;
    }
        
        public String MeltdownAll(){
        
        Core1 = 11;
        Core2 = 11;
        Core3 = 11;
        
        String message = "Meltdown imminent! Enjoy the rest of your day";
        return  message;
    }
        
    public int PullOutControlRods(int ReactorID, int amountToPullOut){
        
        int amountLeft = 0;
        
        switch(ReactorID){
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
    
    public String getPlantStatus(String requestedData){
        
        String message;
        String c1 = Integer.toString(Core1);
        String c2 = Integer.toString(Core2);
        String c3 = Integer.toString(Core3);
        
        String r1 = Integer.toString(Reactor1);
        String r2 = Integer.toString(Reactor2);
        String r3 = Integer.toString(Reactor3);
        
        if( requestedData == "CoreStats"){
            
           message = "Core Activity Status" + "\nCore 1 : " + c1 + "\nCore 2 : " + c2 + "\nCore 3 : " + c3 ;
         
        } else if ( requestedData == "ReactorStats"){
          
            message = "Reactor Activity Status" + "\nReactor 1 Active Rods: " + r1 + "\nReactor 2 Active Rods : " + r2 + "\nReactor 3 Active Rods : " + r3 ;
            
        } else{
            
            message = "Invalid data request";
        }
        
        return message;
    }
}

