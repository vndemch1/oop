public class Robot {
    private String name = "NX-4";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Run() {
        System.out.println(name+" - робот идущий");
    }

    public void Jump() {
        System.out.println(name+" - робот прыгающий");
    }
}