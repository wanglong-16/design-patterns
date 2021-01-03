package behavioral.chainofresponsibility;

/**
 * @description: 工作
 * @version: 1.0
 * @date: 2021-01-03 22:28:03
 * @author: wanglong16@meicai.cn
 */
public class Work {

    /**
     * 1,设计UI页面、2,开发前端页面、3,开发后端服务、4,保证项目质量、5,出问题了背锅。
     */
    private int workType;

    /**
     * 工作的类型：设计UI页面、开发前端页面、开发后端服务、保证项目质量、出问题了背锅。
     */
    private String workMessage;

    public Work() {
    }

    public Work(int workType, String workMessage) {
        this.workType = workType;
        this.workMessage = workMessage;
    }

    public int getWorkType() {
        return workType;
    }

    public void setWorkType(int workType) {
        this.workType = workType;
    }

    public String getWorkMessage() {
        return workMessage;
    }

    public void setWorkMessage(String workMessage) {
        this.workMessage = workMessage;
    }
}
