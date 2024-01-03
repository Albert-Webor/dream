package V8;

public class LtError extends RuntimeException{
    public LtError() {
        super();
    }
    public LtError(String description) {
        super(description);
    }
    /*自定义报错*/
    public static Throwable A001(String description){
        return new LtError(description);
    }

}
