/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Graphics;
import model.CarTraffic;
import model.LightTraffic;
import view.LoadImage;

/**
 *
 * @author bukanjoker
 */
public class Manager 
{
    private LightTraffic[] trafficLights;
    private CarTraffic[] trafficCars;
    private int val = 0; 
    private double t = 0;

    public Manager() {
    }
    
    public void init()
    {
        //insert 4 traffic light (red, yellow, green)
        trafficLights = new LightTraffic[4];
        
        trafficLights[0] = new LightTraffic("bottom");
        trafficLights[0].setTime(1, 1, 3);
        
        trafficLights[1] = new LightTraffic("up");
        trafficLights[1].setTime(1, 1, 4);
        
        trafficLights[2] = new LightTraffic("right");
        trafficLights[2].setTime(1, 1, 5);
        
        trafficLights[3] = new LightTraffic("left");
        trafficLights[3].setTime(1, 1, 6);
        
        LoadImage.init();
    }
    
    public void tick()
    {
        //lights
        if (val < 4) {
            if (trafficLights[val].getTime() > t) {
                trafficLights[val].tick(); 
                t++;
            }
            else {
                val++;
                t = 0;
            }
        }
        else {
            val = 0;
        }
    }
    
    public void render(Graphics g)
    {
        //draw background
        g.drawImage(LoadImage.background, 0, 0, null);
        
        //draw cars
//        for (int i = 0; i < cars.length; i++) {
//            cars[i].render(g);
//        }
        
        //draw traffic light
//        for (int i = 0; i < trafficLights.length; i++) {
//            trafficLights[i].render(g);
//        }
    }
}
