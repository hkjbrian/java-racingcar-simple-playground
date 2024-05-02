import java.util.Scanner;

public class Testtest {
    private static Scanner scanner = new Scanner(System.in);
    String name;

    public void readName(String str){
        name = str;
    }

    public String getName(){
        return name;
    }
}
