package com.bridzelabz.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class DBMain {
    public static void main(String[] args) {
    	String jdbcURL = "jdbc:mysql://localhost:3306/payroll_services?useSSL=false";
    	String useName="srikanth";
    	String password="root";
    	Connection con;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		System.out.println("Driver loaded!");
    	}
    	catch (ClassNotFoundException e) {
    		throw new IllegalStateException("Cannot find the driver in the classpath");
    	}
    	listDrivers();
    	try {
    		System.out.println("Connecting to databases:"+jdbcURL);
    		con = DriverManager.getConnection(jdbcURL,useName,password);
    		System.out.println("Connecting is successfull!!!:"+con);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    /**
     * Purpose : Check all the drivers registered with the jdbc driver
     */
    private static void listDrivers() {
    	Enumeration<Driver> driverList = DriverManager.getDrivers();
    	while (driverList.hasMoreElements()) {
    		Driver driverClass = (Driver) driverList.nextElement();
    		System.out.println(" "+driverClass.getClass().getName());
    		
    	}
    }
}
