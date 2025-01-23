import java.util.*;

public class L_two_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();
        String grade;
        String remark;
        double percent = (physics + chemistry + maths) / 3;
        if (percent >= 80) {
            remark = "Level=4";
            grade = "A";
        } else if (percent >= 70 && percent <= 79) {
            remark = "Level=3";
            grade = "B";
        } else if (percent >= 60 && percent <= 69) {
            remark = "Level=2";
            grade = "C";
        } else if (percent >= 50 && percent <= 59) {
            remark = "Level=1";
            grade = "D";
        } else if (percent >= 40 && percent <= 49) {
            remark = "Level=1-";
            grade = "E";
        } else {
            remark = "Remedial standards";
            grade = "R";
        }
        System.out.println("average marks " + percent + " +remark: " + remark + " grade: " + grade);
        sc.close();
    }
}
