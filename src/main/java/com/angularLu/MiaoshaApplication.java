package com.angularLu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angularLu.dao.UserDOMapper;
import com.angularLu.dataobject.UserDO;

@SpringBootApplication

@MapperScan({"com.angularLu"})
@RestController
public class MiaoshaApplication {
	
	@Autowired
	private UserDOMapper userDOMapper;
	
	@RequestMapping("/")
	public String home(){
		
		UserDO userDO = userDOMapper.selectByPrimaryKey(1);
		if(userDO==null){
			return "用户对象不存在";
		}else{
			return userDO.getName();
		}
		
	}

	public static void main(String[] args) {
		SpringApplication.run(MiaoshaApplication.class, args);
	}

}

