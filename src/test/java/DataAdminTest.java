import org.junit.Before;
import org.junit.Test;
import techStaff.DataAdmin;

import static org.junit.Assert.assertEquals;

public class DataAdminTest {
    DataAdmin dataAdmin;

    @Before
    public void setup(){
        dataAdmin = new DataAdmin("Simon Swanny", "JH1254533", 20000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Simon Swanny", dataAdmin.getName());
    }

    @Test
    public void hasNationalInsurance(){
        assertEquals("JH1254533", dataAdmin.getNationalInsurance());
    }


    @Test
    public void canRaiseSalary(){
        dataAdmin.raiseSalary(1.00);
        assertEquals(20200.00,dataAdmin.getSalary(), 1);
    }

    @Test
    public void canPayBonus() {
        dataAdmin.payBonus();
        assertEquals(20200.00, dataAdmin.getSalary(), 1);
    }
}
