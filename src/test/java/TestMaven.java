import com.arr.HelloWorld;
import org.junit.Test;
import org.junit.Assert;

public class TestMaven {

    @Test
    public void testHello() {
    HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.getHello());
        Assert.assertEquals("Hello World!", helloWorld.getHello());
    }
}
