package Model;

public class ErrorMsg {
    private String msg;

    public ErrorMsg() {
        msg = null;
    }

    public ErrorMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
