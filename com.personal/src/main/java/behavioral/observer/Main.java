package behavioral.observer;

import behavioral.observer.bean.IObserver;
import behavioral.observer.bean.NoticeAlarm;
import behavioral.observer.bean.Student;
import behavioral.observer.bean.Teacher;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-09 16:53:56
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class Main {

    public static void main(String[] args) {
        IObserver teacher = new Teacher();
        IObserver student = new Student();
        NoticeAlarm alarm = new NoticeAlarm();
        alarm.addObservers(teacher);
        alarm.addObservers(student);
        alarm.alarming("上课");
        System.out.println("------上课中 45分钟 --------");
        alarm.alarming("下课");
    }
}
