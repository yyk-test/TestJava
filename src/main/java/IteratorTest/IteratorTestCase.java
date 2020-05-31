package IteratorTest;

import java.util.ArrayList;
import java.util.List;

public class IteratorTestCase {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.remove(list.size() - 1);
        System.out.println(list.size());
        System.out.println(list.iterator() ==null);
        System.out.println(list==null);
    }
}
