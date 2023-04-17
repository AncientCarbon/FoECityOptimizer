package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private ArrayList<Building> buildings;

    public Calculator(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public ArrayList<Building> insertBuildings() {
        Scanner in = new Scanner(System.in);
        System.out.println("Press 'q' to finish");
        String letter = "0";
        while (!letter.equals("q")){
            letter = in.next();

        }
        return buildings;
    }
}
