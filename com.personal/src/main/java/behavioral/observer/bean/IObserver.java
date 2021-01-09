package behavioral.observer.bean;

/**
 * @description: 订阅者在监听到变化时，作出响应
 * @version: 1.0
 * @date: 2021-01-09 15:37:44
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public interface IObserver {

    void update(String event);
}
