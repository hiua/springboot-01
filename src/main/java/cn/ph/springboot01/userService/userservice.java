package cn.ph.springboot01.userService;

import cn.ph.springboot01.userBean.student;

import java.util.List;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 22356
 * @Date 2020/3/19 15:39
 */
public interface userservice {
//根据ID查询
    public student queryById(Integer id);
//查询全部
    public List<student> queryAll();
//添加person
    public void add(student student);
//根据ID删除
    public void delById(Integer id);
//修改
    public void updata(student student);
}
