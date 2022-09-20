public class ConcatTester
	{
	public static void main(String[] args)
	{
		String animal1 = "quick brown fox";
		String animal2 = "lazy dog";
		String article = "the";
		String action = "jumps over";
		String message = "";
		/* 명령문 추가는 이 아래에 하세요 */
		message = message.concat(animal1).concat(animal2).concat(article).concat(action);
		System.out.println(message);
		int n = message.length();
		System.out.println(n);
	}
}