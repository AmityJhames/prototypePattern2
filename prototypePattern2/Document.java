package prototypePattern2;

interface Document extends Cloneable {
    Document clone();
    void open();
    String getType();
}
