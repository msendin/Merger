package cat.udl.demosEP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergerTest {

    private Merger merger;

    @BeforeEach
    void setUp() {
       merger = new Merger();
    }

    @Test
    void mergeSortedTest() throws IllegalArgumentException {
        List<Integer> list1 = Arrays.asList(2,4,6,8);
        List<Integer> list2 = Arrays.asList(1,3,5,7);
        List<Integer> listRes = Arrays.asList(1,2,3,4,5,6,7,8);

        assertEquals(listRes, merger.mergeSorted(list1,list2));
    }

    @Test
    void mergeSortedTestOneEmpty() throws IllegalArgumentException {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = Arrays.asList(1,3,5,7);
        List<Integer> listRes = Arrays.asList(1,3,5,7);

        assertEquals(listRes, merger.mergeSorted(list1,list2));
    }

    @Test
    void getIllegalArgumentTest() {
        List<Integer> list1 = Arrays.asList(2,1,6,8);
        List<Integer> list2 = Arrays.asList(9,3,5,7);

        assertThrows(IllegalArgumentException.class,
                () -> merger.mergeSorted(list1,list2));
        System.out.println("Se ha lanzado la excepción IllegalArgumentException, tal y como se esperaba");
    }

    @Test
    void checkEmptyTest() {
        assertTrue(merger.isEmpty());
    }

}