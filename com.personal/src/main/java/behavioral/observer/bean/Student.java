package behavioral.observer.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-09 16:50:27
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class Student implements IObserver {

    public void update(String event) {
        if ("上课".equals(event)) {
            System.out.println("老师好！！！");
        } else if ("下课".equals(event)) {
            System.out.println("老师再见！！！");
        }
    }
}
