package com.example.common.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author lwf
 * @Description //TODO
 */

@Data
@ApiModel("用户实体")
public class User {

    @ApiModelProperty("用户id")
    private Integer id;
    @ApiModelProperty("用户姓名")
    private String userName;
    @ApiModelProperty("用户密码")
    private String passWord;
}
