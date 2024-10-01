package com.ideaclick.poc.service.impl;

import org.springframework.stereotype.Service;

import com.ideaclick.poc.dto.studentDTO;
import com.ideaclick.poc.entity.studentEntity;
import com.ideaclick.poc.mapper.studentMapper;
import com.ideaclick.poc.repository.studentRepo;
import com.ideaclick.poc.service.studentService;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class studentServiceImpl implements studentService {

    studentRepo studentRepo;

    @Override
    public studentDTO createStudent(studentDTO studentDTO) {

        studentEntity studentEntity = studentMapper.studentDTOToEntity(studentDTO);
        studentEntity = studentRepo.save(studentEntity);
        studentDTO finalStudentDTO = studentMapper.studentEntityToDTO(studentEntity);

        return finalStudentDTO;

    }
    
}
