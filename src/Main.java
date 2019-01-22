import java.util.Stack;

/**
 * Artem Voytenko
 * 22.01.2019
 */

public class Main {
	public static void main(String[] args) {
		String[] testArray = {
				"fd{gfvbgf}bfgbfg",
				"(()",
				"())",
				"(}",
				"(vfdv{fdvvfd}vff)ddv",
				"(vfdv{fdv)vfd}vffddv"
		};

		for (String s : testArray) {
			boolean b = Utils.bracketsOk(s);
			System.out.println(b);
		}
	}

}
