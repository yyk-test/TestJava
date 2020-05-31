import EnumSingletonTest.EnumSingleton;
import SortingAlgo.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestMain {
    public TestMain() {
    }

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.show();
        EnumSingleton.ANOTHER_INSTANCE.show();

        int[] arr = {2,3,4,51,2,3,8,9,5,3,2,4,5,77,8,9,54,3,1,4,5,7,8};
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {1,1,1,1,1,1,1,1};

        int[] temp = new int[arr.length];
        mergeSort.ms(arr, temp, 0, arr.length - 1);
        for(Integer i : arr) {
            System.out.print(i + ", ");
        }


        System.out.println("\n==========");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(null);
        list.add(2);
        System.out.println(list.size());
        for(Integer obj : list) {
            System.out.println(obj);
        }




        String a = "preview-r12345";
        String b = "preview-";

        System.out.println(StringUtils.removeStart(a, b));

        final String revisionCode = a.substring("preview-".length()).toUpperCase();

        System.out.println(revisionCode);
        System.out.println(true);

        String s1 = String.format("this is bool %s", 0==1);
        System.out.println(s1);


        Set<String> sets = new HashSet<>();
        sets.add("Mem A");
        sets.add("Mem B");

        System.out.println(sets);

        Logger log = LoggerFactory.getLogger(TestMain.class);
        log.info(String.format("this is %s", sets));

    }
}
