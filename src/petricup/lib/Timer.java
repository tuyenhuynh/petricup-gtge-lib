/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petricup.lib;

/**
 *
 * @author tuyenhuynh
 */
public class Timer {
    /**
     * Время задержки
     */
    private long delay;

    /**
     * Отметка времени таймера
     */
    private long currentTick;
    
    /**
     * Создает Timer с заданным временем задержки в миллисекундах
     * @param delay 
     */
    public Timer(int delay) {
        this.delay = delay;
        this.currentTick = 0;
    }

    /**
     * Возвращает true, если истекло время задержки таймера, поэтому действие должно быть выполнено.
     * @param time
     * @return
     */
    public boolean action(long l) {
        currentTick += l;
        if (currentTick >= delay) {
            
            currentTick -= delay;

            return true;
        }
        return false;
    }
    
}
