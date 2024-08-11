import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import java.util.List;

import static org.hamcrest.CoreMatchers.notNullValue;
import static praktikum.IngredientType.*;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    @Mock
    Bun bun;

    @Mock
    List<Ingredient> ingredients;

    @Mock
    Ingredient ingredient;

    @Spy
    Burger burger = new Burger();

    @Before
    public void fillList(){
        burger.setBuns(new Bun("black bun", 100));
        burger.addIngredient(new Ingredient(SAUCE, "sour cream", 200));
        burger.addIngredient(new Ingredient(FILLING, "sausage", 300));
    }

    @Test
    public void testSetBuns(){
        burger.setBuns(bun);
        Mockito.verify(burger).setBuns(bun);
    }

    @Test
    public void testAddIngredient(){
        burger.addIngredient(ingredient);
        Mockito.verify(burger).addIngredient(ingredient);
    }

    @Test
    public void testRemoveIngredient() {
        burger.removeIngredient(0);
        Mockito.verify(burger).removeIngredient(0);
    }

    @Test
    public void testMoveIngredient() {
        burger.moveIngredient(0,1);
        Mockito.verify(burger).moveIngredient(0, 1);
    }

    @Test
    public void testGetPrice() {
        //burger.getPrice();
        Assert.assertEquals(700F, burger.getPrice(), 1);
    }

    @Test
    public void testGetReceipt() {
        //burger.getReceipt();
        MatcherAssert.assertThat(burger.getReceipt(), notNullValue());
    }

}
