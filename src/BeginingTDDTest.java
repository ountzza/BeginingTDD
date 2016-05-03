import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BeginingTDDTest {

    FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void assertTrueShouldReturnTrue() {
        assert true;
    }

    @Test
    public void getResultShouldReturnOneWithOne(){
        Assert.assertEquals("1", fizzBuzz.getResult(1));
    }

    @Test
    public void getResultShouldReturnTwoWithTwo(){
        Assert.assertEquals("2", fizzBuzz.getResult(2));
    }

    @Test
    public void getResultShouldReturnFizzWithThree(){
        Assert.assertEquals("Fizz", fizzBuzz.getResult(3));
    }

    @Test
    public void getResultShouldReturnBuzzWithFive(){
        Assert.assertEquals("Buzz", fizzBuzz.getResult(5));
    }

    @Test
    public void getResultShouldReturnBuzzWithTen(){
        Assert.assertEquals("Buzz", fizzBuzz.getResult(10));
    }

    @Test
    public void getResultShouldReturnFizzWithNine(){
        Assert.assertEquals("Fizz", fizzBuzz.getResult(9));
    }

    @Test
    public void getResultShouldReturnFizzBuzzWithFifteen(){
        Assert.assertEquals("FizzBuzz", fizzBuzz.getResult(15));
    }

    @Test
    public void getResultShouldReturn3184With3184(){
        Assert.assertEquals("3184", fizzBuzz.getResult(3184));
    }

    @Test
    public void getResultShouldReturnFizzBuzz(){
        Assert.assertEquals("FizzBuzz", fizzBuzz.getResult(150));
        Assert.assertEquals("FizzBuzz", fizzBuzz.getResult(90));
    }
}