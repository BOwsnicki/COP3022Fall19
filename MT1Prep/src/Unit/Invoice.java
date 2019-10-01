package Unit;

public class Invoice {
	
	public Position[] positions;
	private int totalPositions;
		
	public Invoice() {
		positions = new Position[5];
		totalPositions = 0;
	}
	
	public void addPosition(Position p) {
		if(totalPositions < positions.length) {
			positions[totalPositions] = p;
			totalPositions++;
		} else {/* ??? */}
	}
	
	public int getNumberOfPositions() {
		return totalPositions;
	}
	
	public int getTotal() {
		int total = 0;
		for(int i = 0; i <= (totalPositions - 1); i++) {
			total += positions[i].getAmount();
		}		
		return total;
	}
	
}
