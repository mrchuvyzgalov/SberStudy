package ru.sbrf;

import java.util.List;

public class Department {
    private Person headOfDepartment;
    private String nameOfDepartment;
    private List<Person> workers;

    public Department() {

    }

    public Department(Person headOfDepartment, String nameOfDepartment, List<Person> workers) {
        this.headOfDepartment = headOfDepartment;
        this.nameOfDepartment = nameOfDepartment;
        this.workers = workers;
    }

    public Person getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(Person headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    public List<Person> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Person> workers) {
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Department{" +
                "headOfDepartment=" + headOfDepartment +
                ", nameOfDepartment='" + nameOfDepartment + '\'' +
                ", workers=" + workers +
                '}';
    }
}
