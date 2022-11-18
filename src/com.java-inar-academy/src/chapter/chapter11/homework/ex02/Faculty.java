package chapter.chapter11.homework.ex02;

public class Faculty extends Employee {
    private int officeHour;
    private int rank;


    public Faculty() {

    }

    public Faculty(String name, String address, String phoneNumber, String e_mail, String office, int salary, int officeHour, int rank) {
        super(name, address, phoneNumber, e_mail, office, salary);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public int getOfficeHour() {
        return this.officeHour;
    }

    public void setOfficeHour(int officeHour) {
        this.officeHour = officeHour;
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString() {
        return super.toString() + "\nOffice Hour: " + getOfficeHour() + "\nRank: " + getRank();
    }
}


