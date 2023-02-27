package com.iteratorpattern.pattern;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
	private List<String> urls = new ArrayList<>();
	
	private List<String> getUrls() {
		return urls;
	}

	public void setUrls(List<String> urls) {
		this.urls = urls;
	}

	public void push(String url)
	{
		urls.add(url);
	}
	
	public String pop()
	{
		int lastIndex = urls.size() - 1;
		String lastUrl = urls.get(lastIndex);
		urls.remove(lastIndex);
		return lastUrl;
	}
	
	public Iterator createIterator()
	{
		return new ListIterator(this);
	}
	
	public class ListIterator implements Iterator {
		
		private BrowseHistory history;
		private int index;

		public ListIterator(BrowseHistory history) {
			this.history = history;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (index < history.urls.size());
		}

		@Override
		public String current() {
			// TODO Auto-generated method stub
			return history.urls.get(index);
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			index++;
		}
		
	}
}
