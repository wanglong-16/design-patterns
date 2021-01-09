package behavioral.observer.bean;

/**
 * @description: 学校的铃声
 * @version: 1.0
 * @date: 2021-01-09 16:52:27
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class NoticeAlarm extends Observable {

    public void alarming(String message) {
        super.notify(message);
    }
}
