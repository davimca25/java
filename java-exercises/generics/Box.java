public class Box<T, U> {

    private T object;
    private U price;

    public void setObject(T object) {
        this.object = object;
    }
    public void setPrice(U price) {
        this.price = price;
    }
    public T getObject() {
        return this.object;
    }
    public U getPrice() {
        return this.price;
    }
}
