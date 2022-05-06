package Model;

public class Staff {

    int staffID, salary;
    String staffName, gender, DOB, email, phone;

    public Staff() {

    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Staff(int staffID, int salary, String staffName, String gender, String DOB, String email, String phone) {
        this.staffID = staffID;
        this.salary = salary;
        this.staffName = staffName;
        this.gender = gender;
        this.DOB = DOB;
        this.email = email;
        this.phone = phone;
    }
}
