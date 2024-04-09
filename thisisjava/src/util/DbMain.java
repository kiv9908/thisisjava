package util;

import java.util.List;
import java.util.Map;

public class DbMain {

	public static void main(String[] args) throws Exception {
		DbConnect dc = new DbConnect();
		List<Map> rs1 = dc.exceute("SELECT * FROM emp", "ename");
		List<Map> rs2 = dc.exceute("SELECT * FROM dept", "dname");
		dc.close();

		for (Map m : rs1) {
			System.out.println(m.get("name"));
		}

		System.out.println("-----------------------");

		for (Map m : rs2) {
			System.out.println(m.get("name"));
		}

		String id = "test";
		String pwd = "pwd";

		String sql = "SELECT * FROM WHERE ID = '" + id + "' AND PWD = '" + pwd + "'";
	}
}
