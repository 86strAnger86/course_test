package ru.parsentev.task_001;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author parsentev
 * @since 18.07.2016
 */
public class Calculator {
    private static final Logger log = getLogger(Calculator.class);
    private  double res;
    public double getResult() {
        try{
            System.out.println(res);
            return res;
        }catch (UnsupportedOperationException e){
            throw new UnsupportedOperationException();
        }
    }

    public void add(double first, double second) {
        try{
            res = first+second;
            System.out.println("first: " + first + " + Second: " + second + " = ");
        }catch (UnsupportedOperationException e){
            throw new UnsupportedOperationException();
        }
    }

    public void substract(double first, double second) {
        try{
            res = first-second;
            System.out.println("first: " + first + " - Second: " + second + " = ");
        }catch (UnsupportedOperationException e){
            throw new UnsupportedOperationException();
        }
    }

    public void multiple(double first, double second) {
        try {
            res = first*second;
            System.out.println("first: " + first + " * Second: " + second + " = ");
        }catch (UnsupportedOperationException e){
            throw new UnsupportedOperationException();
        }
    }

    public void div(double first, double second) {
        if (second==0)
            throw new IllegalStateException();
        try{
            res = first/second;
            System.out.println("first: " + first + " / Second: " + second + " = ");
        }catch (UnsupportedOperationException e){
            throw new UnsupportedOperationException();
        }
    }

    public void expand(double first, double second) {
        try{
            res = (int)Math. pow(first, second);
            System.out.println("first: " + first + " pow Second: " + second + " = ");
        }catch (UnsupportedOperationException e){
            throw new UnsupportedOperationException();
        }

    }
}
