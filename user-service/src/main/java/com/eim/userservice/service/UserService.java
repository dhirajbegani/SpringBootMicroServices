package com.eim.userservice.service;

import com.eim.userservice.VO.Department;
import com.eim.userservice.VO.ResponseTemplateVO;
import com.eim.userservice.entity.UserEntity;
import com.eim.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public UserEntity saveUser(UserEntity user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserByUserId(Long userId) {
        log.info("Inside getUserByUserId of UserService");

        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();

        UserEntity user = userRepository.getUserByUserId(userId);
        Department department = restTemplate.getForObject("http://API-GATEWAY/departments/" + user.getDepartmentId() , Department.class);

        responseTemplateVO.setUser(user);
        responseTemplateVO.setDepartment(department);

        return responseTemplateVO;
    }
}
