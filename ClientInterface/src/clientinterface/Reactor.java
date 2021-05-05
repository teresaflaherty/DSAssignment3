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

    public Reactor(int ReactorID) {
        this.ReactorID = ReactorID;
        this.ReactorKey = ReactorKey;
        this.Sector = Sector;
        this.temp = ReactorID * 1251684;
        this.radiation = 54984 * temp;
    }

    public void key(int ReactorKey) {
        this.ReactorKey = ReactorKey;

    }

    public void sector(String Sector){
        this.Sector = Sector;
    }

    public void temp(){

        this.temp = ReactorID * 1251684;      
    }

    public void rads(){
        this.radiation = 54984 * temp;

    }

    public void Watts(){
      this.Watts = temp * radiation;
    } 
}