package lesson20240612.hometask.reflection;

public class Data {

    public String publicValue;
    private Double privateValue;

    public Data() {
    }

    public Data(String publicValue, Double privateValue) {
        this.publicValue = publicValue;
        this.privateValue = privateValue;
    }

    public void publicMethod() {
        System.out.println("publicMethod() invoked");
        System.out.println("Public value:" + publicValue);
    }

    private void privateMethod(Double value) {
        System.out.println("privateMethod() invoked");
        privateValue += value;
        System.out.println("private value:" + privateValue);
    }

    public String getPublicValue() {
        return publicValue;
    }

    public Double getPrivateValue() {
        return privateValue;
    }
}
