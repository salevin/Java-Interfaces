public class Main {
    public static void main(String[] args){
        if (args.length == 0){
            System.out.println("You need to give a string to iterate through!");
            return;
        }
        System.out.println("Running CharIter");
        CharIterRun charIter = new CharIterRun(args[0]);
        while (charIter.hasNext()){
            System.out.println(charIter.next());
        }
        System.out.println("\n Running CharIterx");
        CharIterRunX charIterX = new CharIterRunX(args[0]);
        try{
            while (true) {
                System.out.println(charIterX.next());
            }
        } catch (IteratorExausted e){
        }
    }
}
