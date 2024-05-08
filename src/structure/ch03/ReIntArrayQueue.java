package structure.ch03;

public class ReIntArrayQueue {

	private int[] array;
	private int front; // 큐의 시작 지점
	private int rear; // 큐의 끝 지점
	private int capacity; // 큐의 용량
	private int size; // 요소의 개수

	public ReIntArrayQueue(int capacity) {
		this.capacity = capacity;
		array = new int[this.capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	// 편의 기능 만들어 보기
	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	// todo - 1 데이터 넣기 기능 구현
	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("큐 메모리 공간 가득");
		} else {
			rear++;
			array[rear] = item;
			size++;
		}
	}

	// todo - 2 데이터 꺼내기
	public int dequeue() {
		int item = -9999;
		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없음");
		} else {
			item = array[front];
			for (int i = front; i < rear; i++) {
				array[i] = array[i +1];
			}
			array[rear] = 0;
			rear--;
			size--;
		}
		return item;
	}

}// end of class