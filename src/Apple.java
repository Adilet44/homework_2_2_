public class Apple extends Telefon implements Printable{
    private String karobka;
    private int kameraMps;

    public String getKarobka() {
        return karobka;
    }

    public int getKameraMps() {
        return kameraMps;
    }

    public Apple(int acumulytor, int length, int width, String light,String karobka,int kameraMps) {
        super(acumulytor, length, width, light);
        this.karobka = karobka;
        this.kameraMps=kameraMps;
    }

    @Override
    public void print() {
        System.out.println(getInfo());

    }

    @Override
    public String getInfo() {
        return super.getInfo()+"karobka: " + this.karobka + "\nkameraMps: " + this.kameraMps;
    }
}
