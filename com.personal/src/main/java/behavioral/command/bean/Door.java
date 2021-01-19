package behavioral.command.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-19 20:40:34
 * @author: wanglong16@meicai.cn
 */
public class Door {

    private String status;

    public Door() {
    }

    public String getStatus() {
        return status;
    }

    public void openDoor() {
        System.out.println("打开了🚪，有点儿冷");
        status = "open";
    }

    public void closeDoor() {
        System.out.println("关闭了🚪，好暖和");
        status = "close";
    }

}
