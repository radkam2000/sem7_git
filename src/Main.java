// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Employeee number");
        Student s = new Student("index number");

        Main main = new Main();
        main.print(t);
        main.print(s);

    }
    public void print(IPeopleInfo i){
        System.out.println(i.HumanId());
    }
}