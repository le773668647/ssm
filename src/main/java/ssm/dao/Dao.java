package ssm.dao;

import ssm.bean.Doctor;

import java.util.List;

/**
 * @author zzzz
 * @create 2019-08-28 上午8:17
 */
public interface Dao {
    public List<Doctor> find();
    public void add();
}
