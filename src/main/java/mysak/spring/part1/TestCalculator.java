package mysak.spring.part1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCalculator {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Calculator calc = context.getBean("calculator", Calculator.class);

        System.out.println("Sum:    \t" + calc.sum(5,5));
        System.out.println("Subtract:\t" + calc.subtract(5,5));
        System.out.println("Divide: \t" + calc.divide(5,5));
        System.out.println("Multiply:\t" + calc.multiply(5,5));
    }
}