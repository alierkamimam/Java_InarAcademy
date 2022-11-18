package chapter.chapter11.homework.ex02;

import chapter.chapter10.homework.Exercises14.MyDate;

public class Employee extends Person {
    private String office;
    private int salary;
    MyDate dateHired;

    public Employee() {
        this(null, null, null, null, null, 0);
    }

    public Employee(String name, String address, String phoneNumber, String e_mail, String office, int salary) {
        super(name, address, phoneNumber, e_mail);
        this.office = office;
        this.salary = salary;
        dateHired = new MyDate();
    }

    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return this.dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOffice: " + getOffice() +
                "\nSalary: " + getSalary() + "$" + "\nHired Date: " + dateHired.toString();
    }
}
