package behavioral.chainofresponsibility.bean;

import behavioral.chainofresponsibility.IWorkIng;

/**
 * @description: 技术人员
 * @version: 1.0
 * @date: 2021-01-03 22:24:40
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public abstract class Technician implements IWorkIng {

    protected Technician nextCooperator;

    public void setNextCooperator(Technician nextCooperator) {
        this.nextCooperator = nextCooperator;
    }

    public abstract void handle(Work work);
}
