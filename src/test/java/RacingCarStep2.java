import java.util.Random;
import java.util.Scanner;

public class RacingCarStep2 {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String[] carNames; // 자동차의 이름
    int[] carLocations; // 각 자동차의 위치
    int cnt; // 주어진 횟수
    int n;   // 참여하는 자동차의 대수

    // 참여하는 자동차의 대수 n을 입력받아 정하는 메서드
    public void setN(){
        n = scanner.nextInt();
        scanner.nextLine();
    }

    // 주어진 횟수 cnt를 입력받아 정하는 메서드
    public void setCnt(){
        cnt = scanner.nextInt();
        scanner.nextLine();
    }

    // 자동차의 carNames를 초기화 해주는 메서드
    public void setCarNames() {
        carNames = new String[n];
    }

    // 자동차의 carNames를 사용자로부터 입력받는 메서드
    public void getCarNames() {
        for (int i = 0; i < cnt; i++) {
            carNames[i] = scanner.nextLine();
        }
    }

    // 자동차의 carLocations을 초기화해주는 함수
    public void setCarLocations(){
        carLocations = new int[n];
        // int 배열을 선언하면 기본값으로 초기화 된다?
    }

    // 랜덤으로 나온 값에 대해서 차가 움직이는 함수
    public void randomCarMoving(int carIndex){
        if (random.nextInt(10) >= 4) {
            carLocations[carIndex]++;
        }
    }

    // 참여한 모든 차가 1번 움직이는 함수
    public void randomAllCarsMoving() {
        for (int i = 0; i < n; i++) {
            randomCarMoving(i);
        }
    }

    // 차들이 n회 동안 반복
    public void racingGame(){
        for (int i = 0; i < cnt; i++) {
            randomAllCarsMoving();
        }
    }
}
