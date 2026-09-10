class DynamicArray {
    int arr[];
    public DynamicArray(int capacity) {
     arr=new int[capacity];
     for(int i=0;i<capacity;i++) arr[i]=-1;


    }

    public int get(int i) {
        return this.arr[i];

    }

    public void set(int i, int n) {
        this.arr[i]=n;

    }

    public void pushback(int n) {
        int i=this.getSize();
        int c=this.getCapacity();
        if(i<c)
        this.arr[i]=n;
        else{
            this.resize();
            this.arr[i]=n;
        }

    }

    public int popback() {
        int i=this.getSize();
        
        int temp = this.arr[i-1];
        this.arr[i-1]=-1;
        return temp;
        
        
        }

    

    private void resize() {
        int i=this.getSize();
        int temp[]=new int[i*2];
        for(int k=0;k<i*2;k++) temp[k]=-1;
         for (int j = 0; j < i; j++) {
        temp[j] = this.arr[j];
    }
        this.arr= temp;


    }

    public int getSize() {
        int counter=0,i=0;
        while(i<this.arr.length && this.arr[i++]!=-1)
        {
            counter++;
        }
        return counter;

    }

    public int getCapacity() {
        return this.arr.length;

    }
}
