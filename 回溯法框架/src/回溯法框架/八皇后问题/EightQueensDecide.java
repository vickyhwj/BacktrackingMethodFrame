package 回溯法框架.八皇后问题;

import 回溯法框架.Decide;

public class EightQueensDecide extends Decide{
	int index;

	public EightQueensDecide(int index) {
		super();
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
}
