/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petricup.lib;

/**
 *
 * @author tuyenhuynh
 */
public class Graphics2D {
    
    
    public Graphics2D(java.awt.Graphics2D g) {
        m_g = g;
    }
    
    
    public java.awt.Graphics2D get() {
        return m_g;
    } 
      
    java.awt.Graphics2D m_g;
}
