import java.util.ArrayList;
import java.util.List;


public class CheckWinner {

    private int maxPosition = -1;
    private List<Car> winners = new ArrayList<>();

    public void checkAll(List<Car> cars) {
        for (Car car : cars) {
            checkCar(car);
        }
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

    public void printWinner() {
        for (int i = 0; i < winners.size(); i++) {
            System.out.print(winners.get(i).getCarName());
            if (i < winners.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("가 최종 우승했습니다.");
    }
}
