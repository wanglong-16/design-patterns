package behavioral.iterator.bean;

import java.util.Arrays;
import java.util.List;

/**
 * @description: 城市名称数组的迭代器
 * @version: 1.0
 * @date: 2021-01-18 09:34:58
 * @author: wanglong16@meicai.cn
 */
public class MyList {

    private List<String> strings = Arrays.asList("北京", "上海", "杭州");

    public Iterator iterator() {
        return new Ite();
    }

    private class Ite implements Iterator {

        private int cursor = 0;

        public boolean hasNext() {
            return cursor < strings.size();
        }

        public Object next() {
            return strings.get(cursor++);
        }
    }
}
