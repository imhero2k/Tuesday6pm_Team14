import com.monash.Airplane;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirplaneTest {
    private Airplane airplane;

    @BeforeEach
    public void setUp() {
        airplane = new Airplane(
                22481,
                "Boeing 747",
                20,
                120,
                6
        );
    }

    @Test
    void testGetAirplaneModel() {
        assertEquals("Boeing 747", airplane.getAirplaneModel());
    }

    @Test
    void testSetAirplaneModel() {
        airplane.setAirplaneModel("Airbus A350");
        assertEquals("Airbus A350", airplane.getAirplaneModel());
    }
    @Test
    void testGetBusinessSitsNumber() {
        assertEquals(20, airplane.getBusinessSitsNumber());
    }
    @Test
    void testSetBusinessSitsNumber() {
        airplane.setBusinessSitsNumber(25);
        assertEquals(25, airplane.getBusinessSitsNumber());
    }
}
