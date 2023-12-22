package src;

public class Employee {
    private final int tabelNumber;
    private final String phoneNumber;
    private final String name;
    private final int workExperience;

    public Employee(int tabelNumber, String phoneNumber, String name, int workExperience) {
        this.tabelNumber = tabelNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.workExperience = workExperience;
    }

    public int getTabelNumber() {
        return tabelNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getWorkExperience() {
        return workExperience;
    }


}
