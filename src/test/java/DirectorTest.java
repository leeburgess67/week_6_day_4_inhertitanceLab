import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup() {
        director = new Director("Susan McFee", "JH547489374G",  50000.00, 1000000.00);
    }


    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1.00);
        assertEquals(50500.00,director.getSalary(), 1);
    }

    @Test
    public void canPayBonus() {
        director.payBonus();
        assertEquals(50500.00, director.getSalary(), 1);
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000.00, director.getBudget(), 1);
    }

}
