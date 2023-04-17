package Model;

public class Building {
    private int x;
    private int y;
    private int height;
    private int width;
    private boolean usesRoad;
    private boolean isRoad;

    public Building(int x, int y, int height, int width, boolean usesRoad, boolean isRoad) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.usesRoad = usesRoad;
        this.isRoad = isRoad;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean usesRoad() {
        return usesRoad;
    }

    public void setUsesRoad(boolean usesRoad) {
        this.usesRoad = usesRoad;
    }

    public boolean isRoad() {
        return isRoad;
    }

    public void setRoad(boolean road) {
        isRoad = road;
    }
}
