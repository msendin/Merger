package cat.udl.demosEP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Merger {
    private List<Integer> lrest;

    Merger() {
        lrest = new ArrayList<>();
    }

    boolean isEmpty() {
        return lrest.isEmpty();
    }

    List<Integer> mergeSorted(List<Integer> list1, List<Integer> list2) throws IllegalArgumentException {
      int i, il1=0, il2=0;

      if (list1.size() > 1) {
          for (i=1; i < list1.size(); i++) {
              if (list1.get(i-1) >= list1.get(i))
                  throw new IllegalArgumentException("List 1 does not complains requirements");
          }
      }

      if (list2.size() > 1) {
            for (i=1; i < list2.size(); i++) {
                if (list2.get(i-1) >= list2.get(i))
                    throw new IllegalArgumentException("List 2 does not complains requirements");
            }
        }

      while (il1<list1.size() && il2<list2.size()) {
          if (list1.get(il1) < list2.get(il2)) {
              lrest.add(list1.get(il1));
              il1++;
          }
          else if (list1.get(il1) > list2.get(il2)) {
              lrest.add(list2.get(il2));
              il2++;
          }
          else {
              lrest.add(list1.get(il1));
              il1++; il2++;
          }
      }
      if (il1<list1.size())
          do {
              lrest.add(list1.get(il1));
              il1++;
          } while (il1<list1.size());
      else if (il2<list2.size())
          do {
              lrest.add(list2.get(il2));
              il2++;
          } while (il2<list2.size());
      return lrest;
    }
}
