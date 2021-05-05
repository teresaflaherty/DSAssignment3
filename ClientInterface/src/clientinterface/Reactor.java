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
public class Reactor {
       
       int ReactorID;
       int ReactorKey;
       String Sector;
       double temp;
       double radiation;
       double Watts;

    public Reactor(int ReactorID, int ReactorKey, String Sector) {
        this.ReactorID = ReactorID;
        this.ReactorKey = ReactorKey;
        this.Sector = Sector;
        this.temp = ReactorID * 1251684;
        this.radiation = 54984 * temp;
        this.Watts = temp * radiation;
    }

    public void setReactorID(int ReactorID){
        this.ReactorID = ReactorID;
    }
    public void setKey(int ReactorKey) {
        this.ReactorKey = ReactorKey;
    }

    public void setSector(String Sector){
        this.Sector = Sector;
    }

    public void setTemp(){

        this.temp = ReactorID * 1251684;      
    }

    public void setRads(){
        this.radiation = 54984 * temp;

    }

    public void setWatts(){
      this.Watts = temp * radiation;
    } 
    
    
    public int getReactorID(){
    return ReactorID;
    }
    public int getKey() {
       return ReactorKey;
    }

    public String getSector(){
        return Sector;
    }

    public double getTemp(){

        return temp;     
    }

    public double getRads(){
        return radiation;

    }

    public double getWatts(){
      return Watts;
    } 
}