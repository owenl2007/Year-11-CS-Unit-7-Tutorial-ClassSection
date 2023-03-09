public class Student {

    //properties
    private int id;


    private String firstName;

    private String lastName;


    private int age;
    private int yearLevel;
    private static int studentCount;

    //constructors
    public Student (String firstName, String lastName, int age, int yearLevel){
        this.firstName=firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
        this.id = studentCount++;



    }

    public int getId(){
        return id;


    }

    public void setId(int num){ id = num; }



    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String name){
        firstName = name;

    }
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String name){
        lastName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int level){
        yearLevel = level;
    }

    public int getStudentCount(){
        return studentCount;
    }
    public boolean equals(Student student) {
        return (id == student.id && age == student.age && yearLevel == student.yearLevel && firstName.equals(student.firstName) && lastName.equals(student.lastName));
    }

    public String toString() {
        return "Student{id=" + id + ", firstName='" + firstName + "', lastName='"+lastName+"', age="+ age +"}";
    }
}