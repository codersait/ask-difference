public class Person {
    private String name;
    private Parrot parrot;

    public Person(String name,String parrotName) {
        this.name = name;
        this.parrot = new Parrot(parrotName);
    }
    public String toString(){
        return name+"'s parrot's name is "+parrot.getName();
    }
}
