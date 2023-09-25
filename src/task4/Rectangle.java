package task4;

public class Rectangle {

    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.setHeight(height);
        this.setWidth(width);
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int area() {
        return this.width * this.height;
    }
}