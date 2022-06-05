package com.eim.userservice.VO;

import com.eim.userservice.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private UserEntity user;
    private Department department;
}
