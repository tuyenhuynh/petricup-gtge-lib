package petricup.lib;

/**
 * Игровая арена
 */
public class PlayField {
    com.golden.gamedev.object.PlayField m_playField;
    
    public PlayField(){
        m_playField = new com.golden.gamedev.object.PlayField();
    }
    
    /**
     * Ассоциирует фон
     * @param bg фон
     */
    public void setBackground(ImageBackground bg) {
        m_playField.setBackground(bg.m_imageBackground);
    }
    
    /**
     * Вставляет новую SpriteGroup в поле
     * @param spriteGroup Группа спрайтов
     */
    public void addGroup(SpriteGroup spriteGroup){
        m_playField.addGroup(spriteGroup.m_spriteGroup);
    }
    
    /**
     * Связывает группу колиции с полем.
     * @param sg1
     * @param sg2
     * @param cm 
     */
    public void addCollisionGroup(SpriteGroup sg1, SpriteGroup sg2, BasicCollisionGroup cm){
        m_playField.addCollisionGroup(sg1.m_spriteGroup, sg2.m_spriteGroup, cm);
        cm.setCollisionGroup(sg1, sg2);
    }

    /**
     * Обновляет состояние игры
     * @param elapsedTime время, прошедшее с предыдущего обновления
     */    
    public void update(long e){
        m_playField.update(e);
    }

    /**
     * Отрисовывет состояние игры
     * @param g 
     */     
    public void render(Graphics2D g2d){
        m_playField.render(g2d.get());
    }

    /**
     * Отрисовывет состояние игры (не портировать)
     * @param g 
     */       
    public void render(java.awt.Graphics2D g2d){
        m_playField.render(g2d);
    }
}
