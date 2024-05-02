import java.util.ArrayList;
import java.util.List;

public class CarRacing {

    private int participantsNumber; // 참여 자동차 대수
    private int chance; // 주어진 횟수

    private List<Car> cars = new ArrayList<>();

    public void readChance(int chance){
        this.chance = chance;
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
        int i = 0;
        for (String carName : carNames) {
            cars.get(i++).readCarName(carName);
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
