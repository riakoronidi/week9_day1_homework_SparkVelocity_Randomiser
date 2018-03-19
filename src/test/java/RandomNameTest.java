import models.RandomName;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RandomNameTest {

    private RandomName randomName;

    @Before
    public void setUp() throws Exception {
        this.randomName = new RandomName();

    }

    @Test
    public void canGetAraySize() {
        assertEquals(8, randomName.getSizeFromList());
    }

    @Test
    public void canGetSize() {
        assertEquals(2, randomName.geSizeFromPairedList());
    }
}
