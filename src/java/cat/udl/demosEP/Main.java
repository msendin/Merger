package cat.udl.demosEP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> evenList = Arrays.asList(2,4,6,8);
        List<Integer> oddList = Arrays.asList(1,3,5,7,9);
        List<Integer> listRes = new ArrayList<>();
        Merger merger = new Merger();

        try {
            listRes = merger.mergeSorted(evenList, oddList);
        } catch (IllegalArgumentException e) {
            System.out.print("Ha saltado la excepción IllegalArgumentException");
        }

        System.out.println("RESULTADO:");
        for(Integer num : listRes){
            System.out.print(num);
        }
    }
}
