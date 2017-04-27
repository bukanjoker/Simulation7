/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Graphics;
import view.LoadImage;

/**
 *
 * @author bukanjoker
 */
public class Bulb 
{
    private String colorname;
    private Boolean on = true;
    private int posisiX, posisiY;
    private double time;

    public Bulb(String warna)
    {
        this.colorname = warna;
    }
    
    public void render(Graphics g)
    {
        if (on)
        {
            if (this.colorname == "red") {
                g.drawImage(LoadImage.red, this.posisiX, this.posisiY, null);
            }
            else if (this.colorname == "yellow") {
                g.drawImage(LoadImage.yellow, this.posisiX, this.posisiY, null);
            }
            else if (this.colorname == "green") {
                g.drawImage(LoadImage.green, this.posisiX, this.posisiY, null);
            }
        }
    }
    
    public void turnOn() {
        on = true;
    }
    
    public void turnOff() {
        on = false;
    }
    
    public boolean isOn() {
        return on;
    }
    
    public boolean isOff() {
        return !on;
    }
    
    public void setColorName(String warna) {
        this.colorname = warna;
    }

    public int getPosisiX() {
        return posisiX;
    }

    public void setPosisiX(int posisiX) {
        this.posisiX = posisiX;
    }

    public int getPosisiY() {
        return posisiY;
    }

    public void setPosisiY(int posisiY) {
        this.posisiY = posisiY;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
