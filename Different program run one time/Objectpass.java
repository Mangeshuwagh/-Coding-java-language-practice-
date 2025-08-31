public class Objectpass {

    private Book b1;

    public void addNewBook(Book book) {
        b1 = book;
    }

    public void ShowDetail() {
        System.out.println(" name: " + b1.getName());
        System.out.println(" id: " + b1.getid());
        System.out.println(" Salary: " + b1.GetSalary());
    }
}
