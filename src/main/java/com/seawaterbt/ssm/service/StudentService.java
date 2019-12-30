package com.seawaterbt.ssm.service;

import com.baomidou.mybatisplus.service.IService;
import com.seawaterbt.ssm.entity.Student;

import java.util.List;

public interface StudentService extends IService<Student> {
    public List<Student> selectStudent();
}
