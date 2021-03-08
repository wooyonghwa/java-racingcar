package study.step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.step2.StringValidator;
import study.step3.Car;
import study.step3.NumberChecker;

import static org.assertj.core.api.Assertions.*;

public class CarRaceTest {

    @Test
    @DisplayName("전진 테스트")
    void 전진테스트(){
        Car car = new RandomRaceCar();
        car.move();
    }

    @Test
    @DisplayName("전진하는 조건 테스트, 4 이상일 경우 성공")
    void 전진조건테스트(){
        assertThat(NumberChecker.checkCondition()).isTrue();
    }
}
