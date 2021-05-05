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
}

