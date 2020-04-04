public class Cat {
    private String name = "Мурзик";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Run() {
        System.out.println(name+" - кот идущий");
    }

    public void Jump() {
        System.out.println(name+" - кот прыгающий");
    }
}
