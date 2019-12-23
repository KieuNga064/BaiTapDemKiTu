package kieunga.com;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class StringUtils {


	/*
	 * Normalizer: Class này cung cấp các phương thức để tiêu chuẩn hóa văn bản Unicode thành văn bản tương đương. 
	 * Nhằm mục đích thuận tiện cho việc sắp xếp và tìm kiếm chuỗi.
	 * String temp = Normalizer.normalize(s, Normalizer.Form.NFD): Tiêu chuẩn hóa chuỗi s được truyền vào theo định dạng NFD. 
	 * Kết quả trả về là chuỗi đã được tiêu chuẩn hóa.
	 * Lớp Pattern:  Dùng để nhận Regexp (Cấu trúc đại diện hay Regular Expression) vào và kiểm tra những String cho vào dựa trên Regexp đã tạo ra. 
	 * Thông thường để nhận một Regexp, thì dùng phương thức compile.
	 * matcher: Dùng để so sánh, tìm kiếm những chữ đưa vào dựa trên Regexp đã tạo ra.
	 */
		 public static String removeAccent(String s) {
			  
			  String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
			  Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
			  return pattern.matcher(temp).replaceAll("");
			 }



}
