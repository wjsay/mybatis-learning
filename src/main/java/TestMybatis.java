import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class TestMybatis {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = null;
        SqlSession sqlSession = null;
        try {
            Reader reader = Resources.getResourceAsReader("mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sqlSessionFactory.openSession();
            //StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            //Student student = studentMapper.queryStudentBySno("20171508");
            String statement = "StudentMapper.queryStudentBySno";
            Student student = sqlSession.selectOne(statement, "20171508");
            System.out.println(student.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) sqlSession.close();
        }

    }
}
