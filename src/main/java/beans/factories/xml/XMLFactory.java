package beans.factories.xml;

/**
 * no need to be public
 * Created by Cornel on 10.12.2015.
 */
public class XMLFactory {

    private boolean produce1Called = false;
    private boolean produce2Called = false;

    public XMLFactoryProduct1 produceProduct1() {
        produce1Called = true;
        return new XMLFactoryProduct1();
    }

    public XMLFactoryProduct2 produceProduct2() {
        produce2Called = true;
        return new XMLFactoryProduct2();
    }

    public boolean isProduce1Called() {
        return produce1Called;
    }

    public boolean isProduce2Called() {
        return produce2Called;
    }
}
