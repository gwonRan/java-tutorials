package javaloop;

public class BreakDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
            if (i == 8)
                break;
            System.out.println("Coding Everybody " + i);
        }

	}

}
