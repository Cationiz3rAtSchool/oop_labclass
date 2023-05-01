package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book {
	private int id;
	private String title;
	private String category;
	private float cost;
	private ArrayList<String> authors = new ArrayList<String>();

	public int getId() { return id; }
	public String getTitle() { return title; }
	public String getCategory() { return category; }
	public float getCost() { return cost; }
	public ArrayList<String> getAuthors() { return authors; }

	public boolean isAuthor(String authorName) {
		return authors.contains(authorName);
	}
	public void addAuthor(String authorName) {
		if (isAuthor(authorName)) {
			System.out.println("Author is already in the list");
			return;
		}
		authors.add(authorName);
		System.out.println("Author has been added to the list");
	}
	public void removeAuthor(String authorName) {
		if (!isAuthor(authorName)) {
			System.out.println("Author is not in the list");
			return;
		}
		authors.remove(authorName);
		System.out.println("Author has been removed from the list");
	}
}
