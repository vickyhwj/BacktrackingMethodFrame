package 回溯法框架;

import java.util.Collection;

import 回溯法框架.全排列.Quan;

/**
 * 回溯法框架
 * @author Administrator
 *
 */
public class Work {
	public Work(Conetxt conetxt){
		this.conetxt=conetxt;
	}
	Conetxt conetxt;
	public void exec() throws CloneNotSupportedException{
		dfs(conetxt);
	}
	private void dfs(Conetxt con) throws CloneNotSupportedException{
		if(con.finsh()){
			con.done();
		}
		Collection<Decide> decides=con.getDecides();
		for(Decide d:decides){
			if(con.check(d)){
				Conetxt temp=(Conetxt) con.clone();
				con.exec(d);
				dfs(con);
				con=temp;
			}
		}
		
		
	}
	

}
