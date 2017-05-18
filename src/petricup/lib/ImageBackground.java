package petricup.lib;

import java.awt.image.BufferedImage;

/**
 * Фон для игры
 */
public class ImageBackground{
    com.golden.gamedev.object.background.ImageBackground m_imageBackground;
    
    public ImageBackground(BufferedImage bi) {
        m_imageBackground = new com.golden.gamedev.object.background.ImageBackground(bi);
    }
    
    public void setToCenter(GameSprite player) {
        m_imageBackground.setToCenter(player.m_sprite);
    }
    
    public void update(long e) {
        m_imageBackground.update(e);
    }

    /**
     * Устанавливает обрезку фона
     * @param i
     * @param i1
     * @param i2
     * @param i3 
     */    
    public void setClip(int i, int i1, int i2, int i3){
        m_imageBackground.setClip(i, i1, i2, i3);
    }
       
    public void render(Graphics2D g2d){
        m_imageBackground.render(g2d.get());
    }
    
    public double getX(){
        return m_imageBackground.getX();
    }   
    
    public double getY(){
        return m_imageBackground.getY();
    }

    /**
     * Устанавливает глобальные пределы смещения камеры
     * @param totalWidth
     * @param totalHeight 
     */
    public void setTotalClip(int totalWidth, int totalHeight) {
    }
}
