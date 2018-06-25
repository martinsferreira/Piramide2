 
public class piramide{


public static void main(String args[]){


 int i,k,j,tamanho=4;
       
        for(i=1;i<=tamanho;i++) //para medir a quantidade de linhas
        {

            for(j=i;j<tamanho;j++) //para printar espaço correspondente ao numero de linhas
                System.out.print(" ");
           
            for(k=1;k<=i;k++)
                System.out.print(" *");           
                System.out.print("\n");                    
        }
       
    }

}
