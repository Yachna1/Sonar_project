package sonarqube.mavensonar;

public class DemoSonar{

	public static void main(String[] args) {
		System.out.println("hello java");
		start();

	}
	public static String start() {
		System.out.println("start");
		return "start";
	}
	public static String stop() {
		System.out.println("stop");
		return "stop";
	}

}

/*public class DemoSonar {
	public void containsOrNot(String value) {
		if(value.contains("Automation")) {
			System.out.println("Tester");
		}
		
	}*/



