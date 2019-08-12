package day10;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("java progRamING".equals("java progRamING")); //equals-완벽하게같으면true
		System.out.println("java progRamING".equals("JAVA progRamING"));
		System.out.println("java progRamING".equalsIgnoreCase("JAVA progRamING"));//대소문자무시하고비교
		System.out.println("java progRamING".equalsIgnoreCase("JAVA"));
		System.out.println("java progRamING".equalsIgnoreCase("java"));
		System.out.println("java progRamING".contains("JAVA"));//대문자는 포함안되어있으므로 false
		System.out.println("java progRamING".toLowerCase().contains("JAVA"));
		System.out.println("java progRamING".toLowerCase().contains("JAVA".toLowerCase()));
		System.out.println("-----------------------------------------------");
	}
	

}
