public class Human {
    private String name = "Вася";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Run() {
        System.out.println(name+" - человек идущий");
    }

    public void Jump() {
        System.out.println(name+" - человек прыгающий");
    }
}

