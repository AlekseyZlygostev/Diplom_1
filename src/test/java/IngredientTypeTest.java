import org.junit.Assert;
import org.junit.Test;
import praktikum.IngredientType;

public class IngredientTypeTest {
    @Test
    public void testSauce(){
        Assert.assertNotNull(IngredientType.valueOf("SAUCE"));
    }

    @Test
    public void testFilling(){
        Assert.assertNotNull(IngredientType.valueOf("FILLING"));
    }
}

