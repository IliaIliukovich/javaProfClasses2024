package lesson20240410.functionalinterface;

public class UseStringProcessor {


    public static void main(String[] args) {
        StringProcessor makeUpperCase = (s) -> s.toUpperCase();

        String result = makeUpperCase.process("Hello world!!!");
        System.out.println(result);
        result = makeUpperCase.process("Data");
        System.out.println(result);

        StringProcessor limit = (s) -> s.substring(0, 3);
        result = limit.process("abcdefgh");
        System.out.println(result);

        StringProcessor stringProcessor = (s) -> {
            String out = "---" + s + "---";
            return out.toUpperCase();
        };

        result = stringProcessor.process("Some data");
        System.out.println(result);

    }


}
