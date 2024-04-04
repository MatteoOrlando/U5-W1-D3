import com.MatteoOrlando.U5D2.entities.Table;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_parametric {

    @ParameterizedTest
    @CsvSource({ "1, 4", "2, 6", "3, 2" })
    public void testMaxGuests(int tableNumber, int maxGuests) {
        Table table = new Table();
        table.setTableNumber(tableNumber);
        table.setMaxGuests(maxGuests);
        assertEquals(maxGuests, table.getMaxGuests());
    }
}