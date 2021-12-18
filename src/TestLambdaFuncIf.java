@FunctionalInterface // The annotation will check duplicated abstract methods
public interface TestLambdaFuncIf {
    public void execute();
    //public void method(); The functional interface must have only one abstract method declared.
}
