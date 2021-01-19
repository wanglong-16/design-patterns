package behavioral.command.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-19 20:37:39
 * @author: wanglong16@meicai.cn
 */
public class TV {

    private String status;

    public TV() {
    }

    public String getStatus() {
        return status;
    }

    public void openTV() {
        System.out.println("打开了📺，正在直播NBA");
        status = "on";
    }

    public void closeTV() {
        System.out.println("关闭了📺，电视机一片黑");
        status = "off";
    }
}
