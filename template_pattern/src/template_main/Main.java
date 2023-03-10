package template_main;

import template_pattern.Task;
import template_pattern.TransferMoney;

public class Main {

	public static void main(String[] args) {
		Task task = new TransferMoney();
		task.execute();
	}

}
