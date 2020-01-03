package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements Iterable<_>, GroupInterface<_>{
    List<_> groupList;


    public Group() {
        groupList = new ArrayList<>();

    }

    public Integer count() {
        return groupList.size();
    }

    public void insert(_ value) {
        groupList.add(value);
    }

    public Boolean has(_ value) {
        return groupList.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return groupList.get(indexOfValue);
    }

    public void delete(_ value) {
        groupList.remove(value);
    }

    public void clear() {
        groupList.clear();
    }

    public Iterator<_> iterator() {
        return groupList.iterator();
    }

    @Override
    public String toString() {
        return groupList.toString();
    }
}
