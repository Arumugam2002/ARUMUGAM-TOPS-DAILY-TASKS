/*  W.A.J.P to create a class Student with attributes roll no, name, age and course. 
Initialize values through parameterized constructor. If age of student is not in 
between 15 and 21 then generate user defined exception 
"AgeNotWithinRangeException". If name contains numbers or special symbols 
raise exception "NameNotValidException". Define the two exception classes.    */



class AgeNotWithinRangeException extends Exception 
{
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}


class NameNotValidException extends Exception 
{
    public NameNotValidException(String message) {
        super(message);
    }
}


class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException 
    {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        } else {
            this.age = age;
        }

        if (!name.matches("^[a-zA-Z\\s]+$")) {
            throw new NameNotValidException("Name should only contain alphabets and spaces.");
        } else {
            this.name = name;
        }

        this.rollNo = rollNo;
        this.course = course;
    }

    
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        } else {
            this.age = age;
        }
    }

    public void setCourse(String course) {
        this.course = course;
    }
}


public class Q40_AgeNotWithinException {
    public static void main(String[] args) {
        try {
            
            Student student1 = new Student(1, "Arumugam Pandaram", 18, "Computer Science");
            System.out.println("Student created: " + student1.getName());

            
            Student student2 = new Student(2, "Rahul Pandya", 22, "Mathematics");
            System.out.println("Student created: " + student2.getName());
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

