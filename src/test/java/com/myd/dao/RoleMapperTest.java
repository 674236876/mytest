package com.myd.dao;

import com.myd.entity.Role;
import com.myd.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * $DESCIRPTION
 *
 * @author zgp
 * @create 2018 - 11 - 20 17:10
 */
@MapperScan("com.myd.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleMapperTest {

    private Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

    @Resource
    private RoleMapper roleMapper;

    @Test
    public void getAll() {
        List<Role> list = roleMapper.getAll();
        for (Role role : list) {
            logger.info("角色名称:"+role.getName());
            List<User> users = role.getUsers();
            for (User user : users) {
                logger.info("用户名称:" + user.getName());
            }
        }
    }

}
