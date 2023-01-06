public class Redmi extends Telefon implements Printable {
    private int pamyt;
    private String program;

    public int getPamyt() {
        return pamyt;
    }

    public String getProgram() {
        return program;
    }

    public Redmi(int acumulytor, int length, int width, String light,int pamyt , String program) {
        super(acumulytor, length, width, light);
        this.pamyt=pamyt;
        this.program=program;
    }

    @Override
    public void print() {
        System.out.println(getInfo());
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "pamyt: " + this.pamyt + "\nprogram: " + this.program;
    }
}
