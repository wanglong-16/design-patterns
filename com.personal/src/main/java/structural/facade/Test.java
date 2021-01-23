package structural.facade;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-23 16:00:38
 * @author: wanglong16@meicai.cn
 */
public class Test {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.startWorking();
        System.out.println("工作了8小时了！！！");
        facade.stopWorking();
    }
}
