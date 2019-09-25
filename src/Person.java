public class Person {

    private String name;

//  person constructor
    public Person (String name) {
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + this.getName());
    }

    public static void main (String[] args) {
        Person jason = new Person("Jason");
        jason.setName("Jason");

    }

}