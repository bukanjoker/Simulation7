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
public class Car 
{
    private long tDatang, tKeluar;
    private int posisiX, posisiY;
    private String posisi;
    
    public Car(){}
    
    public Car(String posisi)
    {
        this.posisi = posisi;
    }
    
    public void render(Graphics g)
    {
        if (this.posisi == "up") {
            g.drawImage(LoadImage.carUp, this.posisiX, this.posisiY, null);
        }
        else if (this.posisi == "bottom") {
            g.drawImage(LoadImage.carBottom, this.posisiX, this.posisiY, null);
        }
        else if (this.posisi == "left") {
            g.drawImage(LoadImage.carLeft, this.posisiX, this.posisiY, null);
        }
        else if (this.posisi == "right") {
            g.drawImage(LoadImage.carRight, this.posisiX, this.posisiY, null);
        }
    }

    public long gettDatang() {
        return tDatang;
    }

    public void settDatang(long tDatang) {
        this.tDatang = tDatang;
    }

    public long gettKeluar() {
        return tKeluar;
    }

    public void settKeluar(long tKeluar) {
        this.tKeluar = tKeluar;
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

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }
}
