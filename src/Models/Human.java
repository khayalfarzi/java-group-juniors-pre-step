package Models;

public class Human {
    private String name;
    private String surname;
    private short dateOfBirth;
    private byte iqLevel;
    private String[][] nonWorkingActs;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public short getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(short dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public byte getIqLevel() {
        return iqLevel;
    }

    public void setIqLevel(byte iqLevel) {
        this.iqLevel = iqLevel;
    }

    public String[][] getNonWorkingActs() {
        return nonWorkingActs;
    }

    public void setNonWorkingActs(String[][] nonWorkingActs) {
        this.nonWorkingActs = nonWorkingActs;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name +
                ", surname='" + surname +
                ", dateOfBirth=" + dateOfBirth +
                ", iqLevel=" + iqLevel +
                '}';
    }

}
