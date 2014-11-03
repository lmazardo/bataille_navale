package iut;

import iut.BatailleNavale;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatailleNavaleTest {


    @Test
    public void verifyBatailleNavaleIsNotLaunched() {

        BatailleNavale batailleNavale = new BatailleNavale();

        assertEquals(false, batailleNavale.isRunning());
    }
}
