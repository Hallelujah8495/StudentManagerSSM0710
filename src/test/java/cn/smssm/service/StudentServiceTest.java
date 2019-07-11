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


    @Test
    public void getTotal() {
    }

    @Test
    public void addStudent() {
        Student student = new Student();
        student.setAge(1);
        student.setBirthday(new Date());
        student.setName("hahaha3333");
        student.setSex("male");
        student.setStudent_id(3);
        studentService.addStudent(student);

    }

    @Test
    public void deleteStudent() {
    }

    @Test
    public void updateStudent() {
    }

    @Test
    public void getStudent() {
    }

    @Test
    public void list() {
    }
}
