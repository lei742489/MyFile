package day02;
/**
 * 将数字部分替换为："#NUMBER#"
 * @author tarena
 *
 */
public class String_replaceAll {

	public static void main(String[] args) {
		String str ="abc123def456ghi789jkl";
		String regex = "\\d+";	
		
		//str =str.replaceAll(regex, "#NUMBER#");
		//System.out.println(str);
		
		//将英文部分换为"CHAR#";
		
		str =str.replaceAll("[a-zA-z]+", "CHAR#");
		System.out.println(str);
	}

}
