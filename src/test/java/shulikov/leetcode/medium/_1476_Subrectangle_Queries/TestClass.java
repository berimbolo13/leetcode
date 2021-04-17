package shulikov.leetcode.medium._1476_Subrectangle_Queries;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void example_1() {
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(new int[][]{{1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1}});
        subrectangleQueries.print();
        assertEquals(1, subrectangleQueries.getValue(0, 2));
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        subrectangleQueries.print();
        assertEquals(5, subrectangleQueries.getValue(0, 2));
        assertEquals(5, subrectangleQueries.getValue(3, 1));
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        subrectangleQueries.print();
        assertEquals(5, subrectangleQueries.getValue(0, 2));
        assertEquals(10, subrectangleQueries.getValue(3, 1));
    }

}
