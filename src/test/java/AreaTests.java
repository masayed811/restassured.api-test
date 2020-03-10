import com.student.model.Circle;
import com.student.model.PriceCalculator;
import com.student.model.Rectangular;
import com.student.model.Square;
import org.junit.Assert;
import org.junit.Test;

public class AreaTests {

    private PriceCalculator priceCalculator;

    @Test
    public void It_Should_Calculate_AreaPrice(){

        priceCalculator = new PriceCalculator();

        Rectangular rect = new Rectangular(4,5);
        double price =priceCalculator.calculatePrice(rect);
        System.out.println(price);

        Square sq = new Square(5);
        price = priceCalculator.calculatePrice(sq);
        System.out.println(price);

        Circle circle = new Circle(5);
        price = priceCalculator.calculatePrice(circle);
        System.out.println(price);
    }
}
