package FirstUML;

public class Main {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(20,55,5);
        Case case1 = new Case("H420","Sony","240 Volts", dimension);
        Resoulution resoulution = new Resoulution(10,10);
        Monitor monitor1 = new Monitor(resoulution,"HP","27 inch Beast");
        MotherBoard motherBoard1 = new MotherBoard("B3 300","Pentium",4,"v.244");
        PC pc1 = new PC(case1, monitor1, motherBoard1);
        pc1.description();
        pc1.powerUp();


    }
}
