package mediatheque;

import javax.print.attribute.standard.Media;

public interface ItemVisitor {
    void visit (Book book);
    void visit (CD cd) ;
}
