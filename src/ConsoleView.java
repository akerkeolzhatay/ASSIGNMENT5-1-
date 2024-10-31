import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayCurrentData(String data) {
        System.out.println("Current Data: " + data);
    }

    public String getNewData() {
        System.out.print("Enter new data: ");
        return scanner.nextLine();
    }

    public String getMoreData() {
        System.out.print("Enter another piece of data: ");
        return scanner.nextLine();
    }

    public void displayFinalData(String data) {
        System.out.println("Final combined data : " + data);
    }
}