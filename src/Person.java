public class Person {
    private String myName;
    private int myAge;
    private String myGender;

    public Person(String name,int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }
    public String getName() {
        return myName;
    }
    public int getAge() {
        return myAge;
    }
    public String getGender() {
        return myGender;
    }
    public void setName(String myName) {
        this.myName = myName;
    }
    public void setAge(int myAge) {
        this.myAge = myAge;
    }
    public void setGender(String myGender) {
        this.myGender = myGender;
    }
    @Override
    public String toString() {
        return myName+", age:"+ myAge+", gender:"+myGender;
    }
}
