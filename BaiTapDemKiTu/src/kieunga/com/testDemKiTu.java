package kieunga.com;

import java.util.Scanner;


public class testDemKiTu {

	public static void main(String[] args) {
		System.out.println("Mời bạn nhập vào chuỗi: ");
		String s=new Scanner(System.in).nextLine();
		demKiTu(s);
	}
	

	static Boolean laNguyenAm(Character c)
	{
		boolean ktHopLe=false;
		//char []nguyenAm ={'a','ă','â','e','ê','i','o','ô','ơ','u','ư','y'};
		char []nguyenAm ={'a','e','i','o','u','y'};
		
		for (int i=0;i<nguyenAm.length;i++)
		{
			if(c==nguyenAm[i])
			{	
				ktHopLe=true;
				break;
			}
		}
		return ktHopLe;
	}
	static void demKiTu(String s) 
	{
		s=StringUtils.removeAccent(s);
		int soKTInHoa=0;
		int soKTInThuong=0;
		int soChuSo=0;
		int soKTDacBiet=0;
		int soKhoangTrang=0;
		int soNguyenAm=0;
		int soPhuAm=0;
		char a;
		for(int i=0; i<s.length();i++)
		{
			a=s.charAt(i);
			if(Character.isUpperCase(a))
				soKTInHoa++;
			else if (Character.isLowerCase(a)) 							
				soKTInThuong++;
			else if (Character.isDigit(a)) 
			{
				soChuSo++;
			}
			else if((Character.isSpaceChar(a)))
			{
				soKhoangTrang++;
			}
			else 
			{
				soKTDacBiet++;
			}
			if(laNguyenAm(a))
				soNguyenAm++;
			else if( Character.isLetter(a))
				soPhuAm++;						
		}
		System.out.println("Số kí tự in hoa: "+soKTInHoa);
		System.out.println("Số kí tự in thường: "+soKTInThuong);
		System.out.println("Số kí tự là chữ số: "+soChuSo);
		System.out.println("Số ký tự đặc biệt: "+soKTDacBiet);
		System.out.println("Số khoảng trắng: "+soKhoangTrang);
		System.out.println("Số chữ là nguyên âm: "+soNguyenAm);
		System.out.println("Số chữ là phụ âm: "+soPhuAm);
	}
}
