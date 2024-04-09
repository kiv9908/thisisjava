package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbConnect {

	public static Connection conn = null;
	public static Statement stmt = null;
	public static ResultSet rs = null;

	// 생성자(초기화)
	public DbConnect() {
		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			// 2. DB접속
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "testuser", "test1234");
			System.out.println("DB 접속 성공");
			// 3. SQL을 실행할 객체 생성 (statement)
			stmt = conn.createStatement();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Map> exceute(String sql, String colName) {
		List<Map> list = new ArrayList<>();
		try {
			/*
			 * 4. SQL 실행 RESULT SET은 SQL실행 결과가 그대로 담김 커서가 0에 있어서 NEXT를 해야 1이 됨, 매번 NEXT ->
			 * GET 해야함O
			 */
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Map<String, String> map = new HashMap<>();
				map.put("name", rs.getString(colName));

				list.add(map);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void close() {
		// 6. 자원해제
		// 생성한 역순으로 자원 해제!
		try {
			rs.close();
		} catch (Exception e) {
		}
		try {
			stmt.close();
		} catch (Exception e) {
		}
		try {
			conn.close();
		} catch (Exception e) {
		}

	}

}
