/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import view.Display;

/**
 *
 * @author bukanjoker
 */
public class Setup implements Runnable 
{
    private Thread thread;
    private String title;
    private int width;
    private int height;
    private Display display;
    private static Canvas canvas;
    private BufferStrategy buffer;
    private Graphics g;
    private Manager manager;
    private int fps = 1;

    public Setup(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }
    
    public void init()
    {
        display = new Display(title, width, height);
        manager = new Manager();
        manager.init();
    }
    
    public void tick()
    {
        manager.tick();
    }
    
    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }
    
    public synchronized void stop() {
        try {
            thread.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    public void render()
    {
        buffer = display.canvas.getBufferStrategy();
        if (buffer == null) {
            display.canvas.createBufferStrategy(3);
            return;
        }
        g = buffer.getDrawGraphics();
        g.clearRect(0, 0, width, height);
        
        //draw
        manager.render(g);
        
        //draw end
        buffer.show();
        g.dispose();
    }
    
    @Override
    public void run() {
        init();
        
        double timePerTick = 10000000/fps;
        double delta = 0;
        long current = System.nanoTime();
        
        while(true) {
            delta = delta + (System.nanoTime() - current)/timePerTick;
            current = System.nanoTime();
            if (delta >= 1) {
                tick();
                render();
                delta--;
            }
            
        }
    }
    
}
