package test;

import com.refactor.DealGeneration.Course;
import com.refactor.DealGeneration.Student;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenchai on 2015/8/27.
 */
public class CourseTest extends TestCase {

    private Course course;
    private List<Student> students = new ArrayList<Student>();
    Student stu = new Student();
    Student stu2 = new Student();

    @Test
    public void testIsAttending() throws Exception {


        stu.setName("cain1");
        stu2.setName("cain2");
        students.add(stu);
        course = new Course(students);
        assertEquals(true, course.isAttending(stu));
        assertEquals(true, course.isAttending(stu2));

    }

    @Test
    public void testSexStatistic() {
        stu.setName("cain3");
        stu.setSex("M");
        students.add(stu);
        course = new Course(students);
        assertEquals("M:1;W:0", course.getSexStatis());

    }
}