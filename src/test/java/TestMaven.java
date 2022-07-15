import com.arr.HelloWorld;
import com.arr.SolutionOne;
import com.arr.SolutionTwo;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class TestMaven {

    @Test
    public void testHello() {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.getHello());
        Assert.assertEquals("Hello World!", helloWorld.getHello());
    }

    @Test
    public void testSolutionOne1 (){
        SolutionOne one = new SolutionOne();
        Assert.assertEquals(3, one.numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    public void testSolutionOne2 (){
        SolutionOne one = new SolutionOne();
        Assert.assertEquals(0, one.numJewelsInStones("a", "AA"));
    }

    @Test
    public void testSolutionTwo1 (){
        SolutionTwo two = new SolutionTwo();
        Assert.assertEquals(4, two.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }

    @Test
    public void testSolutionTwo2 (){
        SolutionTwo two = new SolutionTwo();
        Assert.assertEquals(6, two.numIdenticalPairs(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void testSolutionTwo3 (){
        SolutionTwo two = new SolutionTwo();
        Assert.assertEquals(0, two.numIdenticalPairs(new int[]{1, 2, 3}));
    }

}

