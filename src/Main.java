public class Person {
    private String name;

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public class Main{
        public static void main(String[] args) {
            Person person1 = new Person();
            person1.setName("John");
            System.out.println(person1.getName());

        }
    }

}