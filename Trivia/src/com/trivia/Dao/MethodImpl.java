package com.trivia.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.trivia.Model.Admin;
import com.trivia.Model.Customer;
import com.trivia.Model.Meal;
import com.trivia.Model.Menu;
import com.trivia.Model.Order;
import com.trivia.Model.Vendor;
import com.trivia.Util.DBUtil;

public class MethodImpl implements IMethods {

	private Connection con;
	public MethodImpl() {
	con = DBUtil.getConnection();
	}
	@Override
	public void AdminRegister(Admin admin) {
		try {
		String query = "INSERT INTO Administrator (AdminID, AdminPassword, FirstName, LastName, Gender, Contact, DateBirth, Address, AreaResidence, City, PostalCode, Country, Profession) VALUES (?,?,?,?,?,?,NOW(),?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, admin.getId());
		ps.setString(2, admin.getPassword());
		ps.setString(3, admin.getFirstName());
		ps.setString(4, admin.getLastName());
		ps.setString(5, admin.getGender());
		ps.setInt(6, admin.getContact());
		ps.setString(7, admin.getAddress());
		ps.setString(8, admin.getAreaResidence());
		ps.setString(9, admin.getCity());
		ps.setInt(10,admin.getPostalCode());
		ps.setString(11,admin.getCountry());
		ps.setString(12, admin.getProfession());

		
		ps.executeUpdate();
		ps.close();
		
		
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void CustomerRegister(Customer cust) {
		try {
			String query = "INSERT INTO Customer (CustomerID, CustomerPassword, FirstName, LastName, Gender, Contact, DateBirth, Address, AreaResidence, City, PostalCode, Country, Profession) VALUES (?,?,?,?,?,?,NOW(),?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, cust.getId());
			ps.setString(2, cust.getPassword());
			ps.setString(3, cust.getFirstName());
			ps.setString(4, cust.getLastName());
			ps.setString(5, cust.getGender());
			ps.setInt(6, cust.getContact());
			ps.setString(7, cust.getAddress());
			ps.setString(8, cust.getAreaResidence());
			ps.setString(9, cust.getCity());
			ps.setInt(10,cust.getPostalCode());
			ps.setString(11,cust.getCountry());
			ps.setString(12, cust.getProfession());
			
			ps.executeUpdate();
			ps.close();
			
			
			
			}
			
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	@Override
	public void VendorRegister(Vendor vendor) {
		try {
			String query = "INSERT INTO Vendor (VendorID, VendorPassword, FirstName, LastName, Gender, Contact, DateBirth, Address, AreaResidence, City, PostalCode, Country, Profession, CafeID) VALUES (?,?,?,?,?,?,NOW(),?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, vendor.getId());
			ps.setString(2, vendor.getPassword());
			ps.setString(3, vendor.getFirstName());
			ps.setString(4, vendor.getLastName());
			ps.setString(5, vendor.getGender());
			ps.setInt(6, vendor.getContact());
			ps.setString(7, vendor.getAddress());
			ps.setString(8, vendor.getAreaResidence());
			ps.setString(9, vendor.getCity());
			ps.setInt(10,vendor.getPostalCode());
			ps.setString(11,vendor.getCountry());
			ps.setString(12, vendor.getProfession());
			
			ps.setInt(13, vendor.getCafeID());
			
			ps.executeUpdate();
			ps.close();
			}
			
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	@Override
	public boolean AdminLogin(int Id, String Password) {
			try {
				String query = "SELECT AdminID AND AdminPassword FROM Administrator WHERE AdminId =? AND AdminPassword=?";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, Id);
				ps.setString(2,Password);
				
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					return true;
				}
			}
			catch(SQLException e) {
				e.printStackTrace(); 
			}
			return false;
		}
	public boolean VendorLogin(int Id, String Password) {
		try {
			String query = "SELECT VendorID AND VendorPassword FROM Vendor WHERE VendorID =? AND VendorPassword=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, Id);
			ps.setString(2,Password);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace(); 
		}
		return false;
	}
	@Override
	public List<Admin> getAllAdmins() {
		List<Admin> list = new ArrayList<>();
		try {
			String query = "SELECT * FROM Administrator";
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery(query);
			while(rs.next()) {
				Admin admin = new Admin();
				admin.setId(rs.getInt("AdminID"));
				admin.setFirstName(rs.getString("FirstName"));
				admin.setLastName(rs.getString("LastName"));
				admin.setGender(rs.getString("Gender"));
				admin.setContact(rs.getInt("Contact"));
				admin.setDOB(rs.getDate("DOB"));
				admin.setAddress(rs.getString("Address"));
				admin.setAreaResidence(rs.getString("AreaResidence"));
				admin.setCity(rs.getString("City"));
				admin.setPostalCode(rs.getInt("PostalCode"));
				admin.setCountry(rs.getString("Country"));
				admin.setProfession(rs.getString("Profession"));
				
				list.add(admin);
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public Admin getAdmin(int id) {
		Admin admin = new Admin(); 
		
		try {
			String query = "SELECT * FROM Administrator WHERE AdminID=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				admin.setFirstName(rs.getString("FirstName"));
				admin.setLastName(rs.getString("LastName"));
				admin.setGender(rs.getString("Gender"));
				admin.setPassword(rs.getString("Password"));
				admin.setContact(rs.getInt("Contact"));
				admin.setDOB(rs.getDate("DOB"));
				admin.setAddress(rs.getString("Address"));
				admin.setAreaResidence(rs.getString("AreaResidence"));
				admin.setCity(rs.getString("City"));
				admin.setPostalCode(rs.getInt("PostalCode"));
				admin.setCountry(rs.getString("Country"));
				admin.setProfession(rs.getString("Profession"));
				admin.setId(rs.getInt("AdminID"));
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return admin;

	}
	@Override
	public void DeleteAdmin(int id) {
		try {
			String query = "DELETE FROM Administrator Where AdminID=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,id);
			ps.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

		
	}
	@Override
	public void UpdateAdmin(Admin admin) {
		try {
			String query = "UPDATE Administrator SET FirstName=?, LastName=?, Gender=?, Password=?, DOB=NOW(), Contact=?, Address=?, AreaResidence=?, City=?, PostalCode=?, Country=?, Profession=? WHERE AdminID=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, admin.getFirstName());
			ps.setString(2, admin.getLastName());
			ps.setString(3, admin.getGender());
			ps.setString(4, admin.getPassword());
			ps.setInt(5, admin.getContact());
			ps.setString(6, admin.getAddress());
			ps.setString(7, admin.getAreaResidence());
			ps.setString(8, admin.getCity());
			ps.setInt(9, admin.getPostalCode());
			ps.setString(10, admin.getCountry());
			ps.setString(11,admin.getProfession());
			ps.setInt(12, admin.getId());
			ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	
		
	}
	@Override
	public boolean CustomerLogin(int id, String Password) {
		try {
			String query = "SELECT CustomerID AND CustomerPassword FROM Customer WHERE CustomerID =? AND CustomerPassword=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2,Password);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace(); 
		}
		return false;
	}
	@Override
	public List<Customer> getallCustomers() {
		List<Customer> clist = new ArrayList<>();
		try {
			String query = "SELECT * FROM Customer";
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery(query);
			while(rs.next()) {
				Customer admin = new Customer();
				admin.setId(rs.getInt("CustomerID"));
				admin.setFirstName(rs.getString("FirstName"));
				admin.setLastName(rs.getString("LastName"));
				admin.setGender(rs.getString("Gender"));
				admin.setContact(rs.getInt("Contact"));
				admin.setDOB(rs.getDate("DOB"));
				admin.setAddress(rs.getString("Address"));
				admin.setAreaResidence(rs.getString("AreaResidence"));
				admin.setCity(rs.getString("City"));
				admin.setPostalCode(rs.getInt("PostalCode"));
				admin.setCountry(rs.getString("Country"));
				admin.setProfession(rs.getString("Profession"));
				
				clist.add(admin);
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return clist;
	}
	@Override
	public Customer getcustomer(int id) {
		Customer admin = new Customer(); 
		
		try {
			String query = "SELECT * FROM Customer WHERE CustomerID=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				admin.setFirstName(rs.getString("FirstName"));
				admin.setLastName(rs.getString("LastName"));
				admin.setGender(rs.getString("Gender"));
				admin.setPassword(rs.getString("Password"));
				admin.setContact(rs.getInt("Contact"));
				admin.setDOB(rs.getDate("DOB"));
				admin.setAddress(rs.getString("Address"));
				admin.setAreaResidence(rs.getString("AreaResidence"));
				admin.setCity(rs.getString("City"));
				admin.setPostalCode(rs.getInt("PostalCode"));
				admin.setCountry(rs.getString("Country"));
				admin.setProfession(rs.getString("Profession"));
				admin.setId(rs.getInt("CustomerID"));
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return admin;

	}
	@Override
	public void DeleteCustomer(int id) {
		try {
			String query = "DELETE FROM Customer Where CustomerID=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,id);
			ps.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void UpdateCustomer(Customer admin) {
		try {
			String query = "UPDATE Administrator SET FirstName=?, LastName=?, Gender=?, Password=?, DOB=NOW(), Contact=?, Address=?, AreaResidence=?, City=?, PostalCode=?, Country=?, Profession=? WHERE CustomerID=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, admin.getFirstName());
			ps.setString(2, admin.getLastName());
			ps.setString(3, admin.getGender());
			ps.setString(4, admin.getPassword());
			ps.setInt(5, admin.getContact());
			ps.setString(6, admin.getAddress());
			ps.setString(7, admin.getAreaResidence());
			ps.setString(8, admin.getCity());
			ps.setInt(9, admin.getPostalCode());
			ps.setString(10, admin.getCountry());
			ps.setString(11,admin.getProfession());
			ps.setInt(12, admin.getId());
			ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public boolean Vendor(int id, String Password) {
		try {
			String query = "SELECT VendorID AND VendorPassword FROM Vendor WHERE VendorID =? AND VendorPassword=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2,Password);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace(); 
		}
		return false;
	}
	@Override
	public List<Vendor> getAllVendor() {
		List<Vendor> vlist = new ArrayList<>();
		try {
			String query = "SELECT * FROM Vendor";
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery(query);
			while(rs.next()) {
				Vendor admin = new Vendor();
				admin.setId(rs.getInt("VendorID"));
				admin.setFirstName(rs.getString("FirstName"));
				admin.setLastName(rs.getString("LastName"));
				admin.setGender(rs.getString("Gender"));
				admin.setContact(rs.getInt("Contact"));
				admin.setDOB(rs.getDate("DOB"));
				admin.setAddress(rs.getString("Address"));
				admin.setAreaResidence(rs.getString("AreaResidence"));
				admin.setCity(rs.getString("City"));
				admin.setPostalCode(rs.getInt("PostalCode"));
				admin.setCountry(rs.getString("Country"));
				admin.setProfession(rs.getString("Profession"));
				
				vlist.add(admin);
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return vlist;
	}
	@Override
	public Vendor getvendor(int id) {
		Vendor admin = new Vendor(); 
		
		try {
			String query = "SELECT * FROM Vendor WHERE VendorID=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				admin.setFirstName(rs.getString("FirstName"));
				admin.setLastName(rs.getString("LastName"));
				admin.setGender(rs.getString("Gender"));
				admin.setPassword(rs.getString("Password"));
				admin.setContact(rs.getInt("Contact"));
				admin.setDOB(rs.getDate("DOB"));
				admin.setAddress(rs.getString("Address"));
				admin.setAreaResidence(rs.getString("AreaResidence"));
				admin.setCity(rs.getString("City"));
				admin.setPostalCode(rs.getInt("PostalCode"));
				admin.setCountry(rs.getString("Country"));
				admin.setProfession(rs.getString("Profession"));
				admin.setId(rs.getInt("VendorID"));
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return admin;

	}
	@Override
	public void DeleteVendor(int id) {
		try {
			String query = "DELETE FROM Vendor Where VendorID=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,id);
			ps.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void UpdateVendor(Vendor admin) {
		try {
			String query = "UPDATE Vendor SET FirstName=?, LastName=?, Gender=?, Password=?, DOB=NOW(), Contact=?, Address=?, AreaResidence=?, City=?, PostalCode=?, Country=?, Profession=? WHERE CustomerID=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, admin.getFirstName());
			ps.setString(2, admin.getLastName());
			ps.setString(3, admin.getGender());
			ps.setString(4, admin.getPassword());
			ps.setInt(5, admin.getContact());
			ps.setString(6, admin.getAddress());
			ps.setString(7, admin.getAreaResidence());
			ps.setString(8, admin.getCity());
			ps.setInt(9, admin.getPostalCode());
			ps.setString(10, admin.getCountry());
			ps.setString(11,admin.getProfession());
			ps.setInt(12, admin.getId());
			ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Menu> getallMenu() {
		List<Menu> menulist = new ArrayList<>();
		try {
			String query = "SELECT * FROM Menu";
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery(query);
			while(rs.next()) {
				Menu u=new Menu();  
	            u.setMenuID(Integer.parseInt(rs.getString("MenuID")));  
	            u.setVendorID(Integer.parseInt(rs.getString("VendorID"))); 
	            u.setManuName(rs.getString("ManuName"));  
	            u.setCreationDate(rs.getDate("CreationDate"));  
	            u.setMenuStatus(rs.getString("MenuStatus"));  
	            menulist.add(u);  
	     
				
				menulist.add(u);
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return menulist;
	}
	@Override
	public void UpdateMenu(Menu menu) {
		 try {
	            PreparedStatement preparedStatement = con.prepareStatement("Update Menu set MenuID=?, VendorID=?, ManuName=? ,CreationDate=NOW() where MenuID=?");
	          
	            preparedStatement.setInt(1, menu.getMenuID());
	            preparedStatement.setInt(2, menu.getVendorID());
	            preparedStatement.setString(3, menu.getManuName());	
	            preparedStatement.setInt(4, menu.getMenuID());
	            preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
		
	@Override
	public void DeleteMenu(int id) {
		// TODO Auto-generated method stub
		try {
			String query = "DELETE FROM Menu WHERE MenuID = ?"; 
			PreparedStatement preparedStatement = con.prepareStatement( query );
			preparedStatement.setInt( 1, id );
			
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
	}
	@Override
	public Menu getMenu(int id) {
		// TODO Auto-generated method stub
		Menu list=new Menu();  
	      
	    try{  
	       
	        PreparedStatement ps=con.prepareStatement("select * from Menu where MenuID=?");  
	        ps.setInt(1, id);
	        
	        ResultSet rs=ps.executeQuery();  
	        if(rs.next()){  
	           
	        	list.setMenuID(rs.getInt("MenuID"));
	        	list.setVendorID(rs.getInt("VendorID"));  
	        	list.setManuName(rs.getString("ManuName"));  
	        	list.setCreationDate(rs.getDate("CreationDate"));  
	        	list.setMenuStatus(rs.getString("MenuStatus"));  
	          
	        }  
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    					}  
	    return list;  
	}
	
	@Override
	public void Addmeal(Meal meal) {
		// TODO Auto-generated method stub
		try {
			String query = "INSERT INTO Meal VALUES (?,?,?,?,?,?,?,?);"; 
			PreparedStatement preparedStatement = con.prepareStatement( query );
			
			preparedStatement.setInt(1, meal.getMealID());
			preparedStatement.setInt( 2, meal.getVendorID() );
			preparedStatement.setString( 3, meal.getMealName() );
			preparedStatement.setString( 4, meal.getDiscripation() );
			preparedStatement.setInt( 5, meal.getPrice() );
			preparedStatement.setString( 6, meal.getIngredients() );
			preparedStatement.setString( 7, meal.getRecipe() );
			preparedStatement.setString( 8, meal.getMealStatus() );
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
	}
	
	@Override
	public List<Meal> getallmeal() {
		// TODO Auto-generated method stub
		 List<Meal> list=new ArrayList<>();  
	      
		    try{  
		       
		        PreparedStatement ps=con.prepareStatement("SELECT * from Meal");  
		        ResultSet rs=ps.executeQuery();  
		        while(rs.next()){  
		        	Meal u=new Meal();  
		        	u.setMealID(rs.getInt("MealID"));
		        	u.setVendorID(rs.getInt("VendorID"));
		        	u.setMealName(rs.getString("MealName"));
		        	u.setDiscripation(rs.getString("Discripation"));
		        	u.setPrice(rs.getInt("Price"));
		        	u.setIngredients(rs.getString("Ingredients"));
		        	u.setRecipe(rs.getString("Recipe"));
		            list.add(u);  
		        }  
		    }
		    catch(Exception e){
		    	System.out.println(e);
		    					}  
		    return list;  
	}
	@Override
	public void UpdateMeal(Meal meal) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void DeleteMeal(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Menu getMeal(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Order> getallOrders() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void UpdateOrder(Order order) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void DeleteOrder(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Menu getOrder(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void Addmenu(Menu menu) {
		try {
			String query = "INSERT INTO Menu (MenuID, VendorID, ManuName, MenuStatus) VALUES (?,?,?,?)"; 
			PreparedStatement preparedStatement = con.prepareStatement( query );
			
			preparedStatement.setInt(1, menu.getMenuID());
			preparedStatement.setInt(2, menu.getVendorID());
			preparedStatement.setString(3,menu.getManuName());
			preparedStatement.setString(4, menu.getMenuStatus());
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
	}
	

	}
	
	
	
	

