package az.baku.Models;

public class Human {
    private String name;
    private String surname;
    private short dateOfBirth;
    private byte iqLevel;
    private String[][] nonWorkingActs;

    public Human(String name, String surname, short dateOfBirth, byte iqLevel, String[][] nonWorkingActs) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iqLevel = iqLevel;
        this.nonWorkingActs = nonWorkingActs;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public short getDateOfBirth() {
        return dateOfBirth;
    }

    public byte getIqLevel() {
        return iqLevel;
    }

    public String[][] getNonWorkingActs() {
        return nonWorkingActs;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Null pointers of Human were collected by garbage collector");
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

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
