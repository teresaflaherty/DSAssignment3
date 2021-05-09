//
//
//
//
package services;

public class ReactorObj {
    int ReactorID;
    int ReactorKey;
    String Sector;
    double temp;
    double radiation;
    double Watts;

    // Reactor object constructor
    public ReactorObj() {

    }
    
    // Reactor object constructor function
    // takes two int value and a string
    public ReactorObj(int ReactorID, int ReactorKey, String Sector) {
        this.ReactorID = ReactorID;
        this.ReactorKey = ReactorKey;
        this.Sector = Sector;
        this.temp = ReactorID * 1251684;
        this.radiation = 54984 * temp;
        this.Watts = temp * radiation;
    }
    // Reactor ID setter function
    // take int value
    public void setReactorID(int ReactorID){
        this.ReactorID = ReactorID;
    }
    // Reactor key setter function
    // take int value
    public void setKey(int ReactorKey) {
        this.ReactorKey = ReactorKey;
    }
    // Reactor sector setter function
    // take String value
    public void setSector(String Sector){
        this.Sector = Sector;
    }
    // Reactor temperature setter function
    public void setTemp(){
        this.temp = ReactorID * 1251684;      
    }
    // Reactor Radiation setter function
    public void setRads(){
        this.radiation = 54984 * temp;
    }
    // Reactor Watts setter function
    public void setWatts(){
        this.Watts = temp * radiation;
    } 
    // Reactor ID getter function
    // returns int
    public int getReactorID(){
        return ReactorID;
    }
    // Reactor key getter function
    // returns int    
    public int getKey() {
        return ReactorKey;
    }
    // Reactor sector getter function
    // returns string
    public String getSector(){
        return Sector;
    }
    // Reactor temperature getter function
    // returns int
    public double getTemp(){
        return temp;     
    }
    // Reactor radiation getter function
    // returns int
    public double getRads(){
        return radiation;
    }
    // Reactor watts getter function
    // returns int
    public double getWatts(){
        return Watts;
    } 
}
