/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petricup.lib;

import com.golden.gamedev.object.Sprite;

/**
 * Группа для поиска пересечений
 */
public class BasicCollisionGroup extends com.golden.gamedev.object.collision.BasicCollisionGroup {

    /**
     * Инициализация коллизий
     */    
    public BasicCollisionGroup() {
        super();
        this.pixelPerfectCollision = true;
    }

    /**
     * Обрабатывает коллизии. Не переносить!
     * @param sprite1
     * @param sprite2 
     */    
    @Override
    public void collided(Sprite sprite1, Sprite sprite2) {
        if (m_sg1 == null || m_sg2 == null)
            return;
            //System.out.println("a");
        GameSprite gs1 = m_sg1.get(sprite1);
        GameSprite gs2 = m_sg2.get(sprite2);    
        this.collided(gs1, gs2);
        
    }

    /**
     * Обрабатывает коллизии.
     * @param sprite1
     * @param sprite2 
     */    
    public void collided(GameSprite sprite1, GameSprite sprite2) {
        
    }
    
    /**
     * Задает группу коллизий
     * @param sg1
     * @param sg2 
     */
    public void setCollisionGroup(SpriteGroup sg1, SpriteGroup sg2){
        super.setCollisionGroup(sg1.m_spriteGroup, sg2.m_spriteGroup);
        m_sg1 = sg1;
        m_sg2 = sg2;
    }
    
    SpriteGroup m_sg1;
    SpriteGroup m_sg2;
}
