import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void setup(){
        developer = new Developer("James Stuart", "JH1234313", 23000.00);
    }

    @Test
    public void hasName(){
        assertEquals("James Stuart", developer.getName());
    }

    @Test
    public void hasNationalInsurance(){
        assertEquals("JH1234313", developer.getNationalInsurance());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1.00);
        assertEquals(23230.00,developer.getSalary(), 1);
    }

    @Test
    public void canPayBonus() {
        developer.payBonus();
        assertEquals(23230.00, developer.getSalary(), 1);
    }
}

