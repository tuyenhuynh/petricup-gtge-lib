package petricup.lib;

/**
 *
 * 
 */
public class GameObject extends com.golden.gamedev.GameObject{

    public GameObject(GameEngine ge) {
        super(ge);
    }
    
    /**
     * Обновляет состояние игры
     * @param elapsedTime время, прошедшее с предыдущего обновления
     */
    @Override
    public void update(long elapsedTime) {
        
    }
    
    /**
     * Инициализация ресурсов игры
     */
    @Override
    public void initResources() {
    }

    /**
     * Отрисовывет состояние игры (не портировать)
     * @param g 
     */    
    @Override
    public void render(java.awt.Graphics2D g2) {
        Graphics2D g2d = new Graphics2D(g2);
        renderInContext(g2d);
    }
    
    /**
     * Отрисовывет состояние игры
     * @param g 
     */        
    public void renderInContext(Graphics2D g2d){
        this.render(g2d.get());
    }
}
