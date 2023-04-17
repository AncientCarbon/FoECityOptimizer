package Model;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Building> buildings;

    public Calculator(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public ArrayList<Building> buildingsInCity() {

        return buildings;
    }
}
