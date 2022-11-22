public class largest{
    public static void main (String args[]){
        int largarray[]={10,20,30,49,47};

int max=largarray[0];
        for(int i=0;i<largarray.length;i++){
        
if(largarray[i]>max){
    max=largarray[i];
}

        }
        System.out.println(max);
        
    }
}