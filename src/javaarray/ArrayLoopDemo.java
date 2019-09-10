package javaarray;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		String[] members = { "권미란" , "쿨하이", "그린티" };
        for (int i = 0; i < members.length; i++) {
            String member = members[i];
            System.out.println(member + "이 들어옵니다.");
        }

	}

}
