package MyStack;


public class MyStack {
    public MyStack(int size) {
        elements = new int[size];

    }

    public boolean isEmpty() {
        return isEmpty;

    }

    public void push(int element) {
        if (top < elements.length - 1 && !isDuplicate(element))
            elements[++top] = element;
        isEmpty = false;



    }



    private boolean isEmpty = true;


    private final int[] elements;

    private int top = -1;

    public void pop() {
        if (top >= 0)
            top--;
        isEmpty = (top == -1);

    }

    public int peek() {
        if (top >=0) return elements[top];
        else
            return 0;


    }


    public int count() {
        return top + 1;
    }
    public boolean isDuplicate(int element){
        for(int i = 0; i <= top; i++)
            if(elements[i] == element)return true;

        return false;
    }

    public void clear() {
        top = -1;
        isEmpty = true;
    }

    public int capacity() {
        return elements.length;

    }

    public boolean contains(int element) {
        for(int count = 0; count <= top; count++)
            if(elements[count]==element)return true;

        return false;

    }
}