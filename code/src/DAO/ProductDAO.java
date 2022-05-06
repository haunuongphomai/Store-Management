package DAO;

import Model.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    private Connection conn;

    public ProductDAO() {
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

    public List<Product> getListProduct() {
        List<Product> PDList = new ArrayList<Product>();
        String sql = "SELECT * FROM PRODUCT";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product s = new Product();
                s.setProductID(rs.getInt("productID"));
                s.setProductName(rs.getString("productName"));
                s.setAmount(rs.getInt("amount"));
                s.setPriceOrigin(rs.getInt("priceOrigin"));
                s.setPrice(rs.getInt("price"));

                PDList.add(s);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return PDList;
    }

    public List<Product> getListProducttg() {
        List<Product> PDList = new ArrayList<Product>();
        String sql = "SELECT * FROM Product_change";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product s = new Product();
                s.setUserName(rs.getString("userName"));
                s.setTimeInsert(rs.getString("timeInsert"));
                s.setActionType(rs.getString("actionType"));
                s.setProductIDtg(rs.getString("productID"));
                s.setProductNametg(rs.getString("productName"));
                s.setAmounttg(rs.getInt("amount"));
                s.setPriceOrigintg(rs.getInt("priceOrigin"));
                s.setPricetg(rs.getInt("price"));

                PDList.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return PDList;
    }

    public static List<Product> Sort(int choice) {
        List<Product> PDList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306"
                    + "/product?user=root&password=duonghuynhhao&useSSL=false");

            String sql = new String();

            if (choice == 1) {
                sql = "call ProductSortNameasc;";
            }
            if (choice == 2) {
                sql = "call ProductSortNamedes;";
            }
            if (choice == 3) {
                sql = "call ProductSortPriceasc;";
            }
            if (choice == 4) {
                sql = "call ProductSortPricedes;";
            }
            ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product s = new Product();
                s.setProductID(rs.getInt("productID"));
                s.setProductName(rs.getString("productName"));
                s.setAmount(rs.getInt("amount"));
                s.setPriceOrigin(rs.getInt("priceOrigin"));
                s.setPrice(rs.getInt("price"));

                PDList.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return PDList;
    }

    public void addProduct(Product s) {
        String sql = "call ProductInsert(?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getProductName());
            ps.setInt(2, s.getAmount());
            ps.setInt(3, s.getPriceOrigin());
            ps.setInt(4, s.getPrice());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void modifyProduct(Product s) {
        String sql = "call ProductUpdate(?, ?, ?, ?, ?);";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(5, s.getProductID());
            ps.setString(1, s.getProductName());
            ps.setInt(2, s.getAmount());
            ps.setInt(3, s.getPriceOrigin());
            ps.setInt(4, s.getPrice());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeProduct(int id) {
        String sql = "call ProductDelete(?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Product> findProductByName(String productName) {
        List<Product> PDList = new ArrayList<Product>();
        String sql = "select * from product where productName like '%" + productName + "%'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product s = new Product();
                s.setProductID(rs.getInt("productID"));
                s.setProductName(rs.getString("productName"));
                s.setAmount(rs.getInt("amount"));
                s.setPriceOrigin(rs.getInt("priceOrigin"));
                s.setPrice(rs.getInt("price"));

                PDList.add(s);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return PDList;
    }
}
