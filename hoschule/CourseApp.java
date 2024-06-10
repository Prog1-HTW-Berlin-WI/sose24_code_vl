public class CourseApp {
    public static void main(String[] args) {
        Professor profSchmidt = new Professor("Anneliese Schmidt");
        profSchmidt.setAge(38);
        profSchmidt.setTitle("Prof. Dr.");

        Course progLecture = new Course("Prog1 Lecture", 10);
        progLecture.setTeacher(profSchmidt);

        Person[] interestedStudents = {
                new Person("Anja Adams"),
                new Person("Bella Bauer"),
                new Person("Clemens Christ"),
                new Person("Daniel Duesentrieb"),
                new Person("Elena Engel"),
                new Person("Fridolin Fuchs"),
                new Person("Gustavo Gomez"),
                new Person("Hannelore Hermann"),
                new Person("Irina Igel"),
                new Person("John Johnson"),
                new Person("Karla Kolumna"),
        };

        for (Person person : interestedStudents) {
            boolean eingeschrieben = progLecture.enrollStudent(person);
            if (eingeschrieben) {
                System.out.println("Successfully enrolled: " + person.getName());
            } else {
                System.out.println("No free place for " + person.getName());
            }
        }

        System.out.println("---------------");

        progLecture.listStudents();

        // ...

        Tutor tutorTimmy = new Tutor("Timmy Turbo");
        tutorTimmy.setAge(26);
        tutorTimmy.setTitle("M.Sc.");

        Course progExercise = new Course("Prog1 Exercise", 5);
        progExercise.setTeacher(profSchmidt);
    }
}
