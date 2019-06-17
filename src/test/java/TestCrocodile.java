import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCrocodile {

    @Test
    public void TestingTest() {
        Crocodile crocodile = new Crocodile();

        crocodile.setSize("Big");
        String crocodileSize = crocodile.getSize();
        System.out.println(crocodileSize);
        assertThat(crocodileSize).isEqualTo("Big");

        crocodile.setColor("Green");
        String crocodileColor = crocodile.getColor();
        System.out.println(crocodileColor);
        assertThat(crocodileColor).isEqualTo("Green");

        crocodile.setName("Gena");
        String crocodileName = crocodile.getName();
        System.out.println(crocodileName);
        assertThat(crocodileName).isEqualTo("Gena");

        crocodile.setLength(5);
        int crocodileLength = crocodile.getLength();
        System.out.println(crocodileLength);
        assertThat(crocodileLength).isEqualTo(5);

        crocodile.setHungry(true);
        boolean crocodileHungry = crocodile.isHungry();
        System.out.println(crocodileHungry);
        assertThat(crocodileHungry).isEqualTo(true);

    }
}

