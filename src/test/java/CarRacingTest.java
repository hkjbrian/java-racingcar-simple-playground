import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CarRacingTest {

    @ParameterizedTest
    @MethodSource("providedNames")
    @DisplayName("한 명이 우승하는 경우")
    public void carRacingTest(List<String> names) {
        CarRacing race = new CarRacing();
        race.readChance(5);
        race.startRace();
//        race.setCarsNames(names);
        CheckWinner checkWinner = new CheckWinner();
        checkWinner.checkAll(race.getCars());
        List<Car> winners = checkWinner.getWinners();
//        for (Car winner : winners) {
//            System.out.println("우승자 이름은 :" + winner.getCarName() + "거리는 :" + winner.getCarPosition());
//        }
    }

    private static Stream<List<String>> providedNames() {

        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");
        names.add("E");

        return Stream.of(names) ;
    }
}
