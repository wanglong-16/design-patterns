package behavioral.chainofresponsibility.bean;

/**
 * @description: 前端工程师
 * @version: 1.0
 * @date: 2021-01-03 22:43:03
 * @author: wanglong16@meicai.cn
 */
public class CutPictureBoy extends Technician {

    private final String name;

    public CutPictureBoy(String name) {
        this.name = name;
    }

    @Override
    public void handle(Work work) {
        if (work.getWorkType() == 2) {
            working(work);
        } else if (nextCooperator != null){
            nextCooperator.handle(work);
        }
    }

    public void working(Work work) {
        System.out.println(String.format("我是前端工程师，我叫 %s，我正在做 %s 的工作！", name, work.getWorkMessage()));
    }
}
