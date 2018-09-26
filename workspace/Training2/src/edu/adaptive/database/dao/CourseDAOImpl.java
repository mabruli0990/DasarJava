package edu.adaptive.database.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import java.util.List;
import java.util.ArrayList;

import edu.adaptive.database.model.Course;

public class CourseDAOImpl implements CourseDAO{
	
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String driverName = "oracle.jdbc.driver.OracleDriver";
	private final String userName = "ADAPTIVE2_DB";
	private final String password = "adaptive";
	
	private Connection getConnection()
	{
		Connection con = null;
		
		try
		{
			Class.forName(driverName);
			con = DriverManager.getConnection(url, userName, password);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("failed to open connection");
			e.printStackTrace();
		}
		catch(SQLException e )
		{
			System.out.println("failed to open connection");
			e.printStackTrace();
		}
		return con;
	}
	

	
	public void insert(Course course) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		String sqlInsert = " INSERT INTO tbl_course " +
		" course_code, course_name, active_flag, create_by, create_on " + 
		" VALUES ( ?, ?, ?, ?, ? )";
		
		try
		{
			con = getConnection();
			ps = con.prepareStatement(sqlInsert);
			ps.setString(1, course.getCourseCode());
			ps.setString(2, course.getCourseName());
			ps.setString(3, course.getActiveFlag());
			ps.setString(4, course.getCreateBy());
			ps.setTimestamp(5, (Timestamp) course.getCreateOn());
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println(" failed on execute database proses");
		}
		
		finally
		{
			try
			{
				ps.close();
				con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				System.out.println(" failed on execute database proses ");
			}
		}
		
	}
	
	public List<Course> search() {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Course course = null;
		List<Course> courseList = new ArrayList<Course>();
		String sql = " SELECT * FROM tbl_course ";
		
		try
		{
			con = getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				course = new Course();
				
				course.setCourseCode(rs.getString("course_code"));
				course.setCourseName(rs.getString("course_name"));
				course.setActiveFlag(rs.getString("active_flag"));
				course.setCreateBy(rs.getString("create_by"));
				course.setCreateOn(rs.getDate("create_on"));
				course.setUpdateBy(rs.getString("update_by"));
				course.setUpdateOn(rs.getDate("update_on"));
				courseList.add(course);
				
			}
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			System.out.println("Failed on execute database process");
		}
		
		finally
		{
			try
			{
				ps.close();
				con.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
				System.out.println("Failed on execute database resource");
			}
		}
		
		
		
		return courseList;
	}

	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String courseCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Course findById(String courseCode) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Course findByUk(String courseCode) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		Course course = null;
		String sqlSearchCourse = "select * from tbl_course where course_code = ? ";
		
		try
		{
			con = getConnection();
			ps = con.prepareStatement(sqlSearchCourse);
			ps.setString(1, courseCode);
			rs = ps.executeQuery();
			
			if(rs.next())
			{
				course = new Course();
				
				course.setCourseCode(rs.getString("course_code"));
				course.setCourseName(rs.getString("course_name"));
				course.setActiveFlag(rs.getString("Active_flag"));
				course.setCreateBy(rs.getString("create_by"));
				course.setCreateOn(rs.getDate("create_on"));
				course.setUpdateBy(rs.getString("update_by"));
				course.setUpdateOn(rs.getDate("update_on"));
			}
		}
			catch (SQLException e)
			{
				e.printStackTrace();
				System.out.println("Failed on execute database process");
			}
			
			finally
			{
				try
				{
					ps.close();
					con.close();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
					System.out.println("Failed on execute database resource");
				}
			}
		return course;
	}

	
	

}