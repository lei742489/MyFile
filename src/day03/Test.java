package day03;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Ҫ���û������Լ������գ���ʽΪ��
 * yyyy-mm-dd;
 * ��������������Ϊֹ���˶����졣
 * @author tarena
 *
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		System.out.println("���������գ���ʽΪ��yyyy-mm-dd");
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		do {
			if(!in.matches("\\d{4}-\\d{1,2}-\\d{2}")){
			System.out.println("���ո�ʽ����");
			in = sc.nextLine();
			}
		}	while(!in.matches("\\d{4}-\\d{1,2}-\\d{2}"));
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		
		Date birth = sim.parse(in);
		Date now = new Date();
		long time = now.getTime()-birth.getTime();
		
		
		 time = time /1000/60/60/24;
		System.out.println("������Ϊֹ�㹲���ˣ�"+time+"��");
		
		if(10000-time>0){
			long check = (10000-time)*1000*60*60*24L;
			long reachtime = now.getTime()+check;
			System.out.println("�������10000��ɾ͵�����Ϊ��"+sim.format(reachtime));
		}
	}

}
