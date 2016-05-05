package com.eheinen.misc.dao;

import java.util.ArrayList;
import java.util.List;

import com.eheinen.misc.entity.Client;

public class ClientDao extends Dao {

	public void insert(Client client) throws Exception{
		try{
			super.openConnection();
			String sql = "INSERT INTO CLIENTS(NAME, EMAIL) VALUES(?, ?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, client.getName());
			stmt.setString(2, client.getEmail());
			stmt.executeUpdate();
		}
		catch(Exception ex){
			throw ex;
		}
		finally{
			super.closeConnection();
		}
	}
	
	public Client select(int id) throws Exception{
		Client client = null;
		try{
			super.openConnection();
			String sql = "SELECT NAME, EMAIL FROM CLIENTS WHERE ID = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			
			if(rs != null){
				client = new Client();
				client.setId(id);
				
				if(rs.next()){
					client.setName(rs.getString("NAME"));
					client.setEmail(rs.getString("EMAIL"));
				}
			}
		}
		catch(Exception ex){
			throw ex;
		}
		finally{
			super.closeConnection();
		}
		
		return client;
	}
	
	public List<Client> select() throws Exception{
		List<Client> clients = null;
		try{
			super.openConnection();
			String sql = "SELECT ID, NAME, EMAIL FROM CLIENTS";
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			if(rs != null){
				clients = new ArrayList<Client>();			
				while(rs.next()){
					Client client = new Client();
					client.setId(rs.getInt("ID"));
					client.setName(rs.getString("NAME"));
					client.setEmail(rs.getString("EMAIL"));
					clients.add(client);
				}
			}
		}
		catch(Exception ex){
			throw ex;
		}
		finally{
			super.closeConnection();
		}
		
		return clients;
	}
}
