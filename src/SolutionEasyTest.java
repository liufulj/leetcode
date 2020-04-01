import static org.junit.Assert.*;

public class SolutionEasyTest {

    @org.junit.Test
    public void singleNumber() {

    }

    @org.junit.Test
    public void majorityElement() {
        int input[] = new int[]{3,2,3};
        int output = 3;
        assertEquals(output,new SolutionEasy().majorityElement(input));
        input = new int[]{2,2,1,1,1,2,2};
        output = 2;
        assertEquals(output,new SolutionEasy().majorityElement(input));

    }

    @org.junit.Test
    public void defangIPaddr() {
        String input = "1.1.1.1";
        String output = "1[.]1[.]1[.]1";
        assertEquals(output,new SolutionEasy().defangIPaddr(input));
        input = "255.100.50.0";
        output = "255[.]100[.]50[.]0";
        assertEquals(output,new SolutionEasy().defangIPaddr(input));

    }


    @org.junit.Test
    public void numJewelsInStones() {
        String J = "aA",S = "aAAbbbb";
        int output = 3;
        assertEquals(output,new SolutionEasy().numJewelsInStones(J,S));

        J = "z";
        S = "ZZ";
        output = 0;
        assertEquals(output,new SolutionEasy().numJewelsInStones(J,S));

    }
}