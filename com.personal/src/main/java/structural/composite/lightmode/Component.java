package structural.composite.lightmode;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-20 21:49:35
 * @author: wanglong16@meicai.cn
 */
public interface Component {

    void add(Component component);

    void remove(Component component);

    void check();

}
