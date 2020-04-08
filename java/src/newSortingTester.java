import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class newSortingTester {

    @Test
    public void newSortingTest2(){
        int[] nums = {5,4,3,2,1};
        int[] expected = {1,2,3,4,5};
        newSorting.newSorting(nums,2);

        assertArrayEquals(expected, nums);
    }
}
