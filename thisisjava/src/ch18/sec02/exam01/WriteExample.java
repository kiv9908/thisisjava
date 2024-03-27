package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("D:/test3.db");

			// 메소드는 매개값 int(4byte)에서 끝 lbyte만 출력
//			byte a = 10;
//			byte b = 20;
//			byte c = 30;

			byte[] array = { 10, 20, 30, 40, 50 };

//			os.write(a);
//			os.write(b);
//			os.write(c);

			os.write(array, 1, 3);

			os.flush();
			os.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
