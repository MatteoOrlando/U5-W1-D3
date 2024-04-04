import com.MatteoOrlando.U5D2.entities.Topping;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Test2_topping {

    @Test
    public void testToppingToString() {
        //ho creato un oggetto Topping con nome Mushroom e con i reltivi dati (prezzo, calorie)
        //confronto la stringa assert con quella restituita dal metodo toString()
        Topping topping = new Topping("Mushroom", 50, 0.75);
        assertEquals("Topping{name='Mushroom', calories=50, price=0.75}", topping.toString());
    }
}