package cn.smssm.service;

import cn.smssm.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class StudentServiceTest {

    @Resource
    private StudentService studentService;

    Student student = new Student();

    @Test
    public void getTotal() {
        int total = studentService.getTotal();
        System.out.println("getTotal===>>>" + total);
    }

    @Test
    public void addStudent() {

        for(int i = 1; i <= 10; i++){
            student.setAge(i);
            student.setBirthday(new Date());
            student.setName("the No."+ i + " student");
            student.setSex("male");
            student.setStudent_id(i);
            studentService.addStudent(student);
        }


    }

    @Test
    public void deleteStudent() {
        studentService.deleteStudent(1);
    }

    @Test
    public void updateStudent() {
        student.setId(1);
        student.setName("The First Student");
        studentService.updateStudent(student);
    }

    @Test
    public void getStudent() {
    }

    @Test
    public void list() {
    }
}
