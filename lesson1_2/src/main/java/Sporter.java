public class Sporter {
    private String name;
    private int maxHeight;
    private int maxDistance;

    public Sporter(String name, int maxHeight, int maxDistance) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }
    public String getName() {
        return name;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void canRun(int Distance) {
        if(maxDistance>=Distance){
            System.out.println(name + " успешно пробежал дистанцию, равную " + Distance);
        } else {
            System.out.println(name + " не в состоянии пробежать дистанцию, равную " + Distance);
        }
    }

    public void canJump(int Height) {
        if(maxHeight>=Height){
            System.out.println(name + " успешно преодолел высоту, равную " + Height);
        } else {
            System.out.println(name + " не в состоянии преодолеть высоту, равную " + Height);
        }

    }
}
