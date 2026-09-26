package behavioural.chainofresponsibility;

public abstract class Handler {

    protected Handler next;
    Handler setNext(Handler n)
    {
        this.next = n;
        return n;
    }

    abstract void handle(int level);
}
