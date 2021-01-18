package behavioral.iterator.bean;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @description: todo 实现
 * @version: 1.0
 * @date: 2021-01-18 09:47:46
 * @author: wanglong16@meicai.cn
 */
public class MyListV2 implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}
