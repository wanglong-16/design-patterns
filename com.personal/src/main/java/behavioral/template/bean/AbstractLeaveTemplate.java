package behavioral.template.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-09 17:48:21
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public abstract class AbstractLeaveTemplate {

    public void leaveMessage() {
        System.out.println(String.format("==> 员工: %s 因为 %s 请假 %s 天！", staffName(), reason(), days()));
    }

    abstract String reason();

    abstract String staffName();

    abstract int days();
}
