package behavioral.template.bean;

/**
 * @description: 事假模版
 * @version: 1.0
 * @date: 2021-01-09 17:56:02
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class EventLeaveTemplate extends AbstractLeaveTemplate{

    @Override
    String reason() {
        return "有事";
    }

    @Override
    String staffName() {
        return "张三";
    }

    @Override
    int days() {
        return 10;
    }
}
