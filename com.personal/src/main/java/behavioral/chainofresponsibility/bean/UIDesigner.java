package behavioral.chainofresponsibility.bean;

/**
 * @description: UI设计师
 * @version: 1.0
 * @date: 2021-01-03 22:32:23
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class UIDesigner extends Technician {

    private final String name;

    public UIDesigner(String name) {
        this.name = name;
    }

    @Override
    public void handle(Work work) {
        if (work.getWorkType() == 1) {
            working(work);
        } else if (nextCooperator != null){
            nextCooperator.handle(work);
        }
    }

    public void working(Work work) {
        System.out.println(String.format("我是UI设计师，我叫 %s，我正在做 %s 的工作！", name, work.getWorkMessage()));
    }
}
