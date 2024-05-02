import java.util.Random;

public class Car {

    final private static int DEFAULT_POSITION = 0;

    private String carName;
    private int carPosition = DEFAULT_POSITION;

    public void randomCarMoving() {
        Random random = new Random();
        int randomNumber = random.nextInt(0, 10);

        if (randomNumber >= 4) {
            carPosition++;
        }
    }

    public void readCarName(String name){
        carName = name;
    }

    public int getCarPosition(){
        return carPosition;
    }

    public String getCarName(){
        return carName;
    }
}
