package SecondHomework;

import java.util.Arrays;
import java.util.Random;

public class ArrayImpl implements Array {

    protected int[] data;
    protected int currentSize;


    public ArrayImpl(int[] data, int currentSize) {
        this.data = data;
        this.currentSize = currentSize;
    }

    @Override
    public void Input() {
        for (int i = 0; i < data.length; i++) {
            currentSize++;
        }
    }


    @Override
    public void Output() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(data[i]);

        }
    }


    @Override
    public void add(int value) {
        if (currentSize == data.length) {
            data = grow();
        }
        data[currentSize++] = value;
    }

    protected int[] grow() {
        return Arrays.copyOf(data, data.length * 2);
    }

    @Override
    public boolean indexOf(int value) {
        for (int i = 0; i < currentSize; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int IndexSearch(int value) {
        for (int i = 0; i < currentSize; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(int value) {
        int index = IndexSearch(value);
        if (index != -1) {
            for (int i = index; i < currentSize - 1; i++) {
                data[i] = data[i + 1];
            }
            currentSize--;

            return true;
        }
        return false;
    }

    @Override
    public void sortBubble() {
        for (int i = 0; i < currentSize - 1; i++) {
            for (int j = 0; j < currentSize - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    @Override
    public void sortSelect() {
        for (int i = 0; i <currentSize-1 ; i++) {
          int MinIndex=i;
            for (int j = i+1; j <currentSize ; j++) {
                if(data[j]<data[MinIndex]){
                    MinIndex=j;
                }
            } swap(MinIndex,i);
        }
    }

    @Override
    public void sortInsert() {
        for (int i = 1; i < currentSize; i++) {
            int temp = data[i];
            int in = i;
            while (in > 0 && data[in - 1] >= temp) {
                data[in] = data[in - 1];
                in--;
            }
            data[in] = temp;
        }

    }

    public void swap(int index1, int index2) {
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
}
