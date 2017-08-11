package beans.factories.xml;

/**
 * Created by Cornel on 10.12.2015.
 */
public class XMLStaticProduct {

    private XMLStaticProduct() {
        // make sure the constructor unreachable outside the class
        // only the static method can be used
    }

    public static XMLStaticProduct produceStaticProduct() {
        return new XMLStaticProduct();
    }
}
