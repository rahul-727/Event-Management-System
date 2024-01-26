/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tm;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author krrah
 */
public class Tm {

     public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new traveldash().setVisible(true);
        }
    });
  
    }
}
class Rahul{
    static{
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance Block");
    }
}
