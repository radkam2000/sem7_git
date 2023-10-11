package People;

public class Student implements IPeopleInfo{
    private String index;

    public Student(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String HumanId() {
        return getIndex();
    }
}
