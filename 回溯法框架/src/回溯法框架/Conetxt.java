package ���ݷ����;

import java.util.Collection;

public abstract class Conetxt implements Cloneable{
	/**
	 * ����Ŀǰ״̬�жϵݹ��Ƿ����
	 * @return
	 */
	public abstract boolean finsh();
	/**
	 * ��ȡ��ǰ״̬�µľ���
	 * @return
	 */
	public abstract Collection<Decide> getDecides();
	/**
	 * �ݹ����ִ�е�ҵ��
	 * @return
	 */
	public abstract Object done();
	
	public abstract Object clone() throws CloneNotSupportedException;
	/**
	 * ��������Ƿ����
	 * @param d
	 * @return
	 */
	public abstract boolean check(Decide d);
	/**
	 * ִ�о���
	 * @param d
	 */
	public abstract void exec(Decide d);
	
}
