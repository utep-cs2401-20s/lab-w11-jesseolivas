import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class newSortingTester {

    @Test
    /*
    This test is the original test I used to test the method in general,
    it takes an array of 5 elements and I chose to pass a size of 2 elements
    which seems reasonable to me.
     */
    public void newSortingT1(){

        // Creating my unsorted array and expected output
        int[] a = {5,4,3,2,1};
        int[] exp = {1,2,3,4,5};

        // Creating my newSorting object and calling the method newSorting inside of
        // newSorting class and passing my unsorted array.
        newSorting ns = new newSorting();
        ns.newSorting(a,2);

        // Using my tester to compare the two array references
        assertArrayEquals(exp, a);

        // RESULT: Test passed with no bugs, all green.
    }

    @Test
    /*
    This test was specific to comparing positive numbers with a negative number
    snuck in to see how the methods work together. There are 4 elements in the array
    and one of them is negative, the method is also given a size of 2 elements to
    keep the change of variables to a minimum.
     */
    public void newSortingT2(){

        // Creating my unsorted array and expected output
        int[] a = {-1,3,2,1};
        int[] exp = {-1,1,2,3};

        // Creating my newSorting object and calling the method newSorting inside of
        // newSorting class and passing my unsorted array.
        newSorting ns = new newSorting();
        ns.newSorting(a,2);

        // Using my tester to compare the two array references
        assertArrayEquals(exp, a);

        // RESULT: Test passed with no bugs, all green.
    }

    @Test
    /*
    This test was specific to comparing an array of all negative numbers to see how
    the methods work together. There are 5 elements in the array and all of them are
    negative, the method is also given a size of 2 elements to keep the change of variables
    to a minimum.
     */
    public void newSortingT3(){

        // Creating my unsorted array and expected output
        int[] a = {-1,-2,-3,-4,-5};
        int[] exp = {-5,-4,-3,-2,-1};

        // Creating my newSorting object and calling the method newSorting inside of
        // newSorting class and passing my unsorted array.
        newSorting ns = new newSorting();
        ns.newSorting(a,2);

        // Using my tester to compare the two array references
        assertArrayEquals(exp, a);

        // RESULT: Test passed with no bugs, all green.
    }

    @Test
    /*
    This test is used to see what happens when my size used is the same as the amount
    of elements in my array to be sorted, which should work because it'll just send it
    straight to my Quicksort method.
     */
    public void newSortingT4(){

        // Creating my unsorted array and expected output
        int[] a = {5,4,3,2,1};
        int[] exp = {1,2,3,4,5};

        // Creating my newSorting object and calling the method newSorting inside of
        // newSorting class and passing my unsorted array.
        newSorting ns = new newSorting();
        ns.newSorting(a,5);

        // Using my tester to compare the two array references
        assertArrayEquals(exp, a);

        // RESULT: Test passed with no bugs, all green.
    }

    @Test
    /*
    This test is used to see what happens when my size is 1 element. This is sort
    of my way to compare it to how a merge sort method would work since it breaks
    down arrays all the way down to its most basic, sorted form which is having one
    element.
     */
    public void newSortingT5(){

        // Creating my unsorted array and expected output
        int[] a = {5,4,3,2,1};
        int[] exp = {1,2,3,4,5};

        // Creating my newSorting object and calling the method newSorting inside of
        // newSorting class and passing my unsorted array.
        newSorting ns = new newSorting();
        ns.newSorting(a,1);

        // Using my tester to compare the two array references
        assertArrayEquals(exp, a);

        // RESULT: Test passed with no bugs, all green.
    }
}
