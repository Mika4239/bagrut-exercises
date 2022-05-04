package bagtut_ex.bagrut2018.Ex1;

public class AllNumbers {
    
    private int[] arrayNum;     

    public AllNumbers(int[] arrayNum){
        this.arrayNum = new int[arrayNum.length];
        for(int i = 0; i < this.arrayNum.length; i++){
            this.arrayNum[i] = arrayNum[i];
        }

    }

    public int lastOddValue(){
        int last = -1;
        for(int i = 0; i < this.arrayNum.length; i++){
            if(this.arrayNum[i] % 2 != 0){
                last = this.arrayNum[i];
            }
        }

        return last;
    }
}
