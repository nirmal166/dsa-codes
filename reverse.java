public class reverse{
public static void areverse(int numbers[]){
int first=0;
int last=numbers.length-1;
while(first<last){
int temp=numbers[last];
numbers[last]=numbers[first];
numbers [first]=temp;
first++;
last--;
}
}
public static void main (String args[]){
       int numbers[]={10,20,39,49,90};
       areverse(numbers);
       for(int i=0;i<numbers.length;i++){
        System.out.println(numbers[i]+"");
       }
       System.out.println();
    }
}
    
    
    

