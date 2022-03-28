package generator.mapper;

import generator.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 小曹同学
* @description 针对表【t_teacher】的数据库操作Mapper
* @createDate 2022-03-28 12:22:25
* @Entity generator.domain.Teacher
*/
@Mapper
public interface TeacherMapper {

    Teacher findOneByOne(Integer id);
}
