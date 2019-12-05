package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryTest {

    private Factory factory;

    @BeforeEach
    void setUp() {
        // Given
        factory = new Factory();
    }

    @Test
    public void shipping_one_container_to_warehouse_A_should_take_5_hours() {
        // When
        int result = factory.shipTo("A");
        // Then
        assertThat(result).isEqualTo(5);
    }

    @ParameterizedTest
    @CsvSource({
            "AB, 5",
            "BBA, 13"
    })
    public void shipping_two_containers_to_warehouses_AB_should_take_5_hours(String numberOfContainers, int expected) {
        // When
        int result = factory.shipTo(numberOfContainers);
        // Then
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "B, 4",
            "BB, 4",
            "BBB, 12",
            "BBBB, 12",
            "BBBBBBB, 28"
    })
    public void shipping_n_containers_to_warehouse_B_should_take_p_hours(String numberOfContainers, int expected) {
        // When
        int result = factory.shipTo(numberOfContainers);
        // Then
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "AA, 13"

    })
    public void shipping_n_containers_to_warehouse_A_should_take_p_hours(String numberOfContainers, int expected) {
        // When
        int result = factory.shipTo(numberOfContainers);
        // Then
        assertThat(result).isEqualTo(expected);
    }
}
