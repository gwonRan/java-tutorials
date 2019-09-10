package javaarray;

public class LengthDemo {

	public static void main(String[] args) {
		//String[] classGroup = { "권미란", "그린티", "프렌즈", "쿨하이" };
		String[] classGroup = new String[4];
        classGroup[0] = "권미란";
        System.out.println(classGroup.length);
        classGroup[1] = "그린티";
        System.out.println(classGroup.length);
        classGroup[2] = "프렌즈";
        System.out.println(classGroup.length);
        classGroup[3] = "쿨하이";
        System.out.println(classGroup.length);

	}

}
