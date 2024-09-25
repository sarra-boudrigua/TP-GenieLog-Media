package mediatheque;

public class PrintCDsOnlyVisitor implements ItemVisitor{
    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(CD cd) {
        System.out.println("Print this cd"+ cd.getTitle());;

    }
}
