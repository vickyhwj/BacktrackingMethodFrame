package 回溯法框架;

import java.util.Collection;

public abstract class Conetxt implements Cloneable{
	/**
	 * 根据目前状态判断递归是否结束
	 * @return
	 */
	public abstract boolean finsh();
	/**
	 * 获取当前状态下的决策
	 * @return
	 */
	public abstract Collection<Decide> getDecides();
	/**
	 * 递归结束执行的业务
	 * @return
	 */
	public abstract Object done();
	
	public abstract Object clone() throws CloneNotSupportedException;
	/**
	 * 检验决策是否可行
	 * @param d
	 * @return
	 */
	public abstract boolean check(Decide d);
	/**
	 * 执行决策
	 * @param d
	 */
	public abstract void exec(Decide d);
	
}
