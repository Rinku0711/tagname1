public class Table1 {public static void main (String args[]){
    System.out.print("Multiplication table\n");
    int i=1;
    do{
        int j=1;
        do{
            System.out.print(i*j+"\t");
            j++;
        }while(j<=3);
        i++;
        System.out.println();
    }while(i<=3);

}
}
