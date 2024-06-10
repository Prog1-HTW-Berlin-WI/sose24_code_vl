public class Course {
    private String name;
    private Teacher teacher;
    private Person[] students;
    private String major = "Business Informatics";
    // Examples for further attributes:
    //    private String room;
    //    private int semester;
    //    private int credits;

    public Course(String name, int maxStudents) {
        this.name = name;
        if (maxStudents < 1) {
            maxStudents = 1;
        }
        students = new Person[maxStudents];
    }

    public boolean enrollStudent(Person studentIn) {
        boolean success = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                success = true;
                students[i] = studentIn;
                break; // without break, the person would be set for any free array index
            }
        }
        return success;
    }

    public void listStudents() {
        System.out.println("Participants in course " + name + " (Major " + major + "), held by " + teacher.getTitle() + " " + teacher.getName() + ":");
        for (Person person : students) {
            System.out.println(" - " + person.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Person[] getStudents() {
        return students;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
