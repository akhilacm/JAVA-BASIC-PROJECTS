// John Whedon 4596 - joh-whe-4596


public class Excercise {

    private String studentId;
    private String name;
    private String examId;

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getExamId() {
        return examId;
    }
    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String generateExamId() {
        String str = getName().substring(0,3 ) +"-"+ getName().substring(getName().indexOf(" ")+1, getName().indexOf(" ")+4);

        String[] parts = getName().split(" ");

        String examId = parts[0].substring(0,3) + "-" + parts[1].substring(0,3);
        return str + "-" + Integer.parseInt(this.getStudentId()) * 10;
    }

}
