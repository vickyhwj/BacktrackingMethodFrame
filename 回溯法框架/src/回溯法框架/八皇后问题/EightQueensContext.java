package 回溯法框架.八皇后问题;

import java.util.ArrayList;
import java.util.Collection;

import 回溯法框架.Conetxt;
import 回溯法框架.Decide;

public class EightQueensContext extends Conetxt {
	public static int COUNT = 0;
	int[][] a = new int[8][8];
	int start=-1;
	int n=1;

	@Override
	public boolean finsh() {
		// TODO Auto-generated method stub
		if (n > 8)
			return true;
		return false;
	}

	@Override
	public Collection<Decide> getDecides() {
		// TODO Auto-generated method stub
		Collection<Decide> eightQueensDecides = new ArrayList<>();
		for (int i = start + 1; i <= 63; ++i)
			eightQueensDecides.add(new EightQueensDecide(i));
		return eightQueensDecides;
	}

	@Override
	public Object done() {
		// TODO Auto-generated method stub
		COUNT++;
		return null;
	}

	@Override
	public boolean check(Decide d) {
		// TODO Auto-generated method stub
		EightQueensDecide ed = (EightQueensDecide) d;
		int i = ed.getIndex() / 8;
		int j = ed.getIndex() % 8;
		for (int ii = 0; ii < 8; ++ii)
			if (ii != i && a[ii][j] == 1)
				return false;
		for (int ii = 0; ii < 8; ++ii)
			if (ii != j && a[i][ii] == 1)
				return false;
		for (int ii = 1;; ++ii) {
			int x = i - ii, y = j - ii;
			if (!inBoard(x, y))
				break;
			if (a[x][y] == 1)
				return false;
		}
		for (int ii = 1;; ++ii) {
			int x = i + ii, y = j + ii;
			if (!inBoard(x, y))
				break;
			if (a[x][y] == 1)
				return false;
		}
		for (int ii = 1;; ++ii) {
			int x = i - ii, y = j + ii;
			if (!inBoard(x, y))
				break;
			if (a[x][y] == 1)
				return false;
		}
		for (int ii = 1;; ++ii) {
			int x = i + ii, y = j - ii;
			if (!inBoard(x, y))
				break;
			if (a[x][y] == 1)
				return false;
		}
		return true;
	}

	private boolean inBoard(int x, int y) {
		if (x >= 0 && x < 8 && y >= 0 && y < 8)
			return true;
		return false;
	}

	@Override
	public void exec(Decide d) {
		// TODO Auto-generated method stub
		EightQueensDecide ed = (EightQueensDecide) d;
		int i = ed.getIndex() / 8;
		int j = ed.getIndex() % 8;
		a[i][j] = 1;
		start = ed.getIndex();
		n++;

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		EightQueensContext context = new EightQueensContext();
		int[][] b=new int[a.length][a[0].length];
		for(int i=0;i<b.length;++i)
			for(int j=0;j<b[0].length;++j)
				b[i][j]=a[i][j];
		context.a = b;
		context.n = n;
		context.start = start;

		return context;
	}

}
