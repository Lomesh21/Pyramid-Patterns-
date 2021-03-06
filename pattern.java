import java.util.*;
class patterns{
    public void half_pyramid(int r,char sym){
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print(sym+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void half_pyramid(int r,int sym){
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print(sym+" ");
            }
            System.out.println();
            sym++;

        }
        System.out.println();
    }
    
    public void half_pyramid_r(int r,char sym){
        for(int i=0;i<r;i++){
            for(int space=0;space<r-i;space++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(sym+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void half_inverted_pyramid_r(int r,char sym){
        for(int i=r;i>0;i--){
            for(int space=0;space<r-i;space++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print(sym+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void half_inverted_pyramid(int r,char sym){
        for(int i=r;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(sym+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void full_pyramid(int r,char sym){
        for(int i=0;i<r;i++){
            for(int space=0;space<r-i;space++){
                System.out.print("  ");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print(sym+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void inverted_full_pyramid(int r,char sym){
        for(int i=r-1;i>=0;i--){
            for(int space=0;space<r-i-1;space++){
                System.out.print("  ");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print(sym+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void up_down_pyramid(int r,char sym){
        for(int i=0;i<r-1;i++){
            for(int space=0;space<r-i-1;space++){
                System.out.print("  ");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print(sym+" ");
            }
            System.out.println();
        }
        
        for(int i=r-1;i>=0;i--){
            for(int space=0;space<r-i-1;space++){
                System.out.print("  ");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print(sym+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    
}
public class pattern {
    public static void main(String[] args) {
        
        patterns p=new patterns();
        
        Scanner sc=new Scanner(System.in);
        int choice=1,r,num;
        char sym;
        while(choice!=0){
            System.out.print("MENU\n1.Half char pyramid(l)\n2.Half char pyramid(r)\n3.Half number pyramid(l)\n4.Half inverted char pyramid(r)\n5.Half inverted char pyramid(l)\n6.Full char pyramid\n7.Full inverted char pyramid\n6.up down char pyramid\n0.Exit\n");
            System.out.print("Enter Choice : ");
            choice=sc.nextInt();
            switch(choice){
                case 0:
                 return;
             
                case 1:
                    System.out.print("Enter number of rows: ");
                    r=sc.nextInt();
                    System.out.print("Enter the symbol: ");
                    sym=sc.next().charAt(0);
                    p.half_pyramid(r, sym);
                    break;
                case 2:
                    System.out.print("Enter number of rows: ");
                    r=sc.nextInt();
                    System.out.print("Enter the symbol: ");
                    sym=sc.next().charAt(0);
                    p.half_pyramid_r(r, sym);
                    break;
                case 3:
                    System.out.print("Enter number of rows: ");
                    r=sc.nextInt();
                    System.out.print("Enter the start_number: ");
                    num=sc.nextInt();
                    p.half_pyramid(r, num);
                    break;
                case 4:
                    System.out.print("Enter number of rows: ");
                    r=sc.nextInt();
                    System.out.print("Enter the symbol: ");
                    sym=sc.next().charAt(0);
                    p.half_inverted_pyramid_r(r, sym);
                    break;
                case 5:
                    System.out.print("Enter number of rows: ");
                    r=sc.nextInt();
                    System.out.print("Enter the symbol: ");
                    sym=sc.next().charAt(0);
                    p.half_inverted_pyramid(r, sym);
                    break;
                case 6:
                    System.out.print("Enter number of rows: ");
                    r=sc.nextInt();
                    System.out.print("Enter the symbol: ");
                    sym=sc.next().charAt(0);
                    p.full_pyramid(r, sym);
                    break;
                case 7:
                    System.out.print("Enter number of rows: ");
                    r=sc.nextInt();
                    System.out.print("Enter the symbol: ");
                    sym=sc.next().charAt(0);
                    p.inverted_full_pyramid(r, sym);
                    break;
                case 8:
                    System.out.print("Enter number of rows: ");
                    r=sc.nextInt();
                    System.out.print("Enter the symbol: ");
                    sym=sc.next().charAt(0);
                    p.up_down_pyramid(r, sym);
                    break;               
            }

        }


    }
}
