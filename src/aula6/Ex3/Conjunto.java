package aula6.Ex3;

import java.lang.StringBuilder;

public class Conjunto {
    int numbers[];

    public Conjunto() {
        numbers = new int[0];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public boolean contains(int n) {
        boolean contains = false;
        for(int i : numbers) {
            if(i == n)
                contains = true;
        }
        return contains;
    }

    public void insert(int n) {
        if(!contains(n)) {
            int newNumbers[] = new int[numbers.length + 1];
            int k = 0;
            while(k < numbers.length) {
                newNumbers[k] = numbers[k];
                k++;
            }
            newNumbers[newNumbers.length - 1] = n;
            numbers = newNumbers;
        }
    }

    public void remove(int n) {
        if(contains(n)) {
            int newNumbers[] = new int[numbers.length - 1];
            int k = 0;
            for(int i : numbers) {
                if(i != n) {
                    newNumbers[k] = i;
                    k++;
                }
            }
            numbers = newNumbers;
        }
    }

    public void empty() {
        numbers = new int[0];
    }

    public int size() {
        return numbers.length;
    }

    public Conjunto unir(Conjunto other) {
        Conjunto sum = this;
        for(int i : other.getNumbers()) {
            sum.insert(i);
        }
        return sum;
    }

    public Conjunto subtrair(Conjunto other) {
        Conjunto dif = this;
        for(int i : other.getNumbers()) {
            dif.remove(i);
        }
        return dif;
    }

    public Conjunto interset(Conjunto other) {
        Conjunto inter = new Conjunto();
        int[] a = this.getNumbers();
        int[] b = other.getNumbers();
        for(int i : a)
            if(other.contains(i))
                inter.insert(i);
        for(int i : b)
            if(this.contains(i))
                inter.insert(i);
        return inter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i : numbers) {
            if(i == numbers[0]) {
                sb.append(i);
            } else {
                sb.append(", " + i);
            }
        }
        String a = sb.toString();
        return a;
    }
}
