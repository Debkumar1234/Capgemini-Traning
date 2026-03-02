package exam_questions;

class Test23 {
	{
		System.out.print("Block 1 ");
	}
	{
		System.out.print("Block 2 ");
	}

	Test23() {
		System.out.print("Constructor");
	}

	public static void main(String[] args) {
		new Test23();
	}
}
