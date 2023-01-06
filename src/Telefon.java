public abstract class Telefon implements Printable {
    private int acumulytor;
    private int length;
    private int width;
    private String light;

    public int getAcumulytor() {
        return acumulytor;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getLight() {
        return light;
    }

    public Telefon(int acumulytor, int length, int width, String light) {
        this.acumulytor = acumulytor;
        this.length = length;
        this.width = width;
        this.light = light;
    }

public String getInfo(){
    return  "acumulytor: " + this.acumulytor + "\nlength: " + this.length + "\nwidth: " + this.width + " \nlight: " +
            this.light;
}

}
