import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int op = in.nextInt();
        while(op != 0){
            BSTree bst = new BSTree();
            for(int i = 0; i < op; ++i){
                int data = in.nextInt();
                double temp = in.nextDouble();
                bst.inserir(new Data(data, temp));
            }
            int t = in.nextInt();
            int dataM = bst.maiorTemp().data;
            for(int i = 0; i < t; ++i){
                int chute = in.nextInt();
                if(dataM == chute){
                    System.out.println("Correto");
                }else{
                    System.out.println("Incorreto");
                }
            }
            op = in.nextInt();
        }
        in.close();
    }
}
