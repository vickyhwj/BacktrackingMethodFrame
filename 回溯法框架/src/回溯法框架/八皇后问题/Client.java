package ���ݷ����.�˻ʺ�����;

import ���ݷ����.Work;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Work work=new Work(new EightQueensContext());
		work.exec();
		System.out.println(EightQueensContext.COUNT);
	
	}

}
