package CS102;

public class Lesson12_Polymorphism {
    public static void main(String[] args) {
        Person n = new Person("Nan", "aaa", "111", "nan@njcu");
        System.out.println();
        Student s = new Student("Ella", "aaa", "222", "ella@a",1);
        System.out.println(s);
        Employee e = new Employee("Emma", "aaa", "222", "emma@a",1000);
        System.out.println(e);
        Faculty f = new Faculty("Eddy","aaa","222","emma@a",1000,"professor");
        Staff s2 = new Staff("Allen","aaa","222","emma@a",1000,"Accountant");

        Person p2 = new Person("Ella", "aaa", "222", "ella@a");
        System.out.println(p2.toString());

        Person p3 = new Person("Ella", "aaa", "222", "ella@a");
        System.out.println(p3.toString());
    }
}

class Person {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(String n, String a, String p, String e) {
        name = n;
        address = a;
        phone = p;
        email = e;
    }

    //Object class is the ROOT for all classes in java
    //toString() return a string representation of the object
    //default: show the Class and reference of the object
    @Override
    public String toString() {
        return name;
    }
}

class Student extends Person {
    private int classStatus;

    public Student(){

    }
    public Student(String n, String a, String p, String e, int c){
        super(n, a, p, e);
        classStatus = c;
    }
    @Override
    public String toString() {
        return super.toString()+","+classStatus;
    }
}

class Employee extends Person {
    private java.util.Date dateHired;
    private double salary;

    public Employee() {
        dateHired = new java.util.Date();
    }

    public Employee(String n, String a, String p, String e, double s) {
        super(n, a, p, e);
        dateHired = new java.util.Date();
        salary = s;
    }

    @Override
    public String toString() {
        return super.toString() + "," + salary;
    }
}

class Faculty extends Person {
    private String rank;

    public Faculty(){

    }
    public Faculty (String n, String a, String p, String e, double s, String r){
        super(n,a,p,e);
        rank=r;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}

class Staff extends Person {
    private String title;

    public Staff(){

    }
    public Staff(String n, String a, String p, String e, double s, String t){
        super(n,a,p,e);
        title=t;
    }
    @Override
    public String toString() {
        return super.toString() + "," + title;
    }
}