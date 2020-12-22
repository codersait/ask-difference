public class Main {

    public static void main(String[] args) {
        var parrot = new Parrot("koko");
	    var person = new Person("sait",parrot);

        System.out.println(person);
    }
}
