package behavioral.template;

import behavioral.template.bean.AbstractLeaveTemplate;
import behavioral.template.bean.EventLeaveTemplate;
import behavioral.template.bean.StickLeaveTemplate;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-09 18:03:25
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class Test {

    public static void main(String[] args) {
        AbstractLeaveTemplate eventLeaveTemplate = new EventLeaveTemplate();
        AbstractLeaveTemplate stickLeaveTemplate = new StickLeaveTemplate();
        eventLeaveTemplate.leaveMessage();
        stickLeaveTemplate.leaveMessage();
    }
}
