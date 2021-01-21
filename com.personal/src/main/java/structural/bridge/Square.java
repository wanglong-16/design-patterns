package structural.bridge;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-20 21:27:08
 * @author: wanglong16@meicai.cn
 */
public class Square implements DrawShape{

    private IColor color = new Green();

    public IColor getColor() {
        return color;
    }

    public void setColor(IColor color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("正方形: " + getColor().color());
    }
}
