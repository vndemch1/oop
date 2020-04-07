public abstract class Barrier {
    protected int type;
    protected int measure;

    public abstract void setMeasure(int measure);
    public abstract int getMeasure();
    public abstract int getType();
}
