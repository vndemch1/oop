public class Wall extends Barrier {
    public void setMeasure(int measure) {
        this.measure = measure;
        this.type = 1;
    }
    public int getMeasure() {
        return measure;
    }
    public int getType () {
        return type;
    }

}
