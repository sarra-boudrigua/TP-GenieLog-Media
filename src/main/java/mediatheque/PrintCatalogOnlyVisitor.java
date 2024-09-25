package mediatheque;

public class PrintCatalogOnlyVisitor implements ItemVisitor{
    @Override
    public void visit(Book book) {
        System.out.println("Print this book"+ book.getTitle());;

    }

    @Override
    public void visit(CD cd) {
        System.out.println("Print this cd"+ cd.getTitle());;


    }
}
