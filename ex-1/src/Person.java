public class Person {
    private String name;
    private Parrot parrot;

    public Person(String name, Parrot parrot) {
        this.name = name;
        this.parrot = parrot;
    }
    public String toString(){
        return name+"'s parrot's name is "+parrot.getName();
    }
}
