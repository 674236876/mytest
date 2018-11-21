package com.myd.dao;

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
public class UserMapperTest {

    private Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

    @Resource
    private UserMapper userMapper;

    @Test
    public void getAll() {
        List<User> list = userMapper.getAll();
        logger.info(list.toString());
    }

}
