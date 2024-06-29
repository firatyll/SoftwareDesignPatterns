package behavioral.Visitor;

public interface ShoppingCartVisitor {
	int visit(Fruit f);
	int visit(Book b);
}
