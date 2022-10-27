public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }
    public Pet() {
        name = "Bentley";
        age = 3;
        location = "Long Beach Animal Shelter";
        type = "Dog";
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String toString() {
        return "Pet{ name: " + name  +
                "\n      age: " + age +
                "\n location: " + location +
                "\n     type: " + type +
                "}";
    }
}
