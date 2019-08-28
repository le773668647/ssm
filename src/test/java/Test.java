import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import ssm.bean.Doctor;
import ssm.dao.Dao;

import java.io.InputStream;
import java.util.List;

/**
 * @author zzzz
 * @create 2019-08-28 上午8:54
 */
public class Test {
    @org.junit.Test
    public void test() throws Exception{
        //读取配置文件
        InputStream in= Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        //生产SqlSession对象
        SqlSession session=factory.openSession();
        //使用SqlSession创建dao接口的代理对象
        Dao dao=session.getMapper(Dao.class);
        //使用代理对象执行方法
        List<Doctor> userList=dao.find();
        for (Doctor doctor:userList){
            System.out.println(doctor.toString());

        }

        session.close();
        in.close();
    }
}
