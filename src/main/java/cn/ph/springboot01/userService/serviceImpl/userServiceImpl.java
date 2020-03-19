package cn.ph.springboot01.userService.serviceImpl;

import cn.ph.springboot01.userBean.student;
import cn.ph.springboot01.userMapper.usermapper;
import cn.ph.springboot01.userService.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 22356
 * @Date 2020/3/19 15:39
 */
@Service
public class userServiceImpl implements userservice {

    @Autowired
    private usermapper mapper;

    @Override
    public student queryById(Integer id) {
        //根据ID查询
        return mapper.findOne(id);
    }

    @Override
    public List<student> queryAll() {
        //查询全部
        return mapper.findAll();
    }

    @Override
    public void add(student student) {
        //添加
        mapper.save(student);
    }

    @Override
    public void delById(Integer id) {
        //根据ID查询
        mapper.delete(id);
    }

    @Override
    public void updata(student student) {
        //修改
        mapper.saveAndFlush(student);
    }
}
