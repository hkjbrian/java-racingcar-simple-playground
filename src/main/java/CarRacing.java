import java.util.ArrayList;
import java.util.List;

public class CarRacing {

    private int participantsNumber; // 참여 자동차 대수
    private int chance; // 주어진 횟수

    private List<Car> cars = new ArrayList<>();

    public void readChance(int chance){
        this.chance = chance;
    }

    public void readParticipantsNumber(int participantsNumber) {
        this.participantsNumber = participantsNumber;
    }

    public void startRace() {
        for (int i = 0; i < participantsNumber; i++) {
            makeCar();
        }
        for (Car car : cars) {
            carRace(car);
        }
    }

    private void makeCar() {
        Car newCar = new Car();
        cars.add(newCar);
    }

    private void carRace(Car car) {
        for (int i = 0; i < chance; i++) {
            car.randomCarMoving();
        }
    }

    public void setCarsNames(List<String> carNames) {

        for (int i = 0; i < participantsNumber; i++) {
            cars.get(i).readCarName(carNames.get(i));
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
