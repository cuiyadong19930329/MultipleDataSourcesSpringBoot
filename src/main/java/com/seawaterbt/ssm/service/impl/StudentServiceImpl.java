package com.seawaterbt.ssm.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.seawaterbt.ssm.entity.Student;
import com.seawaterbt.ssm.mapper.StudentMapper;
import com.seawaterbt.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public List<Student> selectStudent() {
        return studentMapper.selectStudent();
    }
}
