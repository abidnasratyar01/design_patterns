package com.iteratorpattern.pattern;

public class Main {

	public static void main(String[] args) {
		BrowseHistory history = new BrowseHistory();
		history.push("a");
		history.push("b");
		history.push("c");

		Iterator itr = history.createIterator();
		while(itr.hasNext()) {
			String url = itr.current();
			System.out.println(url);
			itr.next();
		}
	}

}
