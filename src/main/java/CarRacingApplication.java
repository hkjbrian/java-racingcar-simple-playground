public class CarRacingApplication {

    public static void main(String[] args) {
        RacingInfo racingInfo = new RacingInfo();
        racingInfo.setRacingInfo();

        CarRacing race = new CarRacing();
        race.startRace(racingInfo.getCars(), racingInfo.getChance());

        CheckWinner checkWinner = new CheckWinner();
        checkWinner.checkAll(racingInfo.getCars());
        checkWinner.printWinner();
    }
}
