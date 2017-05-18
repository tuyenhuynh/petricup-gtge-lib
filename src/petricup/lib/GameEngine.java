/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petricup.lib;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Главный класс игры
 */
public class GameEngine {
    
    /**
     * Игра
     */
    Game m_game;

    /**
     * id игры
     */
    public int nextGameID;
    
    public GameEngine(){
        m_game = new Game();
        m_game.m_gameEngine = this;
    }

    /**
     * Получает игры на основании id
     * @param GameID - id игры
     */
    public GameObject getGame(int GameID) {
        return null;
    }
    
}
