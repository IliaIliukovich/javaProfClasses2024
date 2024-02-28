package lesson20240228;

public enum ErrorCode {

    NOT_FOUND(404, "Page not found"),
    INTERNAL_SERVER_ERROR(500, "Server crashed"),
    BAD_REQUEST(400, "Invalid request"),
    ACCESS_DENIED(403, "You have no access rights for this page");

    private final int code;

    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


//    @Override
//    public String toString() {
//        return "ErrorCode{" +
//                "code=" + code +
//                ", message='" + message + '\'' +
//                '}';
//    }
}
