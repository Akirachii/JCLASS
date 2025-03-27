import java.util.Scanner;
public class Pan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt; // cnt= "cantidad" de lineas a repetir
        cnt = sc.nextInt(); 
        do{
            String linea = sc.nextLine();
            
            int res= 0;
            for (int i= 0; i<cnt;i++){
                //res+=nums[i];
                res+=1;
            }
            System.out.println(res); 
             
        }while(cnt > 0);
    }

}
