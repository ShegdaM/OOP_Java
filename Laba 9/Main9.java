package ua.lpnuai.oop.shegda09;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;


public class Container implements Iterable <String>, Serializable {
    Container(){

    }

    class Iterator<String> implements java.util.Iterator <String> {

        private int pointer;
        private final int end;


        public Iterator(java.lang.String[] data) {
            this.pointer = 0;
            this.end = data.length;
        }

        @Override
        public boolean hasNext() {
            return this.pointer < end;
        }

        public String next() {
            if (!this.hasNext()) System.out.println("nema takogo elmenta");
            int current = pointer;
            pointer++;
            return (String) strings[current];
        }
    }

    public Iterator <String> iterator() {
        return new Iterator <String>(strings);
    }

    final String[] SortArrByLength() {
        Comparator <String> lenghtComparator = new Sort();
        String[] temp = strings.clone();
        Arrays.sort(temp, lenghtComparator);
        return temp;
    }

    public String[] strings;

    Object[] toArray() {
        return Arrays.copyOf(strings, strings.length);
    }

    int SizeOfArray() {
        return strings.length;
    }

    public Container(String[] array) {
        strings = new String[array.length];
        strings = array.clone();
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String item : strings) {
            result.append(item);
        }
        return result.toString();
    }

    void AddElement(String string) {
        String[] temp = new String[strings.length];
        System.arraycopy(strings, 0, temp, 0, strings.length);
        int newLength = strings.length + 1;
        strings = new String[newLength];
        System.arraycopy(temp, 0, strings, 0, temp.length);
        strings[newLength - 1] = string;
    }

    void deleteAll() {
        strings = new String[0];
    }

    boolean removeOne(String string) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(string)) {
                int removed = strings.length - i - 1;
                if (removed > 0) {
                    System.arraycopy(strings, i + 1, strings, i, removed);
                }
                strings[strings.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    final boolean FindElement(final String string) {
        for (String item : strings) {
            if (item.equals(string)) {
                return true;
            }
        }
        return false;
    }

    final boolean containsAll(final Container container) {
        return Arrays.equals(this.strings, container.strings);
    }

}

class Sort implements Comparator <String> {

    @Override
    public final int compare(final String o1, final String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else {
            if (o1.length() < o2.length()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}