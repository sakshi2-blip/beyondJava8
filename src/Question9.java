public class Question9 {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Sakshi", 10);
        Student s2 = new Student(1, "Sakshi", 10);
        Student s3 = new Student(2, "Aarav", 9);

        // equals()
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false

        // hashCode()
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

    }
}
