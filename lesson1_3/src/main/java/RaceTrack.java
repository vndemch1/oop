public class RaceTrack extends Barrier {
    public void setMeasure(int measure) {
        this.measure = measure;
        this.type = 2;
    }
    public int getMeasure() {
        return measure;
    }
    public int getType () {
        return type;
    }
}
