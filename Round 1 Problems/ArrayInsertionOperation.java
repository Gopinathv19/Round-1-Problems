import java.util.Scanner;

public class ArrayInsertionOperation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size+1];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int value=sc.nextInt();
        arrayOperation(array,value,value,size);



    }
    static void arrayOperation(int[]array,int pos ,int value,int size){

        if(pos<=0||pos>size){

             System.out.print("cant be used");
        }
        else if(pos==1){
            for(int i=size-1;i>=pos-1;i--){
                array[i+1]=array[i];

            }
            array[0]=value;
            for(int n:array){
                System.out.print(n+" ");
            }
        } else if (pos==size+1) {
            array[size]=value;
            for(int n:array){
                System.out.print(n+" ");
            }

        }
        else {
            for(int i=size-1;i>=pos-1;i--){
                array[i+1]=array[i];
            }
            array[pos-1]=value;
            for(int n:array){
                System.out.print(n+" ");
            }
        }


    }
}
