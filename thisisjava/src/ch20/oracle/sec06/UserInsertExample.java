package ch20.oracle.sec06;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInsertExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");
			// 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "testuser", "test1234");
			// 매개변수화된 SQL 문 작성
			String sql = "" + "INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata) "
					+ "VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?)";

			// PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] { "bno" });
			int pstmtint = 1;
			pstmt.setString(pstmtint++, "눈오는 날");
			pstmt.setString(pstmtint++, "함박눈이 내려요.");
			pstmt.setString(pstmtint++, "winter");
			pstmt.setString(pstmtint++, "snow.jpg");
			pstmt.setBlob(pstmtint++, new FileInputStream("D:/test2.png"));

			// SQL 문 실행
			// executeUpdate : 수행결과로 int 타입으로 반영된 레코드 건수를 반환
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수: " + rows);

			// bno 값 얻기, 방금 insert한 pk 가져오기
			if (rows == 1) {
				// { "bno" } 배열에 쓴 값이 담김
				ResultSet rs = pstmt.getGeneratedKeys();
				if (rs.next()) { // 커서 한 칸 내림, rs.next()만 적어도 가능
					int bno = rs.getInt(1);
					System.out.println("저장된 bno: " + bno);
				}
				rs.close();
			}

			// PreparedStatement 닫기
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					// 연결 끊기
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}
}