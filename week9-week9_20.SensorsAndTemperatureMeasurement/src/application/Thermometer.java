/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author ritik
 */
public class Thermometer implements Sensor {
    private boolean isOn;
   
    public Thermometer(){
        this.isOn = false;
    }
    
    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if(isOn()){
            return (int) (Math.random()*60 - 30);
        }
        throw new IllegalStateException("The thermometer is off");
    }
    
}
