/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Aladdin Xiong
 * 100 CSC 422 Software Engineering
 * Week 6 - Junit Testing
 */
public class Stack {

    private int size;
    private String capacity[];
    
    private class EmptyStackException extends RuntimeException{
        
    }
    
    private class FullStackException extends RuntimeException{
        
    }
    
    public Stack(int capacity){
        this.capacity = new String[capacity];
    }
    
    public int size(){
        return size;
    }
    
    public void push(String capacity){
        if(isFull()){
            throw new FullStackException();
        }
        this.capacity[size++] = capacity;
    }
    
    private boolean isFull(){
        return size == capacity.length;
    }
    
    public String pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return capacity[--size];
    }
    
    private boolean isEmpty(){
        return size == 0;
    }
    
    //public static void main(String[] args) {
        // TODO code application logic here
    //}
    
}
