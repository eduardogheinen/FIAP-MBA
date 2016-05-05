package com.eheinen.misc.dao;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import com.eheinen.misc.entity.Order;

public class OrderDao extends Dao {

	public void insert(Order order) throws Exception{
		try{
			super.openConnection();
			String sql = "INSERT INTO ORDERS(CLIENT_ID, DATE, DESCRIPTION, VALUE) VALUES(?, ?, ?, ?)";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, order.getClientID());
			stmt.setDate(2, new java.sql.Date(order.getDate().getTime()));
			stmt.setString(3, order.getDescription());
			stmt.setDouble(4, order.getValue());
			stmt.executeUpdate();
		}
		catch(Exception ex){
			throw ex;
		}
		finally{
			super.closeConnection();
		}
	}
	
	public Order select(int id) throws Exception{
		Order order = null;
		try{
			super.openConnection();
			String sql = "SELECT CLIENT_ID, DATE, DESCRIPTION, VALUE FROM ORDERS WHERE ID = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			
			if(rs != null){
				order = new Order();
				order.setId(id);
				
				if(rs.next()){
					order.setClientID(rs.getInt("CLIENT_ID"));
					order.setDate(rs.getDate("DATE"));
					order.setDescription(rs.getString("DESCRIPTION"));
					order.setValue(rs.getDouble("VALUE"));
				}
			}
		}
		catch(Exception ex){
			throw ex;
		}
		finally{
			super.closeConnection();
		}
		
		return order;
	}
	
	public List<Order> select() throws Exception{
		List<Order> orders = null;
		try{
			super.openConnection();
			String sql = "SELECT ID, CLIENT_ID, DATE, DESCRIPTION, VALUE FROM ORDERS";
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			if(rs != null){
				orders = new ArrayList<Order>();			
				while(rs.next()){
					Order order = new Order();
					order.setId(rs.getInt("ID"));
					order.setClientID(rs.getInt("CLIENT_ID"));
					order.setDate(rs.getDate("DATE"));
					order.setDescription(rs.getString("DESCRIPTION"));
					order.setValue(rs.getDouble("VALUE"));
					orders.add(order);
				}
			}
		}
		catch(Exception ex){
			throw ex;
		}
		finally{
			super.closeConnection();
		}
		
		return orders;
	}

}
