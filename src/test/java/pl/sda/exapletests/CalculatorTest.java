package pl.sda.exapletests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    @DisplayName("Kiedy 1+2=3")
    @Test
    public void test() {
        //given
        int a = 1;
        int b = 2;
        //when
        int sum = Calculator.add(a, b);
        //then
        assertThat(sum).isEqualTo(3);
    }

    @ParameterizedTest(name = "first{0} second{1}, result{2}")
    @CsvSource({
            "2,4,6",
            "3,3,6",
            "2,5,7"
    })
    @DisplayName("given to numbers when add")
    public void test1(int a, int b, int expected) {
        //given

        //when
        int sum = Calculator.add(a, b);
        //then
        assertThat(sum).isEqualTo(expected);
    }
}