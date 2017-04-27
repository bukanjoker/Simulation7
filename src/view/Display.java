/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author bukanjoker
 */
public class Display 
{
    private String title;
    private int width;
    private int height;
    public Canvas canvas;
    private JFrame frame;
    private SidePanel sidePanel;
    private JPanel panel;
    private boolean state;

    public Display(String title, int width, int height) 
    {
        this.title = title;
        this.width = width;
        this.height = height;
        createDisplay();
    }
    
    public void createDisplay()
    {
        //create frame
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null);
        frame.setLocation(230, 50);
        
        //create panel
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        sidePanel = new SidePanel();
        state = sidePanel.getState();
        
        //create canvas
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setFocusable(false);
        
        //arranging components
        c.insets = new Insets(0, 0, 0, 10);
        c.gridx = 1;
        c.gridy = 0;
        panel.add(canvas,c);
        c.gridx = 2;
        c.gridy = 0;
        panel.add(sidePanel,c);
        
        //add to frame
        frame.add(panel);
        frame.pack();
    }
}
