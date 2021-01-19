package behavioral.interpreter.bean;

/**
 * @description: 0-9 数字类
 * @version: 1.0
 * @date: 2021-01-16 11:43:41
 * @author: wanglong16@meicai.cn
 */
public class Number implements Expression{

    private final int number;

    public Number(char word) {
        switch (word) {
            case '零':
                number = 0;
                break;
            case '一':
                number = 1;
                break;
            case '二':
                number = 2;
                break;
            case '三':
                number = 3;
                break;
            case '四':
                number = 4;
                break;
            case '五':
                number = 5;
                break;
            case '六':
                number = 6;
                break;
            case '七':
                number = 7;
                break;
            case '八':
                number = 8;
                break;
            case '九':
                number = 9;
                break;
            default:
                throw new IllegalArgumentException("非法数值");
        }
    }

    @Override
    public int interpret() {
        return number;
    }
}
