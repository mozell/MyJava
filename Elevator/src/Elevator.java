public class Elevator {
	int[] totalFloor;
	int nowFloor;

	public Elevator(int[] totalFloor) {
		this.totalFloor = totalFloor;
		this.nowFloor = 1;
	}

	public int moveUp(int nowFloor) {
		nowFloor += 1;
		
		if (isExistFloor(nowFloor)) {
			this.nowFloor = nowFloor;
			return nowFloor;
		} else {
			System.out.println("최고층 입니다.");
			nowFloor -= 1;
			return nowFloor;
		}
	}

	public int moveDown(int nowFloor) {
		nowFloor -= 1;

		if (isExistFloor(nowFloor)) {
			this.nowFloor = nowFloor;
			return nowFloor;
		} else {
			System.out.println("최저층 입니다.");
			nowFloor += 1;
			return nowFloor;
		}
	}

	public boolean isExistFloor(int nowFloor) {
		int[] temp = this.totalFloor;

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == nowFloor) {
				return true;
			}
		}
		return false;
	}
	
}
