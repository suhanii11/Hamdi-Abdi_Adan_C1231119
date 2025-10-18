import java.util.Arrays;
import java.util.EmptyStackException;
public class TextStack {
        private static final int INITIAL_SIZE = 2;
        private int pointer;
        private String[] elements;
        TextStack() {
            this(INITIAL_SIZE);
        }
        TextStack(int capacity) {
            pointer = 0;
            elements = new String[capacity];
        }
        public int countItems() {
            return pointer;
        }
        public void addText(String value) {
            if (pointer == elements.length) {
                enlarge();
            }
            elements[pointer++] = value;
        }
        public String removeTop() {
            if (isStackEmpty()) {
                throw new EmptyStackException();
            }
            String out = elements[--pointer];
            elements[pointer] = null;
            return out;
        }
        public String viewTop() {
            if (isStackEmpty()) {
                throw new EmptyStackException();
            }
            return elements[pointer - 1];
        }
        public boolean isStackEmpty() {
            return pointer == 0;
        }
        private void enlarge() {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        public void showAll() {
            if (isStackEmpty()) {
                throw new EmptyStackException();
            }
            System.out.println("enter of  Stack:");
            for (int a = 0; a < pointer; a++) {
                System.out.println(elements[a]);
            }
        }
}
