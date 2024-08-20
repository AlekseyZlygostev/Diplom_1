import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BunTest {

    String name = "transparent bun";
    float price = 100500;

    @Spy
    Bun bun = new Bun(name, price);

    @Test
    public void testGetName(){
        assertEquals(name, bun.getName());
    }

    @Test
    public void testGetPrice(){
        assertEquals(price, bun.getPrice(), 1);
    }


}
