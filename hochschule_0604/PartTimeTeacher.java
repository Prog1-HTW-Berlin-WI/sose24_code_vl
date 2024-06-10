public class PartTimeTeacher extends Teacher {
    private String mainJobTitle;

    public PartTimeTeacher(String name) {
        super(name);
    }

    public String getMainJobTitle() {
        return mainJobTitle;
    }

    public void setMainJobTitle(String mainJobTitle) {
        this.mainJobTitle = mainJobTitle;
    }
}
