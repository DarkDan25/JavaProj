package Pract_8_7;

public class ProstMnozh {
    float b = 2;
    float Prost(float a){
        if(a%b==0){
            a=a/b;
            System.out.println(b);
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
