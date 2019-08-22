
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HSR
 */
public class receivenew {
    public static void main(String str[])
    {
        System.out.println("Enter count");
        Scanner sc=new Scanner(System.in);
        int count,lengthKey,lengthText,i,j;
        count=sc.nextInt();
        System.out.println("Enter cipher text");
        int text[]=new int[count];
        
        for(i=0;i<count;i++)
            text[i]=sc.nextInt();
        lengthKey=text[i-1];
        lengthText=i-lengthKey-1;
         int res[]=new int[lengthText];
        char[] plainText=new char[lengthText];
        j=lengthText;
        for(i=0;i<lengthText;i++)
        {
            res[i]=text[i]-text[j];
            j++;
            if(j>(lengthKey+lengthText-1))
                j=lengthText;
                
        }

       for(i=0;i<lengthText;i++)
         {
             switch(res[i])
             {
                 case 1: plainText[i]='a';
                 break;
                 case 2: plainText[i]='b';
                 break;
                 case 3: plainText[i]='c';
                 break;
                 case 4: plainText[i]='d';
                 break;
                 case 5: plainText[i]='e';
                 break;
                 case 6: plainText[i]='f';
                 break;
                 case 7: plainText[i]='g';
                 break;
                 case 8: plainText[i]='h';
                 break;
                 case 9: plainText[i]='i';
                 break;
                 case 10: plainText[i]='j';
                 break;
                 case 11: plainText[i]='k';
                 break;
                 case 12: plainText[i]='l';
                 break;
                 case 13: plainText[i]='m';
                 break;
                 case 14: plainText[i]='n';
                 break;
                 case 15: plainText[i]='o';
                 break;
                 case 16: plainText[i]='p';
                 break;
                 case 17: plainText[i]='q';
                 break;
                 case 18: plainText[i]='r';
                 break;
                 case 19: plainText[i]='s';
                 break;
                 case 20: plainText[i]='t';
                 break;
                 case 21: plainText[i]='u';
                 break;
                 case 22: plainText[i]='v';
                 break;
                 case 23: plainText[i]='w';
                 break;
                 case 24: plainText[i]='x';
                 break;
                 case 25: plainText[i]='y';
                 break;
                 case 26: plainText[i]='z';
                 break;
             }
         }
    for(i=0;i<lengthText;i++)
        System.out.print(plainText[i]);
    System.out.println();
    }
}
