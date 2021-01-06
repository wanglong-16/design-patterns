package creational.builder;

/**
 * @description: 特别适合构建带有默认值配置的对象
 * @version: 1.0
 * @date: 2021-01-06 21:51:57
 * @author: wanglong16@meicai.cn
 */
public class MilkTea {

    private final String size;

    private final double price;

    private final boolean ice;

    private MilkTea(String size, double price, boolean ice) {
        this.size = size;
        this.price = price;
        this.ice = ice;
    };

    private MilkTea(Builder builder) {
        this.size = builder.size;
        this.price = builder.price;
        this.ice = builder.ice;
    }

    public static class Builder {

        private String size = "大杯";

        private double price = 20.0;

        private boolean ice = false;

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder ice(boolean ice) {
            this.ice = ice;
            return this;
        }

        public MilkTea build() {
            return new MilkTea(this);
        }

    }

    @Override
    public String toString() {
        return "MilkTea{" +
                "size='" + size + '\'' +
                ", price=" + price +
                ", ice=" + ice +
                '}';
    }
}
