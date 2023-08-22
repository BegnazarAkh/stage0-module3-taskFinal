package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        String result = ((number >> 31) & 1) == 0 ? "true" : "false";
        System.out.println(result);
    }
}
