package generator.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import generator.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
@Slf4j
@SpringBootTest
@ExtendWith({SpringExtension.class})
class StudentMapperTest {

    @Resource
    private StudentMapper studentMapper;
    @Test
    void insert() {
        Student student = new Student();
        student.setBirthday(new Date());
        student.setClazzId(1);
        student.setHometown("测试");
        student.setStudentName("测试");
        studentMapper.insert(student);
    }

    @Test
    void batchDelete() {
        List<Integer> integers = Arrays.asList(1001, 1002, 1003, 1004);
        int i = studentMapper.batchDelete(integers);
        log.info(i+"条数据被铲除");
    }

    @Test
    void batchInsert() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i <2; i++) {
            Student student = new Student();
            student.setClazzId(1);
            student.setStudentName("zhangsan"+1);
            student.setHometown("江苏苏州");
            student.setBirthday(new Date());
            students.add(student);
        }
        studentMapper.batchInsert(students);
    }

    @Test
    void batchUpdate() {
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <2; i++) {
            Student student = new Student();
            student.setStudentId(1001+i);
            student.setStudentName("江苏南京"+i);
            students.add(student);
        }
        studentMapper.batchUpdate(students);
    }

    @Test
    void findBy(){
        Student student = new Student();
        student.setHometown("苏苏");
        List<Student> students = studentMapper.findStudentBy(student);
        log.info(String.valueOf(students.size()));
        students.forEach(stu -> log.info(String.valueOf(stu)));
    }
    @Test
    void testPage(){
        PageHelper.startPage(1,2);
        List<Student> studentBy = studentMapper.findStudentBy(new Student());
        PageInfo<Student> of = PageInfo.of(studentBy);
        log.info(String.valueOf(of));
    }
}