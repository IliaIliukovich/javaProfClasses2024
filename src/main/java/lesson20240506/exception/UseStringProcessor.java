package lesson20240506.exception;

import lesson20240506.exception.InputValidationException;
import lesson20240506.exception.StringProcessor;

public class UseStringProcessor {

    public static void main(String[] args) {
        try {
            method();
        } catch (InputValidationException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void method() throws InputValidationException {
            String result = StringProcessor.process("some text");
            System.out.println(result);
            result = StringProcessor.process(null);
            System.out.println(result);
            result = StringProcessor.process("text");
            System.out.println(result);
    }


}
