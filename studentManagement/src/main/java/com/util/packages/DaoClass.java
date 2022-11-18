package com.util.packages;

import java.nio.channels.SelectableChannel;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.DB.packages.DBClass;

import studentManagement.been.StudentManagementbeen;

public class DaoClass implements DaoInterface {

	@Override
	public void insert(StudentManagementbeen b) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DBClass.getConnection();
			ps = con.prepareStatement("insert into StudentManagements values(?,?,?,?,?,?)");
			ps.setInt(1, b.getId());
			ps.setString(2, b.getName());
			ps.setString(3, b.getEmail());
			ps.setString(4, b.getPassword());
			ps.setString(5, b.getRoolNo());
			ps.setString(6, b.getAddress());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Override
	public int update(StudentManagementbeen b) {
		
		System.out.println("byuryeryt"+b);
		int status = 0;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBClass.getConnection();


			ps = con.prepareStatement("update StudentManagements set FirstName=?,Email=?,Password=?,RollNo=?,Address=? where id=?");
			
			ps.setString(1, b.getName());
			ps.setString(2, b.getEmail());
			ps.setString(3, b.getPassword());
			ps.setString(4, b.getRoolNo());
			ps.setString(5, b.getAddress());
			   ps.setInt(6, b.getId());

			status = ps.executeUpdate();

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	@Override
	public int delete(int id) {

		Connection con = null;
		PreparedStatement ps = null;
		int status = 0;
		try {
			con = DBClass.getConnection();
			ps = con.prepareStatement("delete from StudentManagements where id=?");
			ps.setInt(1, id);

			status = ps.executeUpdate();

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	@Override
	public List<StudentManagementbeen> list() {
		List<StudentManagementbeen> list1 = null;
		try {
			Connection con = DBClass.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from StudentManagements");
			ResultSet set = ps.executeQuery();
			list1 = new ArrayList<StudentManagementbeen>();
			while (set.next()) {
				StudentManagementbeen been = new StudentManagementbeen();
				been.setId(set.getInt(1));
				been.setName(set.getString(2));
				been.setEmail(set.getString(3));
				been.setPassword(set.getString(4));
				been.setRoolNo(set.getString(5));
				been.setAddress(set.getString(6));

				list1.add(been);

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception");
		}
		return list1;

	}

	@Override
	public StudentManagementbeen getEmployeeById(int id) {
		StudentManagementbeen b = new StudentManagementbeen();
		try {
			Connection con = DBClass.getConnection();
			PreparedStatement ps = con.prepareStatement("Select * from StudentManagements where id =?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				b.setId(rs.getInt(1));
				b.setName(rs.getString(2));
				b.setEmail(rs.getString(3));
				b.setPassword(rs.getString(4));
				b.setRoolNo(rs.getString(5));
				b.setAddress(rs.getString(6));
			}
			con.close();

		} catch (Exception e) {
		}

		return b;
	}
}
