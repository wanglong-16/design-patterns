package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.bean.CRUDBoy;
import behavioral.chainofresponsibility.bean.CutPictureBoy;
import behavioral.chainofresponsibility.bean.UIDesigner;
import behavioral.chainofresponsibility.bean.Work;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-03 22:56:15
 * @author: wanglong16@meicai.cn
 */
public class Main {

    public static void main(String[] args) {
        UIDesigner uiDesigner = new UIDesigner("小白");
        CutPictureBoy cutPictureBoy = new CutPictureBoy("切图仔");
        CRUDBoy crudBoy = new CRUDBoy("crud小菜鸟");

        Work design = new Work(1, "设计网站页面");
        Work devCss = new Work(2, "调整网站页面");
        Work devInterface = new Work(3, "开发服务接口");

        uiDesigner.setNextCooperator(cutPictureBoy);
        cutPictureBoy.setNextCooperator(crudBoy);

        //链式调用对象。。。
        uiDesigner.handle(design);
        uiDesigner.handle(devCss);
        uiDesigner.handle(devInterface);
    }
}
