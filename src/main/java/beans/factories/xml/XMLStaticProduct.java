package beans.factories.xml;

public class XMLStaticProduct {

    private XMLStaticProduct() {
        // make sure the constructor unreachable outside the class
        // only the static method can be used
    }

    public static XMLStaticProduct produceStaticProduct() {
        return new XMLStaticProduct();
    }
}
