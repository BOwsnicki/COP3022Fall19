package hanoi;

public class Towers {
	private static final int MAX = 20;
	private int [][] towers = new int[3][MAX];
	private int [] count = new int[3];
	private int moves;
	
	private Towers(int n) {
		if (n > MAX) {
			throw new IllegalArgumentException(n + " > Maximum(" + MAX + ")");
		}
		count[0] = n;
		for (int i = 0; i < n; i++) {
			towers[0][i] = i;
		}
		count[1] = count[2] = 0;
	}
	
	private void showTower(int index) {
		System.out.print("| ");
		for (int i = 0; i < count[index]; i++) {
			System.out.print(towers[index][i] + " ");
		}
		System.out.println();
	}
	
	private void showTowers() {
		showTower(0);
		showTower(1);
		showTower(2);
		System.out.println();
	}
	
	private void move(int from, int to) {
		int peg = towers[from][count[from]-1];
		count[from]--;
		towers[to][count[to]] = peg;
		count[to]++;
		moves++;
	}
	
	private void solve(int n, int from, int to, int save) {
		if (n == 1) {
			move(from,to);
			showTowers();
		} else {
			solve(n-1,from,save,to);
			move(from,to);
			showTowers();
			solve(n-1,save,to,from);
		}
	}
	
	public void solve(int n) {
		moves = 0;
		solve(n,0,2,1);
		System.out.println("Number of moves: " + moves);
	}
	
	public static void main(String[] args) {
		final int N = 20;
		Towers t = new Towers(N);
		t.showTowers();
		t.solve(N);
	}
}
