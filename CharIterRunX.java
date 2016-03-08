public class CharIterRunX implements CharIterX{
    private char[] read;
    private int currIndex;

    public CharIterRunX(String line){
        read = line.toCharArray();
        currIndex = 0;
    }

    public char next() throws IteratorExausted {
        try {
            char currChar = read[currIndex];
            currIndex++;
            return currChar;
        } catch (IndexOutOfBoundsException e){
            throw new IteratorExausted(e);
        }
    }
}
