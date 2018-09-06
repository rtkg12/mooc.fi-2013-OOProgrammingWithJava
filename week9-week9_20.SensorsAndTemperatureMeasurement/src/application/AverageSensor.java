/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.*;
/**
 *
 * @author ritik
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
            public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor newSensor){
        this.sensors.add(newSensor);
    }
    
    @Override
    public boolean isOn() {
        for(Sensor sensor:this.sensors){
            if(!sensor.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor sensor:this.sensors){
            sensor.on();
        }
    }

    @Override
    public void off() {
        for(Sensor sensor:this.sensors){
            sensor.off();
        }
    }

    @Override
    public int measure() {
        int total=0;
        for(Sensor sensor: this.sensors){
            total+=sensor.measure();
        }
        int average = (int)(total/(this.sensors.size()));
        this.readings.add(average);
        return average;
    }
    
    public List<Integer> readings(){
        
        
        return this.readings;
    }
    
    
}
