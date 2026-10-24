public class EmptyCollectionExceptionS extends RuntimeException {

    public EmptyCollectionExceptionS(String collection) {

        super("The " + collection + " is empty.");
    }
}