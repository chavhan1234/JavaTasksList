//Dispaly a 3*3 number grid using array and check if number is exits 

import java.util.*;
public class gridSearch{
    public static void main(String[] args) {

        int [][] grid={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    System.out.println("3 * 3 Number Grid");
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            System.out.println(grid[i][j]+ " ");
        }
        System.out.println();
    }


    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to search");

    int searchNum=sc.nextInt();
    boolean found=false;

    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            if(grid[i][j]==searchNum){
                found=true;
                break;
            }
        }
    }

if(found){
  System.out.println(searchNum + " exits in the grid");
}else{
      System.out.println(searchNum + " not exits in the grid");
}
    }
}