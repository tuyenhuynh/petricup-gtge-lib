package petricup.lib;

/**
 * Графический контекст для рисования
 */
public class Graphics2D {
    
    /**
     * Графика
     * @param g 
     */    
    public Graphics2D(java.awt.Graphics2D g) {
        m_g = g;
    }
    
    /**
     * Возврщает реальный объект для рисования. Не переносить!
     * @return объект
     */    
    public java.awt.Graphics2D get() {
        return m_g;
    }
    
    /**
     * Задает фонт
     * @param font 
     */
    public void setFont(java.awt.Font font){
        m_g.setFont(font);
    }
    
    /**
     * Задает свет
     * @param color 
     */
    public void setColor(java.awt.Color color){
        m_g.setColor(color);
    }
    
    /**
     * Нарисовать строку
     * @param s
     * @param x
     * @param y 
     */
    public void drawString(String s, int x, int y){
        m_g.drawString(s, x, y);
    }
      
    java.awt.Graphics2D m_g;
}
