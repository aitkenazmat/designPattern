package pattern.builder.example1;

public class Person {
    private String lName;
    private String fFame;
    private String mMame;

    private Person() {
    }


    public String getlName() {
        return lName;
    }

    public String getfFame() {
        return fFame;
    }

    public String getmMame() {
        return mMame;
    }

    static class BuildPerson{

        private Person newPerson;

        public BuildPerson() {
            newPerson = new Person();
        }

        public BuildPerson withLName(String name){
            newPerson.lName = name;
            return this;
        }

        public BuildPerson withMName(String name){
            newPerson.mMame = name;
            return this;
        }

        public BuildPerson withFname(String name){
            newPerson.fFame = name;
            return this;
        }

        public Person build(){
            return newPerson;
        }
    }
}
