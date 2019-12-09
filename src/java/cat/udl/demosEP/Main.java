package cat.udl.demosEP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,4,6,8);
        List<Integer> list2 = Arrays.asList(1,3,5,7);
        List<Integer> listRes = new ArrayList<>();
        Merger merger = new Merger();

        listRes = merger.mergeSorted(list1,list2);

        for(int i=0;i<listRes.size();i++){
            System.out.print(listRes.get(i));
        }

    }
}
