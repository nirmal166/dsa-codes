public class linear{

public static int linearsearch(int[] numbers,int key){

    for(int i=0;i<numbers.length;i++){
        if(numbers[i]==key){
            return i;
        }
        
    }
    return -1;
}
public static void main (String args[]){
int numbers[]={30,38,48,44,99,97,4,3,332};
int key=332;
int search=linearsearch(numbers,key);

if(search==-1){
    System.out.println("no found");
}
else{
    System.out.println(" found"+search);
}
}
}

