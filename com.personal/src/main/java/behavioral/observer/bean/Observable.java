package behavioral.observer.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-09 16:41:21
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class Observable {

    private List<IObserver> observers = new ArrayList<IObserver>();

    public void addObservers(IObserver observer) {
        observers.add(observer);
    }

    public void removeObservers(IObserver observer) {
        observers.remove(observer);
    }

    public void notify(String event) {
        if (!observers.isEmpty()) {
            for (IObserver observer: observers) {
                observer.update(event);
            }
        }
    }

}
