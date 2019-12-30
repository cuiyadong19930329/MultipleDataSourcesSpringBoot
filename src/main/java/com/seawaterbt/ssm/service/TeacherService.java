package com.seawaterbt.ssm.service;

import com.baomidou.mybatisplus.service.IService;
import com.seawaterbt.ssm.entity.Teacher;

import java.util.List;


public interface TeacherService extends IService<Teacher> {
    List<Teacher> selectTeacher();
}
