/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petricup.lib;

import com.golden.gamedev.object.Sprite;

/**
 *
 * @author tuyenhuynh
 */
public class PreciseCollisionGroup extends com.golden.gamedev.object.collision.PreciseCollisionGroup{

    @Override
    public void collided(Sprite sprite1, Sprite sprite2) {
        this.collided((GameSprite)sprite1, (GameSprite)sprite2);
    }
    
    public void collided(GameSprite sprite1, GameSprite sprite2) {
        
    }
    
}
