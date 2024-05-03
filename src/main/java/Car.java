import java.util.Random;

public class Car {

    final private static int DEFAULT_POSITION = 0;

    private String carName;
    private int carPosition = DEFAULT_POSITION;

    public Car(String carName) {
        this.carName = carName;
    }

    public void randomCarMoving() {
        Random random = new Random();
        int randomNumber = random.nextInt(0, 10);

        if (randomNumber >= 4) {
            carPosition++;
        }
    }

    public int getCarPosition() {
        return carPosition;
    }

    public String getCarName() {
        return carName;
    }
}
