package bagtut_ex.bagrut2016.Ex4;

import bagtut_ex.Stack;

public class Pole {
    
    Stack<Ring> rings;

    public Pole(){
        this.rings = new Stack<>();
    }

    public void add(Ring r){
        this.rings.push(r);
    }

    public Ring remove(){
        return this.rings.pop();
    }

    public boolean isEmpty(){
        return this.rings.isEmpty();
    }

    // 2n times -> O(n)
    public void sort(){
        Stack<Ring> tmp1, tmp2;
        tmp1 = new Stack<Ring>();
        tmp2 = new Stack<Ring>();
        // n times
        while(!rings.isEmpty()){
            if(rings.top().getSize().equals("L")){
                tmp1.push(rings.pop());
            }
            else{
                tmp2.push(rings.pop());
            }
        }
        // n times
        while(!tmp1.isEmpty()){
            rings.push(tmp1.pop());
        }
        while(!tmp2.isEmpty()){
            rings.push(tmp2.pop());
        }
    }

    public void print(){
        Stack<Ring> tmp = new Stack<>();
        while(!rings.isEmpty()){
            System.out.println("size: " + rings.top().getSize() + " ,color: " + rings.top().getColor());
            tmp.push(rings.pop());
        }
        while(!tmp.isEmpty()){
            rings.push(tmp.pop());
        }
    }
}
