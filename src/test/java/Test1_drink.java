import com.MatteoOrlando.U5D2.entities.Drink;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Test1_drink {
    @Test
    public  void testDrinkToString() {
        Drink drink = new Drink("Cola", 150, 1.5);
        assertEquals("Drink{name='Cola', calories=150, price=1.5}", drink.toString());
    }
}
