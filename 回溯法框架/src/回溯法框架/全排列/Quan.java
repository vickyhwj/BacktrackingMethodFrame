package 回溯法框架.全排列;

import java.util.ArrayList;
import java.util.Collection;

import 回溯法框架.Conetxt;
import 回溯法框架.Decide;

public class Quan extends Conetxt {
	int[] a;
	int[] vis;
	int n=1;
	int max;
	public  Quan(int sum) {
		// TODO Auto-generated constructor stub
		a=new int[sum+1];
		vis=new int[sum+1];
		max=sum;
	}
	
	public boolean finsh() {
		// TODO Auto-generated method stub
		if(n>max)
			return true;
		return false;
	}

	
	public Collection<Decide> getDecides() {
		// TODO Auto-generated method stub
		Collection<Decide> decides=new ArrayList<>();
		for(int i=1;i<=max;++i)
			if(vis[i]==0){
				decides.add(new Qd(i));
			}
		return decides;
	}

	
	public Object done() {
		// TODO Auto-generated method stub
		for(int i=1;i<=max;++i)
			System.out.print(a[i]);
		System.out.println();
		return null;
	}

	
	public boolean check(Decide d) {
		// TODO Auto-generated method stub
		
		return true;
	}

	
	public void exec(Decide d) {
		// TODO Auto-generated method stub
		Qd qd=(Qd) d;
		vis[qd.getIndex()]=1;
		a[n]=qd.getIndex();
		n++;
		
		
	}

	
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Quan q=new Quan(max);
		q.a=a.clone();
		q.n=n;
		q.vis=vis.clone();
		
		return q;
	}
	

}
