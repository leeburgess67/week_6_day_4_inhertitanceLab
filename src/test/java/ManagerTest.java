import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup() {
        manager = new Manager("Johnny Smith", "Footwear", "JG875748573D", 25000);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Footwear", manager.getDeptName());
    }

    @Test
    public void

}
