import com.monash.Airplane;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("Test whether the airplaneModel field correctly returns the field's expected value.")
    void testGetAirplaneModel() {
        assertEquals("Boeing 747", airplane.getAirplaneModel());
    }

    @Test
    @DisplayName("Test whether the airplaneModel field correctly sets to a new value.")
    void testSetAirplaneModel() {
        airplane.setAirplaneModel("Airbus A350");
        assertEquals("Airbus A350", airplane.getAirplaneModel());
    }

    @Test
    @DisplayName("Test whether the airplaneModel does not change when an empty string is passed")
    void testSetAirplaneModelToEmptyString() {
        airplane.setAirplaneModel("");
        assertEquals("Airbus A350", airplane.getAirplaneModel());
    }

    @Test
    @DisplayName("Test whether the businessSitsNumber field correctly returns the field's expected value.")
    void testGetBusinessSitsNumber() {
        assertEquals(20, airplane.getBusinessSitsNumber());
    }

    @Test
    @DisplayName("Test whether the businessSitsNumber field correctly sets to a new value.")
    void testSetBusinessSitsNumber() {
        airplane.setBusinessSitsNumber(25);
        assertEquals(25, airplane.getBusinessSitsNumber());
    }

    @Test
    @DisplayName("Test whether the airplaneID field correctly returns the field's expected value.")
    void testGetAirplaneId() {
        assertEquals(22481, airplane.getAirplaneID());
    }

    @Test
    @DisplayName("Test whether the airplaneID field correctly sets to a new value.")
    void testSetAirplaneId() {
        airplane.setAirplaneID(22113);
        assertEquals(22113, airplane.getAirplaneID());
    }
}
