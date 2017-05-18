package petricup.lib;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuyenhuynh
 */
public class PlayField {
    /**
     * Фон игры
     */
    ImageBackground m_bg;
    /**
     * Список групп спрайтов
     */
    List<SpriteGroup> list_spriteGroup = new ArrayList<>();
    
    /**
     * Список групп коллиций
     */
    List<BasicCollisionGroup> list_collisionGroup = new ArrayList<>();
    

    public PlayField(){
        
    }
    /**
     * Ассоциирует фон
     * @param bg фон
     */
    public void setBackground(ImageBackground bg) {
        m_bg = bg;
    }
    
    /**
     * Вставляет новую SpriteGroup в поле
     * @param spriteGroup Группа спрайтов
     */
    public void addGroup(SpriteGroup spriteGroup){
        list_spriteGroup.add(spriteGroup);
    }
    
    /**
     * Связывает группу колиции с полем.
     * @param sg1
     * @param sg2
     * @param cm 
     */
    public void addCollisionGroup(SpriteGroup sg1, SpriteGroup sg2, BasicCollisionGroup cg){
        cg.setCollisionGroup(sg1, sg2);
        list_collisionGroup.add(cg);
    }
    
    /**
     * Обновляет состояние игры
     * @param elapsedTime время, прошедшее с предыдущего обновления
     */
    public void update(long e){
        list_spriteGroup.stream().forEach((s) -> {
            s.update(e);
        });
        list_collisionGroup.stream().forEach((cg) -> {
            cg.checkCollision();
        });
    }
    
    /**
     * Отрисовывет состояние игры
     * @param g 
     */
    public void render(Graphics2D g2d){
        m_bg.render(g2d);
        list_spriteGroup.stream().forEach((s) -> {
            s.render(g2d);
        });
    }
    
    /**
     * Отрисовывет состояние игры (не портировать)
     * @param g 
     */
    public void render(java.awt.Graphics2D g2d){
    }    
}
