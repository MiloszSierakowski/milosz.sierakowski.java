import com.kodilla.good.patterns.allegro.*;

public class Main {
    public static void main(String[] args) {
/*        MovieStore movieStore = new MovieStore();

        Map<String , List<String>> movies = movieStore.getMovies();

        movies.forEach((key, value) -> value.forEach(x -> System.out.print(x + "!")));*/

        Basket basket = new Basket();
        OrderRequest orderRequest = basket.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new BasketValidation(),
                new MailService(),new UserOrderRepository());
        productOrderService.order(orderRequest);

    }
}
