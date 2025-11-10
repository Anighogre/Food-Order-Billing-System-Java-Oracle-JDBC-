package com.ani.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.ani.connection.ConnectionProvider;
import com.ani.foodBean.Customer;

public class FoodCustomerService implements FoodCustomer {

    @Override
    public int addCustomer(Customer ref) {
        int res = 0;

        try {
        	Connection con = ConnectionProvider.getConnection();
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO FoodOrder VALUES(?,?,?,?,?,?)");

            pstmt.setInt(1, ref.getOrder_ID());
            pstmt.setString(2, ref.getCustomer_name());
            pstmt.setString(3, ref.getFood_item());
            pstmt.setInt(4, ref.getQuantity());
            pstmt.setDouble(5, ref.getPrice_per_item());
            pstmt.setString(6, ref.getPhone_number());

            res = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public boolean isFirstCustomer(Customer ref) {
        boolean flag = true;

        try {
        	Connection con = ConnectionProvider.getConnection();
            PreparedStatement pstmt = con.prepareStatement("SELECT 1 FROM FoodOrder WHERE phoneNo = ?");

            pstmt.setString(1, ref.getPhone_number());
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                flag = false; // already exists
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public double calculateBill(Customer ref, boolean isFirstTime) {
        double total = ref.getPrice_per_item() * ref.getQuantity();
        if (isFirstTime) {
            total = total * 0.5; // apply 50% discount
        }
        return total;
    }

    @Override
    public void printBill(Customer ref, boolean isFirstTime) {
        double amount = calculateBill(ref, isFirstTime);
        System.out.println(ref.getCustomer_name() + " has to pay Rs. " + amount);
        if (isFirstTime) {
            System.out.println("[50% discount applied for first-time user]");
        }
        System.out.println();
    }
}
