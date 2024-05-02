import java.util.Random;

public class Car {

    private String carName;
    private int carPosiiton;

    public void randomCarMoving() {
        Random random = new Random();
        int randomNumber = random.nextInt(0, 10);

        if (randomNumber >= 4) {
            carPosiiton++;
        }
    }
}
