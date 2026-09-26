package behavioural.chainofresponsibility;

public class InfoHandler extends Handler{
    @Override
    void handle(int level) {
        if(level ==1)
        {
            System.out.println(level);
        }
        else if(next !=null)
        {
            next.setNext(new ErrorHandler());
        }
    }
}
