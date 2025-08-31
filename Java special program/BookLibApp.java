public class BookLibApp
{
   public static void main(String x[])
   {
	Library l = new Library();
	Book b = new Book();
	b.setId(1);
	b.setName("Let Us C");
	b.setPrice(100);
	l.addNewBook(b);
	l.showBook();
   }
}
