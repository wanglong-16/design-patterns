package behavioral.template.bean;

/**
 * @description: 病假模版
 * @version: 1.0
 * @date: 2021-01-09 17:57:43
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class StickLeaveTemplate extends AbstractLeaveTemplate{
    @Override
    String reason() {
        return "有病";
    }

    @Override
    String staffName() {
        return "李四";
    }

    @Override
    int days() {
        return 5;
    }
}
