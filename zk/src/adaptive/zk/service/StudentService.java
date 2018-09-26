package adaptive.zk.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import adaptive.zk.dao.StudentMapper;
import adaptive.zk.domain.Student;
import adaptive.zk.util.MyBatisConnectionFactory;
import java.sql.Timestamp;
import java.util.Date;

public class StudentService {

	public List<Student> searchCriteria(Student student)
    {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
        List<Student> result = null;

		try
		{
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			result = mapper.searchCriteria(student);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			sqlSession.close();
		}
		return result;
    }
	
	public void insert(Student student)
	{
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		
		try
		{
			student.setCreateBy("System.Admin");
			student.setCreateOn(new Date());
			
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			mapper.insert(student);
			sqlSession.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			sqlSession.close();
		}
	}
	
	public void update(Student student)
	{
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();

		try
		{
			student.setUpdateBy("System.Admin");
			student.setUpdateOn(new Timestamp(System.currentTimeMillis()));

			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			mapper.update(student);
			sqlSession.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			sqlSession.close();
		}
	}
	
	public void delete(String studentNo)
	{
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();

		try
		{
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			mapper.delete(studentNo);
			sqlSession.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			sqlSession.close();
		}
	}
	
	
	public Student findByUk(String studentCode)
	{
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		Student result = null;
		
		try
		{
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			result= mapper.findByUk(studentCode);
			sqlSession.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			sqlSession.close();
		}
		return result;
	}	
	
	
	
}