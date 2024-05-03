import java.util.List;

public class CarRacing {

    public void startRace(List<Car> cars, int chance) {
        for (int i = 0; i < chance; i++) {
            carsRace(cars);
            printRace(cars);
        }
    }

    private void carsRace(List<Car> cars) {
        for (Car car : cars) {
            car.randomCarMoving();
        }
    }

    private void printRace(List<Car> cars) {
        System.out.println("실행결과");
        for (Car car : cars) {
            System.out.print(car.getCarName() + " : ");
            printPosition(car.getCarPosition());
            System.out.println();
        }
    }

    private void printPosition(int position) {
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
    }
}
