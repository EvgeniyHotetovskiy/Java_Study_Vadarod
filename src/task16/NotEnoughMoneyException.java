package task16;

class NotEnoughMoneyException extends RuntimeException {
    private String errorCode;

    public NotEnoughMoneyException(String errorCode) {
        super("Not enough money: " + errorCode);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
