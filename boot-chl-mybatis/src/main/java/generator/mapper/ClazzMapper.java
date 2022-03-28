package generator.mapper;

import generator.domain.Clazz;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 小曹同学
* @description 针对表【t_clazz】的数据库操作Mapper
* @createDate 2022-03-28 12:22:22
* @Entity generator.domain.Clazz
*/
@Mapper
public interface ClazzMapper  {

   Clazz findOneByMany(int clazzId);
}
