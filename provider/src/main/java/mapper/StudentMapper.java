package mapper;

import entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    int insert(Student student);
    int insertList(List<Student> list);
    Student selectByPrimaryKey(Integer id);
    List<Student> selectByName(String name);
    List<Student> selectByNameAndAge(@Param("name") String name, @Param("age") Integer age);
}
