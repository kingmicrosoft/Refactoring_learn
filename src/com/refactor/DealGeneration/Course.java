package com.refactor.DealGeneration;

import java.util.List;

/**
 * Created by wenchai on 2015/8/27.
 */
public class Course {
    private List<Student> students;
    private int mNumber;
    private int wNumber;
    private String name;
    private int orderid;
    private  int basicScore;
private  String partiment;
    public boolean isAttending(Student stu) {

        return students.contains(stu);
    }

    public String getSexStatis() {
        for (Student stu : students) {
            if (stu.isMan()) {
                mNumber++;
            } else {
                wNumber++;
            }
        }
        return "M:" + mNumber + ";W:" + wNumber;
    }

    public Course(List<Student> students) {
        this.students = students;
    }

}
