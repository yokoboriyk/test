package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.MyPageDTO;
import com.internousdev.ecsite.util.DBConnector;

public class MyPageDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public ArrayList<MyPageDTO> getMyPageUserInfo(String item_transaction_id,String user_master_id)throws SQLException{
		ArrayList<MyPageDTO> myPageDTO = new ArrayList<MyPageDTO>();
		String sql =
				"SELECT ubit.id,lit.item_name,ubit.total_price,ubit.total_count,ubit.pay,ubit.insert_date"
				+ "From user_buy_item_transaction ubit"
				+ "LEFT JOIN item_info_transaction lit"
				+ "ON ubit.item_transaction_id = iit.id"
				+ "WHERE ubit.item_transaction_id = ? AND ubit.user_master_id = ?"
				+ "ORDER BY insert_date DESC";




	}

}
