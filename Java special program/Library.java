public class Library
{  

  private Book b1;

    public void addNewBook(Book book)
      { 
	
	     b1=book;
       }
         public void showBook()
            {
		
              System.out.println(b1.getId()+"\t"+b1.getName()+"\t"+b1.getPrice());
   
            } 
}
