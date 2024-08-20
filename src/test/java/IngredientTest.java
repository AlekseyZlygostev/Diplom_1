import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Ingredient;
import praktikum.IngredientType;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class IngredientTest {


    String name = "aliensMeat";
    float price = 777;
    IngredientType type = IngredientType.SAUCE;

    @Spy
    Ingredient ingredient = new Ingredient(type, name, price);

    @Test
    public void testGetPrice() {
        assertEquals(price, ingredient.getPrice(), 1);
    }

    @Test
    public void testGetName() {
        assertEquals(name, ingredient.getName());
    }

    @Test
    public void testGetType() {
        assertEquals(type, ingredient.getType());
    }
}
