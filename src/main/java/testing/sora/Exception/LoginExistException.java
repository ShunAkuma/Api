package testing.sora.Exception;

public class LoginExistException extends Exception{
    public LoginExistException() {
    }

    public LoginExistException(String message) {
        super(message);
    }

    public LoginExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginExistException(Throwable cause) {
        super(cause);
    }

    public LoginExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
