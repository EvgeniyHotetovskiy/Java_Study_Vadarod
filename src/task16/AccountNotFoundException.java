package task16;

class AccountNotFoundException extends RuntimeException {
    private String errorCode;

    public AccountNotFoundException(String errorCode) {
        super("Account not found: " + errorCode);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}