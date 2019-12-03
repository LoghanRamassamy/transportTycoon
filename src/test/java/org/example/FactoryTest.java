package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactoryTest {
    @Test
    public void shipping_one_container_to_warehouse_B_should_take_4_hours() {
        //Given
        Factory factory = new Factory();
        //When
        int result = factory.shipTo("B");
        //Then
        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    public void shipping_one_container_to_warehouse_A_should_take_5_hours() {
        //Given
        Factory factory = new Factory();
        //When
        int result = factory.shipTo("A");
        //Then
        Assertions.assertThat(result).isEqualTo(5);
    }
}
