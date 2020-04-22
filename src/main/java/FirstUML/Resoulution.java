package FirstUML;

public class Resoulution {
    private int width;
    private int height;

    public Resoulution(int width, int height) {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Resoulution{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
