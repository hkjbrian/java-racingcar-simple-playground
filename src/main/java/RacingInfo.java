import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingInfo {

    private List<Car> cars = new ArrayList<>();
    private String[] carNames;
    private static final Scanner scanner = new Scanner(System.in);
    private static final String CARNAME_REGEX = ",";
    private int chance;

    public void setRacingInfo() {
        readCarsNames();
        setCarsNames();
        setChance();
    }

    // 자동차의 이름들을 입력받는다.
    private void readCarsNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표로 구분)");
        carNames = scanner.nextLine().split(CARNAME_REGEX);
    }

    private void setCarsNames() {
        for (String carName : carNames) {
            Car car = new Car(carName);
            cars.add(car);
        }
    }

    private void setChance() {
        System.out.println("시도할 횟수는 몇회인가요?");
        this.chance = scanner.nextInt();
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getChance() {
        return chance;
    }

}
