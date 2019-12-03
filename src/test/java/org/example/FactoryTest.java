package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryTest {

    private Factory factory;

    @BeforeEach
    void setUp() {
        //Given
        factory = new Factory();
    }

    @Test
    public void shipping_one_container_to_warehouse_B_should_take_4_hours() {
        //When
        int result = factory.shipTo("B");
        //Then
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void shipping_one_container_to_warehouse_A_should_take_5_hours() {
        //When
        int result = factory.shipTo("A");
        //Then
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void shipping_two_containers_to_warehouse_BB_should_take_4_hours() {
        //When
        int result = factory.shipTo("BB");
        //Then
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void shipping_two_containers_to_warehouse_AB_should_take_5_hours() {
        //When
        int result = factory.shipTo("AB");
        //Then
        assertThat(result).isEqualTo(5);
    }
}
