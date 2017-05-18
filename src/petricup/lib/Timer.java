package petricup.lib;

/**
 * Управление временем
 * @author nghiand
 */
public class Timer{
    com.golden.gamedev.object.Timer m_timer;
    
    /**
     * Создает Timer с заданным временем задержки в миллисекундах
     * @param delay 
     */
    public Timer(int delay) {
        m_timer = new com.golden.gamedev.object.Timer(delay);
    }
    
    /**
     * Возвращает true, если истекло время задержки таймера, поэтому действие должно быть выполнено.
     * @param time
     * @return
     */
    public boolean action(long time) {
        return m_timer.action(time);
    }
}