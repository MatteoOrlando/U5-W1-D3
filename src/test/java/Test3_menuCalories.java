import com.MatteoOrlando.U5D2.entities.Menu;
import com.MatteoOrlando.U5D2.entities.Pizza;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

// per testare l'uguaglianza fra due numeri interi, ho importato quello adatto, da non confondere con il JSONAssert, che confronta stringhe
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test3_menuCalories {

    @Test
    public void testMenuTotalCalories() {
        Menu menu = new Menu(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(new Pizza("Margherita", null, false));
        pizzaList.add(new Pizza("Hawaiian", null, false));
        menu.setPizzaList(pizzaList);
        //richiamo il metodo totalCalories precedentemente creato nella classe Menu
        assertEquals(2024, menu.totalCalories());
    }

}