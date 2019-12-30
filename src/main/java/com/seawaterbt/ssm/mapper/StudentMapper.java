package com.seawaterbt.ssm.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.seawaterbt.ssm.entity.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper extends BaseMapper<Student> {
    @Select("select * from t_student")
    List<Student> selectStudent();
}
