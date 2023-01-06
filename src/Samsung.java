public class Samsung extends Telefon implements Printable{
    private String chehol;
    private String dezyn;

    public String getChehol() {
        return chehol;
    }

    public String getDezyn() {
        return dezyn;
    }

    public Samsung(int acumulytor, int length, int width, String light,String chehol,String dezyn) {
        super(acumulytor, length, width, light);
        this.chehol=chehol;
        this.dezyn=dezyn;
    }

    @Override
    public void print() {
        System.out.println(getInfo());

    }

    @Override
    public String getInfo() {
        return super.getInfo() + "chehol: " + this.chehol + "\ndezyn: " + this.dezyn;
    }
}
