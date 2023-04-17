import Model.Reader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your city here: ");
        Reader reader = new Reader();
        reader.getData(in.nextLine());
    }
}