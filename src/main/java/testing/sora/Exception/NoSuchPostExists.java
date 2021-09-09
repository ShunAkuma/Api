package testing.sora.Exception;

public class NoSuchPostExists extends Exception{
    public NoSuchPostExists() {
        super();
    }

    public NoSuchPostExists(String message) {
        super(message);
    }

    public NoSuchPostExists(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchPostExists(Throwable cause) {
        super(cause);
    }

    protected NoSuchPostExists(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
