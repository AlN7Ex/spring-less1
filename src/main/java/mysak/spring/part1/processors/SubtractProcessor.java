package mysak.spring.part1.processors;

public class SubtractProcessor implements Processor {

    @Override
    public int process(int a, int b) {
        return a - b;
    }
}
