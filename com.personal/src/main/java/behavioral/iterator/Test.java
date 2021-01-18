package behavioral.iterator;

import behavioral.iterator.bean.Iterator;
import behavioral.iterator.bean.MyList;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-18 09:33:25
 * @author: wanglong16@meicai.cn
 */
public class Test {

    public static void main(String[] args) {
        MyList myList = new MyList();
        Iterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
