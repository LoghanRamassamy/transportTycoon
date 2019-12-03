package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void sending_one_container_to_warehouse_B_should_take_4_hours() {
        Factory factory = new Factory();
        int result = factory.ship("B");
        Assertions.assertThat(result).isEqualTo(4);
    }
}
