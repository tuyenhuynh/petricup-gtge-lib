package petricup.lib;

import com.golden.gamedev.object.Sprite;
import java.util.HashMap;
import java.util.Map;

/**
 * Группа спрайтов
 */
public class SpriteGroup{
    com.golden.gamedev.object.SpriteGroup m_spriteGroup;
 
    /**
     * Создает новую именованную группу спрайтов
     * @param string 
     */
    public SpriteGroup(String string) {
        m_spriteGroup = new com.golden.gamedev.object.SpriteGroup(string);
    }
    
    /**
     * Добавляет новый спрайт в группу
     * @param s 
     */    
    public void add(GameSprite sprite){
        m_spriteGroup.add(sprite.m_sprite);
        m_map.put(sprite.m_sprite, sprite);
    }

    /**
     * Удаляет группу из спрайтов
     * @param s 
     */    
    public void remove(GameSprite sprite){
        m_spriteGroup.remove(sprite.m_sprite);
        m_map.remove(sprite.m_sprite);
    }
    
    GameSprite get(com.golden.gamedev.object.Sprite sp){
        return m_map.get(sp);
    }
    
    Map<Sprite, GameSprite> m_map = new HashMap<>();
}
