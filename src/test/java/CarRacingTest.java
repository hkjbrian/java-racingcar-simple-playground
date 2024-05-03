import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CarRacingTest {
    @Disabled
    @ParameterizedTest
    @MethodSource("providedNamesAndChanceAndParticipantsNumber")
    @DisplayName("두 경우의 레이스 테스트")
//    public void carRacingTest(List<String> names, int Chance, int ParticipantsNumber) {
//        System.out.println("게임 시작");
//        CarRacing race = new CarRacing();
//        race.readParticipantsNumber(5);
//        race.readChance(5);
//        race.startRace();
//        race.setCarsNames(names);
//        CheckWinner checkWinner = new CheckWinner();
//        checkWinner.checkAll(race.getCars());
//        List<Car> winners = checkWinner.getWinners();
//        for (Car winner : winners) {
//            System.out.println("우승자 이름은 : " + winner.getCarName() + ", 우승자의 거리는 : " + winner.getCarPosition());
//        }
//        System.out.println("게임 종료");
//    }

    private static Stream<Arguments> providedNamesAndChanceAndParticipantsNumber() {

        List<String> names1 = new ArrayList<>();
        names1.add("A");
        names1.add("B");
        names1.add("C");
        names1.add("D");
        names1.add("E");
        int chance1 = 5;
        int participantsNumber1 = 5;

        List<String> names2 = new ArrayList<>();
        names2.add("AA");
        names2.add("BB");
        names2.add("CC");
        names2.add("DD");
        names2.add("EE");
        names2.add("FF");
        int chance2 = 4;
        int participantsNumber2 = 6;
        return Stream.of(
                Arguments.arguments(names1, chance1, participantsNumber1),
                Arguments.arguments(names2, chance2, participantsNumber2));
    }
}
