package annot;

public class Runner {
    public static void main(String[] args) throws Exception {

        AllowPrivateCallAnnotationProcessor processor = new AllowPrivateCallAnnotationProcessor();

        processor.process(MyService.class);

    }
}
