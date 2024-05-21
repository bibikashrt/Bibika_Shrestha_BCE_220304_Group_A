public class Student {

    String name = "Bibika";
    String phone = "9880881833";
    String address = "Baluwataar";

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name + student.phone + student.address + "\n");
        System.out.println(student.name + "\n" + student.phone + "\n" + student.address + "\n");
        System.out.println(student.name + " " + student.phone + " " + student.address + " ");
    }

}
