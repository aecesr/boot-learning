package generator.mapper;

import generator.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
* @author 小曹同学
* @description 针对表【t_student】的数据库操作Mapper
* @createDate 2022-03-28 12:22:25
* @Entity generator.domain.Student
*/
@Mapper
public interface StudentMapper {
    int insert(Student student);

    int batchInsert(@Param("students") List<Student> students);

    int batchDelete(@Param("ids")List<Integer> ids);

    int batchUpdate(@Param("students")List<Student> students);

    Student findStuBy(@Param("student")Student student);

    List<Student> findStudentBy(@Param("student")Student student);

}
