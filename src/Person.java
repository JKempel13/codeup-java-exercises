public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String sayHello(){
        return String.format("Hello, my name is %s!",name);
    }
//  person constructor
    public Person () {
        System.out.println("new person created");
    }

    public static void main (String[] args) {
        Person jason = new Person();
        jason.setName("jason");
        System.out.println(jason.sayHello());

    }

}