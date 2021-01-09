package behavioral.observer.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-09 16:47:54
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class Teacher implements IObserver{

    public void update(String event) {
        if ("上课".equals(event)) {
            System.out.println("同学们上课！");
        } else if ("下课".equals(event)) {
            System.out.println("同学们下课！");
        }
    }
}
