package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem4Test {

    Problem4 problem4 = new Problem4();
    @Test
    public void permutePalindromeTest(){

        boolean expected = true;
        boolean actual = problem4.permutePalindrome("aab");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void permutePalindromeTest2(){
        boolean expected = true;
        boolean actual = problem4.permutePalindrome("a    a  b   ");
        Assert.assertEquals(expected, actual);
    }


}
