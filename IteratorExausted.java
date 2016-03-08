public class IteratorExausted extends Exception{
    public IteratorExausted(){
        super();
    }

    public IteratorExausted(IndexOutOfBoundsException error){
        super(error);
    }
}
    
