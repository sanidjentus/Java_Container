import org.junit.*;
import java.util.Arrays;
import static org.junit.Assert.*;

public class TestContainer {
    public TestContainer(){}

    @Test
    public void addTest(){
        Container container = new Container();
        container.add(1);
        container.add(2);
        container.add(3);
        container.add(4);
        container.add(5);
        assertArrayEquals(container.array, new int[]{1,2,3,4,5,0});
    }

    @Test
    public void removeTest(){
        Container container = new Container();
        container.add(1);
        container.add(2);
        container.add(3);
        container.add(4);
        container.add(5);
        container.remove(3);
        assertArrayEquals(container.array, new int[]{1, 2, 4, 5});
    }
}
