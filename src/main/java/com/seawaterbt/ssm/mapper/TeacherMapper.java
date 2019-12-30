package com.seawaterbt.ssm.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.seawaterbt.ssm.entity.Student;
import com.seawaterbt.ssm.entity.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper extends BaseMapper<Teacher> {
    @Select("select * from t_teacher")
    List<Teacher> selectTeacher();
}
