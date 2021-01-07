package behavioral.strategy.sort;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-07 08:53:02
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public enum SortIntArrStrategy {

    BUBBER_SORT {
        @Override
        public ISort get() {
            return new BubbleSort();
        }
    },

    SELLECTION_SORT {
        @Override
        public ISort get() {
            return new SelectionSort();
        }
    };

    public abstract ISort get();
}
