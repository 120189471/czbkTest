package otherTest.Test.exceptions;

public class HandleException {

	public static void main(String args[]) {

		try {
			int i = 1 / 1;
			// throw new RuntimeException("运行时错误");
		} catch (ArithmeticException e) {
			System.out.println("被除数是0，算法错误！！！");

		} catch (RuntimeException e) {
			System.out.println("运行时错误！！！");

		} finally {
			System.out.println("资源已被释放!!!");
		}
	}

}
