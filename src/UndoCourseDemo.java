import java.util.Stack;

class RegistrationN {

    private String studentName;
    private Stack<String> courses = new Stack<>();

    public RegistrationN(String studentName) {
        this.studentName = studentName;
    }

    public void addCourse(String code) {

        courses.push(code);

        System.out.println("Added " + code + " -> " + courses);
    }

    public void undoLastCourse() {

        if (courses.isEmpty()) {

            System.out.println("Nothing to undo");
            return;
        }

        String removed = courses.pop();

        System.out.println("Removed " + removed + " -> " + courses);
    }
}

public class UndoCourseDemo {

    public static void main(String[] args) {

        RegistrationN reg = new RegistrationN("Hodan");

        reg.addCourse("CA314");
        reg.addCourse("CA301");
        reg.addCourse("MA210");

        reg.undoLastCourse();
    }
}