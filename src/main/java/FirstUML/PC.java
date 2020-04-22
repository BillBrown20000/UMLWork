package FirstUML;

public class PC {
    Case case1;
    Monitor monitor;
    MotherBoard motherBoard;

    public PC(Case case1, Monitor monitor, MotherBoard motherBoard) {
        this.case1 = case1;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
    private void drawLogo(){
        monitor.drawPixel(0, 0, "");
    }
    public void description(){
        System.out.println("“Welcome to worst buy below is the description of the pc on sale today”" + this.case1 + this.monitor + this.motherBoard);
    }

    @Override
    public String toString() {
        return "PC{" +
                "case1=" + case1 +
                ", monitor=" + monitor +
                ", motherBoard=" + motherBoard +
                '}';
    }
    public void powerUp(){
        case1.pressPowerButton();
        motherBoard.loadProgram("");
    }
}
