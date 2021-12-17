package cat.udl.demosEP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,4,6,8);
        List<Integer> list2 = Arrays.asList(1,3,5,7,9,0);
        List<Integer> listRes = new ArrayList<>();
        Merger merger = new Merger();

        try {
            listRes = merger.mergeSorted(list1, list2);
        } catch (IllegalArgumentException e) {
            System.out.print("Ha saltado la excepción IllegalArgumentException");
        }

        for(Integer num : listRes){
            System.out.print(num);
        }
    }
}
