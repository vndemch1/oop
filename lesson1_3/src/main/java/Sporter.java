public class Sporter {
    private String name;
    private int maxDistance;
    private int maxHeight;
    private int participate = 1; // может участвовать, при значении 0 сходит с дистанции
    public Sporter(String name,int distance,int height) {
        this.name = name;
        this.maxDistance = distance;
        this.maxHeight = height;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void canRun (int distance) {
        if (maxDistance >= distance) {
            System.out.println(name + " успешно пробежал дистанцию в " + distance);
        } else {
            System.out.println(name + " не смог пробежать дистанцию " + distance);
            System.out.println(name + " сходит с дистанции");
            participate = 0;
        }
    }
    public void canJump (int height) {
        if (maxHeight >= height) {
            System.out.println(name + " успешно прыгнул на высоту " + height);
        } else {
            System.out.println(name + " не смог прыгуть на высоту " + height);
            System.out.println(name + " сходит с дистанции");
            participate = 0;
        }
    }

    public void canDoIt (int type, int obstacle) {
        if (participate != 0) {
            if (type == 1) {
                // Стена
                canJump(obstacle);
            }
            if (type == 2) {
                canRun(obstacle);
            }
        }
    }

    public int getParticipate() {
        return participate;
    }
    public String getName() {
        return name;
    }

}
