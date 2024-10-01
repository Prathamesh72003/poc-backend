package com.ideaclick.poc.mapper;

import com.ideaclick.poc.dto.studentDTO;
import com.ideaclick.poc.entity.studentEntity;

public class studentMapper {
    public static studentDTO studentEntityToDTO(studentEntity entity) {
        studentDTO dto = new studentDTO();
        dto.setPrn(entity.getPrn());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        dto.setPhone(entity.getPhone());
        dto.setGender(entity.getGender());
        dto.setAddress(entity.getAddress());
        dto.setResume(entity.getResume());
        dto.setLinkedin(entity.getLinkedin());
        return dto;
    }

    public static studentEntity studentDTOToEntity(studentDTO dto) {
        studentEntity entity = new studentEntity();
        entity.setPrn(dto.getPrn());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setPhone(dto.getPhone());
        entity.setGender(dto.getGender());
        entity.setAddress(dto.getAddress());
        entity.setResume(dto.getResume());
        entity.setLinkedin(dto.getLinkedin());
        return entity;
    }
}
