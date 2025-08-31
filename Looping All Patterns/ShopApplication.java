
public class ShopApplication {
	public static void main(String x[]) {
		Shop s1 = new Shop();
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("ABC");
		p1.setPrice(10000);

		Product p2 = new Product();
		p2.setId(2);
		p2.setName("MNO");
		p2.setPrice(20000);

		Product p3 = new Product();
		p3.setId(3);
		p3.setName("STV");
		p3.setPrice(30000);
		s1.setProduct(p1, p2, p3);
		Product prods[] = s1.getProducts();
		for (int i = 0; i < prods.length; i++) {
			System.out.println(prods[i].getId() + "\t" + prods[i].getName() + "\t" + prods[i].getPrice());
		}
	}
}
