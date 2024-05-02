import java.util.ArrayList;
import java.util.List;


public class CheckWinner {

    private int maxPosition = -1;
    private List<Car> winners = new ArrayList<>();

    public List<Car> checkAll(List<Car> cars) {
        for (Car car : cars) {
            checkCar(car);
        }

        return winners;
    }

    private void checkCar(Car car) {
        if (car.getCarPosition() == maxPosition) {
            winners.add(car);
        }

        if (car.getCarPosition() > maxPosition) {
            winners.clear();
            winners.add(car);
            maxPosition = car.getCarPosition();
        }
    }

    public List<Car> getWinners() {
        return winners;
    }
}
