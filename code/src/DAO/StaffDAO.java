package DAO;


import Model.Staff;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StaffDAO {

    private Connection conn;
    List<StaffDAO> STList;

    public StaffDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306"
                    + "/product?user=root&password=duonghuynhhao&useSSL=false");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed"
                    + e.getMessage());
        }
    }

    public List<Staff> getListStaff() {
        List<Staff> STList = new ArrayList<Staff>();
        String sql = "SELECT * FROM staff";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Staff s = new Staff();
                s.setStaffID(rs.getInt("staffID"));
                s.setStaffName(rs.getString("staffName"));
                s.setGender(rs.getString("gender"));
                s.setDOB(rs.getString("DOB"));
                s.setSalary(rs.getInt("salary"));
                s.setEmail(rs.getString("email"));
                s.setPhone(rs.getString("phone"));

                STList.add(s);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return STList;
    }

    public void addStaff(Staff s) {
        String sql = "call staffInsert(?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getStaffName());
            ps.setString(2, s.getGender());
            ps.setString(3, s.getDOB());
            ps.setInt(4, s.getSalary());
            ps.setString(5, s.getEmail());
            ps.setString(6, s.getPhone());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void removeStaff(int id) {
        String sql = "call staffDelete(?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        public void modifyStaff(Staff s) {
        String sql = "call staffUpdate(?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, s.getStaffName());
            ps.setString(2, s.getGender());
            ps.setString(3, s.getDOB());
            ps.setInt(4, s.getSalary());
            ps.setString(5, s.getEmail());
            ps.setString(6, s.getPhone());
            ps.setInt(7, s.getStaffID());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
        public List<Staff> findStafftByName(String staffName) {
        List<Staff> STList = new ArrayList<Staff>();
        String sql = "select * from staff where staffName like '%" + staffName + "%'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Staff s = new Staff();
                s.setStaffID(rs.getInt("staffID"));
                s.setStaffName(rs.getString("staffName"));
                s.setGender(rs.getString("gender"));
                s.setDOB(rs.getString("DOB"));
                s.setSalary(rs.getInt("salary"));
                s.setEmail(rs.getString("email"));
                s.setPhone(rs.getString("phone"));

                STList.add(s);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return STList;

    }
}
