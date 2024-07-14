package Week0.Day2;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.");
    int n=sc.nextInt();
    //1.
    // * 
    // * * 
    // * * * 
    // * * * * 
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

// 2.
//       * 
//     * * 
//   * * * 
// * * * * 
    // for(int i=1;i<=n;i++){
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }    
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
// 3.
// ****
// ***
// **
// *
// for(int i=n;i>=1;i--){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//4.
// ****
//  ***
//   **
//    *
// for(int i=n;i>=1;i--){
//     for(int k=1;k<=(n-i);k++){
//                 System.out.print(" ");
//             }   
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// 5.
// ****
//   ***
//      **
//         *
// for(int i=n;i>=1;i--){
//     for(int k=1;k<=(n-i);k++){
//                 System.out.print("  ");
//             }   
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// 6.
// * * * * 
// *     * 
// *     * 
// * * * * 

//7.
// *       * 
//   *   *   
//     *     
//   *   *   
// *       * 
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n;j++){
//         if(i==j || i+j==6){
//             System.out.print("* ");
//         }
//         else{
//             System.out.print("  ");
//         }
//     }
//     System.out.println();
// }

//8.
//OMISSION

}
}
