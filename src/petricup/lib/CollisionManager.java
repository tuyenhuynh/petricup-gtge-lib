package petricup.lib;

/**
 *
 * @author nghiand
 */
public class CollisionManager {
    SpriteGroup sg1;
    SpriteGroup sg2;
    BasicCollisionGroup cm;

    /**
     * Менеджер  коллиций
     * @param s1 первая группа
     * @param s2 вторая группа
     * @param cm группа коллиций
     */
    public CollisionManager(SpriteGroup sg1, SpriteGroup sg2, BasicCollisionGroup cm) {
        this.sg1 = sg1;
        this.sg2 = sg2;
        this.cm = cm;
    }
    
    /**
     * Геттер первой группы
     *
     * @return первая группа
     */
    public SpriteGroup getSg1() {
        return sg1;
    }


    /**
     * Сеттер первой группы
     *
     * @param sg1 первая группа
     */
    public void setSg1(SpriteGroup sg1) {
        this.sg1 = sg1;
    }


    /**
     * Геттер второй группы
     *
     * @return вторая группа
     */
    public SpriteGroup getSg2() {
        return sg2;
    }

    /**
     * Сеттер второй группы
     *
     * @param sg2 вторая группа
     */
    public void setSg2(SpriteGroup sg2) {
        this.sg2 = sg2;
    }

    /**
     * Геттер группы коллиций
     *
     * @return группа коллиций
     */
    public BasicCollisionGroup getCm() {
        return cm;
    }

    /**
     * Сеттер группы коллиций
     *
     * @param cm группы коллиции
     */
    public void setCm(BasicCollisionGroup cm) {
        this.cm = cm;
    }
}
