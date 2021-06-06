import java.util.Random;

public class P2_a_resolv {
    public static void main(String[] args) throws Exception {
    Random r= new Random();
    int[] res = new int [10];
    boolean[] resul = new boolean[10];
    for(int x = 0; x < res.length; x++){
        res[x] = r.nextInt(100)+1;
        if(res[x] % 2 ==0){
            resul[x]=true;
        }
        else{
            resul[x]=false;
        }
    }
    for(int x=0; x < res.length;x++){
       
        System.out.print(res[x]);
        System.out.print(" ");
        System.out.print(resul[x]);
        System.out.print("|");
    }   
    }
}
