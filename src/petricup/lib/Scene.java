/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petricup.lib;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author nghiand
 */
public class Scene implements Screen{
    /** 
     * Объект игры
     */
    final GameObject m_gameObject;

    /** 
     * Камера
     */
    OrthographicCamera m_camera;
    
    /** 
     * Конструктор
     * @param gameObject Объект игры
     */
    public Scene(GameObject gameObject){
        m_gameObject = gameObject;
        m_camera = new OrthographicCamera(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        m_camera.position.set(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, 0);
        m_camera.update();
        
        Game.m_current_camera = m_camera;
    }

    /** 
     * Позазывает игру
     */
    @Override
    public void show() {
        m_gameObject.initResources();
    }

    /**
     * Рендеринг игры
     */
    @Override
    public void render(float f) {
        m_camera.update();
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        m_gameObject.update((long) (f * 1000.0));
        
        m_gameObject.parent.m_game.m_ctx.getBatch().setProjectionMatrix(m_camera.combined);
        m_gameObject.parent.m_game.m_ctx.begin();
        m_gameObject.renderInContext(m_gameObject.parent.m_game.m_ctx);
        m_gameObject.parent.m_game.m_ctx.end();
    }

    /**
     * Изменение размера игры
     */
    @Override
    public void resize(int i, int i1) {
    }

    /**
     * Остановить игры
     */
    @Override
    public void pause() {
    }

    /**
     * Продолжить игры
     */
    @Override
    public void resume() {
    }

    /**
     * Скрыть игру
     */
    @Override
    public void hide() {
    }

    /**
     *  Отпустить все ресурсы.
     */
    @Override
    public void dispose() {
        TextureManager.disposeTextures();
    }
}
