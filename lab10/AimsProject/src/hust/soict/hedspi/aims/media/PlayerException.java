/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.media;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MyPC
 */
//import java.lang.Exception;
public class PlayerException extends Throwable{

    public PlayerException(String mess)
    {
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, mess,"ERROR", 0);
        System.exit(0);
    }
}
