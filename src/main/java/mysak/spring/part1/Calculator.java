package mysak.spring.part1;

import mysak.spring.part1.processors.DivideProcessor;
import mysak.spring.part1.processors.MultiplyProcessor;
import mysak.spring.part1.processors.SubtractProcessor;
import mysak.spring.part1.processors.SumProcessor;

public class Calculator {
    private final SumProcessor sumProc;
    private final SubtractProcessor subtractProc;
    private final DivideProcessor divideProc;
    private final MultiplyProcessor multiplyProc;

    public Calculator(SumProcessor sumProc,
                      SubtractProcessor subtractProc,
                      DivideProcessor divideProc,
                      MultiplyProcessor multiplyProc)
    {
        this.sumProc = sumProc;
        this.subtractProc = subtractProc;
        this.divideProc = divideProc;
        this.multiplyProc = multiplyProc;
    }

    public int sum(int a, int b) {
        return sumProc.process(a,b);
    }
    public int subtract(int a, int b) {
        return subtractProc.process(a,b);
    }
    public int divide(int a, int b) {
        return divideProc.process(a, b);
    }
    public int multiply(int a, int b) {
        return multiplyProc.process(a, b);
    }
}
