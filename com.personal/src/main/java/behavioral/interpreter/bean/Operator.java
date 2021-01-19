package behavioral.interpreter.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-19 07:19:15
 * @author: wanglong16@meicai.cn
 */
public class Operator implements Expression{

    private Integer left;

    private Integer right;

    private char operate;

    public Operator(Integer left, Integer right, char operate) {
        this.left = left;
        this.right = right;
        this.operate = operate;
    }


    @Override
    public int interpret() {
        switch (operate) {
            case '加':
                return left + right;
            case '减':
                return left - right;
            default:
                throw new IllegalArgumentException("非法参数");
        }
    }
}
