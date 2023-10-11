public class Teacher implements IPeopleInfo{
    private String EmplyoeeNumber;

    public String getEmplyoeeNumber() {
        return EmplyoeeNumber;
    }

    public void setEmplyoeeNumber(String emplyoeeNumber) {
        EmplyoeeNumber = emplyoeeNumber;
    }

    public Teacher(String emplyoeeNumber) {
        EmplyoeeNumber = emplyoeeNumber;
    }

    @Override
    public String HumanId() {
        return getEmplyoeeNumber();
    }
}
