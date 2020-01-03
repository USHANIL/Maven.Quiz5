package rocks.zipcode.io.quiz4.generics;

import java.util.Collections;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_ extends Comparable> extends Group<_> {
    @Override
    public void insert(_ value) {
        groupList.add(value);
        Collections.sort(groupList);
    }

    @Override
    public void delete(_ value) {
        groupList.remove(value);
    }

    public Integer indexOf(_ value) {
        return groupList.indexOf(value);
    }
}
