import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCrocodile2 {
    Crocodile crocodile = new Crocodile();

    @Before
    public final void setUp() {

        crocodile.setSize("Big");
        crocodile.setColor("Green");
        crocodile.setName("Gena");
        crocodile.setLength(5);
        crocodile.setHungry(true);
    }

    @Test
    public void TestingTest2() {
        assertThat(crocodile.getSize()).isEqualTo("Big");
        assertThat(crocodile.getColor()).isEqualTo("Green");
        assertThat(crocodile.getName()).isEqualTo("Gena");
        assertThat(crocodile.getLength()).isEqualTo(5);
        assertThat(crocodile.isHungry()).isEqualTo(true);
    }

    @After
    public final void tearDown() {crocodile = null; }
}


