/**
 *
 * @author Gabriel Denys (17223857), Teresa Flaherty (17017157), Raymond Mc Creesh (15211428), Eoghan O'Connor(16110625) 
 *
 * The purpose of this program is to create a Reactor object for the web service to interact with
 * 
 * The Reactor class has attributes int:reactorID,ReactorKey  String:Sector  double:temp,radiation,watts
 * Each attribute has getter and setter methods
 */
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
    
    // Reactor object constructor
    // takes two int value and a string
    public ReactorObj(int ReactorID, int ReactorKey, String Sector) {
        this.ReactorID = ReactorID;
        this.ReactorKey = ReactorKey;
        this.Sector = Sector;
        this.temp = ReactorID * 1251684;
        this.radiation = 54984 * temp;
        this.Watts = temp * radiation;
    }
    
    
    /**
     * Set a new value for the ReactorID
     * 
     * @param ReactorID the new ReactorID value
     */
    public void setReactorID(int ReactorID){
        this.ReactorID = ReactorID;
    }
    
    
    /**
     * Set a new value for the ReactorKey
     * 
     * @param ReactorKey the new ReactorKey value
     */
    public void setKey(int ReactorKey) {
        this.ReactorKey = ReactorKey;
    }
    
    
    /**
     * Set a new value for the Reactor Sector
     * 
     * @param Sector the new Sector value
     */
    public void setSector(String Sector){
        this.Sector = Sector;
    }
    
    
    /**
     * Set a new value for the Temperature
     */
    public void setTemp(){
        this.temp = ReactorID * 1251684;      
    }
    
    
    /**
     * Set a new value for the Radiation Level
     */
    public void setRads(){
        this.radiation = 54984 * temp;
    }
    
    /**
     * Set a new value for the Power Output
     */
    public void setWatts(){
        this.Watts = temp * radiation;
    } 
    
    
    /**
     * Get the value of the ReactorID
     *
     * @return the Reactor's ID
     */
    public int getReactorID(){
        return ReactorID;
    }
    
    
    /**
     * Get the value of the ReactorKey
     *
     * @return the Reactor's Key
     */
    public int getKey() {
        return ReactorKey;
    }
    
    
    /**
     * Get the value of the Reactor Sector
     *
     * @return the Reactor's Sector
     */
    public String getSector(){
        return Sector;
    }
    
    
    /**
     * Get the value of the Temperature
     *
     * @return the Reactor's Temperature
     */
    public double getTemp(){
        return temp;     
    }
    
    
    /**
     * Get the value of the Reactor's Radiation Level
     *
     * @return the Reactor's Radiation Level
     */
    public double getRads(){
        return radiation;
    }
    
    
    /**
     * Get the value of the Reactor's Power Output
     *
     * @return the Reactor's Power Output
     */
    public double getWatts(){
        return Watts;
    } 
}
