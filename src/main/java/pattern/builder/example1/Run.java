package pattern.builder.example1;

public class Run {
    public static void main(String[] args) {
        Person person = new Person.BuildPerson()
                .withLName("Aitken")
                .withFname("Azamat")
                //.withMName("Omarovich")
                .build();

        System.out.println("firstName: " + person.getfFame());
        System.out.println("lname:" + person.getlName());
        System.out.println("mname:"+person.getmMame());
    }
}
