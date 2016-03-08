public class CharIterRun implements CharIter {
    private char[] read;
    private int currIndex;

    public CharIterRun(String InitialRead){
        read = InitialRead.toCharArray();
        currIndex = 0;
    }

    public boolean hasNext(){
        return (currIndex != read.length);
    }

    public char next(){
        char nextChar = read[currIndex];
        currIndex++;
        return nextChar;
    }

}
