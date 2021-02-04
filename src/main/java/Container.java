import java.util.Arrays;

public class Container {
    protected int[] array;
    private int length;
    private int lastInd;

    private static int containerSize = 5;

    Container(){
        this.length = containerSize;
        this.array = new int[length];
        this.lastInd = 0;
    }

    public void add(int num){
        if(this.lastInd == this.length-1){
            this.length += 1;
            this.array = Arrays.copyOf(this.array, this.length);
        }
        this.array[this.lastInd] = num;
        this.lastInd++;
    }

    public void show(int ind){
        System.out.println(this.array[ind-1]);
    }

    public void show(){
        for(int i = 0; i < this.lastInd; i++){
            System.out.print(this.array[i] + " ");
        }
        System.out.println();
    }

    public void remove(int ind){
        int[] tmp = new int[this.lastInd-1];
        int j = 0;
        for(int i = 0; i < this.lastInd; i++){
            if(i != ind -1){
                tmp[j] = this.array[i];
                j++;
            }
        }
        this.array = tmp;
        --this.lastInd;
    }
}
