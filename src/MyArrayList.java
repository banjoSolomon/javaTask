public class MyArrayList {
    private int numberOfElements;
    private final String[] elements = new String[5];

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public void add(String element) {
        elements[numberOfElements] = element;
        numberOfElements++;

    }

    public void remove() {
        if (numberOfElements == 0) throw new ArrayIndexOutOfBoundsException("List out of bounds");
        numberOfElements--;


    }

    public String get(int index) {
        return elements[index -1];
    }
    public int get(String element){
        for(int index = 0; index < elements.length; index++)
            if(elements[index].equals(element))return index + 1;


        return 0;
    }
}