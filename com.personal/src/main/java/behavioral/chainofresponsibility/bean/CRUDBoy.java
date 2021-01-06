package behavioral.chainofresponsibility.bean;

/**
 * @description: crud 工程师
 * @version: 1.0
 * @date: 2021-01-03 22:44:25
 * @author: wanglong16@meicai.cn
 */
public class CRUDBoy extends Technician {

    private final String name;

    public CRUDBoy(String name) {
        this.name = name;
    }

    @Override
    public void handle(Work work) {
        if (work.getWorkType() != 1 && work.getWorkType() != 2) {
            working(work);
        } else {
            System.out.println("。。。。。。");
        }
    }

    public void working(Work work) {
        System.out.println(String.format("我是后端工程师，我叫 %s，我正在做 %s 的工作！", name, work.getWorkMessage()));
    }
}
