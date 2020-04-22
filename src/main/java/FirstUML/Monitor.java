package FirstUML;

public class Monitor {
    Resoulution resoulution;
    private String model;
    private String manufacturer;

    public Monitor(Resoulution resoulution, String model, String manufacturer) {
        this.resoulution = resoulution;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public void drawPixel(int x, int y, String color){
      System.out.println("Drawing pixel at" + x + "," + y + " " + "in color " + color);
   }

    @Override
    public String toString() {
        return "Monitor{" +
                "resoulution=" + resoulution +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
