package Test;

import java.util.List;

class MinMaxService {
    public static <T extends Comparable<? super T>> MinMax<T> getMinMax(List<T> elements) {
        if (elements == null || elements.isEmpty()) {
            return null;
        }

        T minimum = elements.get(0);
        T maximum = elements.get(0);

        for (T e : elements) {
            if (e.compareTo(minimum) < 0) {
                minimum = e;
            }

            if (e.compareTo(maximum) > 0) {
                maximum = e;
            }
        }

        return new MinMax<>(minimum, maximum);
    }
}

