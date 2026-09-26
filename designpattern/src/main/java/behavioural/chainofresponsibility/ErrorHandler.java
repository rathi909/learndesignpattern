package behavioural.chainofresponsibility;

public class ErrorHandler extends Handler{
    @Override
    void handle(int level) {
        if(level ==2)
        {
            System.out.println(2);
        }
        else if(next !=null)
        {
            next.setNext(new InfoHandler());
        }

    }
}
