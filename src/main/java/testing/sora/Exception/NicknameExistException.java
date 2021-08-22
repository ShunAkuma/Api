package testing.sora.Exception;

public class NicknameExistException extends Exception{
    public NicknameExistException() {
        super();
    }

    public NicknameExistException(String message) {
        super(message);
    }

    public NicknameExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public NicknameExistException(Throwable cause) {
        super(cause);
    }

    protected NicknameExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
