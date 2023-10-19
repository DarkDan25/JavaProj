package Pract_8_7;

public class ProstMnozh {
    int b = 2;
    float Prost(int a){
        if(a%b==0){
            a=a/b;
            System.out.print(b+" ");
        }
        else {
            b++;
        }
        if(a<=1)
        {
            return 1;
        }
        Prost(a);
        return 0;
    }
}
