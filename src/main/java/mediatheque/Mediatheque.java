package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		PrintCatalogOnlyVisitor cat = new PrintCatalogOnlyVisitor ();

		for (Item i : items) {
			i.accept(cat);
			System.out.println("this catalog: '"+ i.getTitle()+ "' is printed");


		}
	}
	
	public void printOnlyBooks() {
		PrintBooksOnlyVisitor book = new PrintBooksOnlyVisitor();
		for (Item i : items) {
			i.accept(book);
			System.out.println("this book: '"+ i.getTitle() +"' is printed"+ i.getTitle());

		}
	}

	public void printOnlyCDs() {

		PrintCDsOnlyVisitor cd = new PrintCDsOnlyVisitor ();
		for (Item i : items) {
			i.accept(cd);
			System.out.println("this cd: '"+ i.getTitle()+ "' is printed ");
		}
	}

}
