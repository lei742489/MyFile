package day02;
/**
 * �����ֲ����滻Ϊ��"#NUMBER#"
 * @author tarena
 *
 */
public class String_replaceAll {

	public static void main(String[] args) {
		String str ="abc123def456ghi789jkl";
		String regex = "\\d+";	
		
		//str =str.replaceAll(regex, "#NUMBER#");
		//System.out.println(str);
		
		//��Ӣ�Ĳ��ֻ�Ϊ"CHAR#";
		
		str =str.replaceAll("[a-zA-z]+", "CHAR#");
		System.out.println(str);
	}

}
