/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Graphics;

/**
 *
 * @author bukanjoker
 */
public class LightTraffic 
{
    private Bulb[] led;
    private int posisiX, posisiY;
    private String posisi;
    
    public LightTraffic() {
    }
    
    public LightTraffic(String posisi)
    {
        this.posisi = posisi;
        init();
        aturPosisi();
    }
    
    public void init()
    {
        led = new Bulb[3];
        led[0] = new Bulb("red");
        led[1] = new Bulb("yellow");
        led[2] = new Bulb("green");
    }
    
    public void tick()
    {
        
    }
    
    public void render(Graphics g)
    {
        led[0].render(g);
        led[1].render(g);
        led[2].render(g);
    }

    public void setTime(double merah, double kuning, double hijau) {
        led[0].setTime(merah);
        led[1].setTime(kuning);
        led[2].setTime(hijau);
    }
    
    public double getTime() {
        double time = led[0].getTime()+led[1].getTime()+led[2].getTime();
        return time;
    }
    
    public void aturPosisi() {
        int jarak = 34;
        
        if (this.posisi == "up") {
            this.posisiX = 411;
            this.posisiY = 168;
            
            led[0].setPosisiY(posisiY);
            led[1].setPosisiY(posisiY-jarak);
            led[2].setPosisiY(posisiY-jarak-jarak);
            
            led[0].setPosisiX(posisiX);
            led[1].setPosisiX(posisiX);
            led[2].setPosisiX(posisiX);
        }
        if (this.posisi == "bottom") {
            this.posisiX = 163;
            this.posisiY = 401;
            
            led[0].setPosisiY(posisiY);
            led[1].setPosisiY(posisiY+jarak);
            led[2].setPosisiY(posisiY+jarak+jarak);
            
            led[0].setPosisiX(posisiX);
            led[1].setPosisiX(posisiX);
            led[2].setPosisiX(posisiX);
        }
        if (this.posisi == "left") {
            this.posisiX = 170;
            this.posisiY = 161;
            
            led[0].setPosisiY(posisiY);
            led[1].setPosisiY(posisiY);
            led[2].setPosisiY(posisiY);
            
            led[0].setPosisiX(posisiX);
            led[1].setPosisiX(posisiX-jarak);
            led[2].setPosisiX(posisiX-jarak-jarak);
        }
        if (this.posisi == "right") {
            this.posisiX = 403;
            this.posisiY = 411;
            
            led[0].setPosisiY(posisiY);
            led[1].setPosisiY(posisiY);
            led[2].setPosisiY(posisiY);
            
            led[0].setPosisiX(posisiX);
            led[1].setPosisiX(posisiX+jarak);
            led[2].setPosisiX(posisiX+jarak+jarak);
        }
    }
}
