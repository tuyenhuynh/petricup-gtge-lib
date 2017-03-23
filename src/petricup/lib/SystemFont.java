/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petricup.lib;

import java.awt.Font;

/**
 *
 * @author tuyenhuynh
 */
public class SystemFont extends com.golden.gamedev.object.font.SystemFont {
    
    public SystemFont(String fontName, int attrs, int size, java.awt.Color clr) {
        super(new Font(fontName, attrs, size), clr);
    }
    
    public void drawString(Graphics2D g, String data, int x, int y) {
        super.drawString(g.get(), data, x, y);
    }
}
