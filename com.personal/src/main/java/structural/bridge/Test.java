package structural.bridge;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-20 21:28:57
 * @author: wanglong16@meicai.cn
 */
public class Test {

    public static void main(String[] args) {
        Square square = new Square();
        square.setColor(new Green());
        square.draw();
    }
}
