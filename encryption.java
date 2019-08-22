/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypt;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HSR
 */
public class encryption {
    public static void main(String args[])
    {
        System.out.println("Enter the message");
        Scanner sc=new Scanner(System.in);
        String input;
        int i,y=0,j=0,sizeInput,sizeCipher,sizeKey,flag=0,count;
        char c,d;
        input=sc.next();
        
        String characters="abcdefghijklmnopqrstuvwxyz";
         String randomString="";
         
         Random rand=new Random();
         int len=rand.nextInt(15
         );
         char[]text=new char[len];
         for(i=0;i<len;i++)
             text[i]=characters.charAt(rand.nextInt(characters.length()));
        for(i=0;i<text.length;i++)
            randomString+=text[i];
        
        sizeKey=randomString.length();
        sizeInput=input.length();
        sizeCipher=randomString.length();
         int value[]=new int[sizeInput];
         int value1[]=new int[sizeCipher];
         int final1[]=new int[sizeInput+sizeKey+1];
         int final2[]=new int[sizeInput];
         int check[]=new int[sizeInput];
         char plainText[]=new char[sizeInput];
        for(i=0;i<sizeInput;i++)
        {
            c=input.charAt(i);
            switch (c)
                    {
                        case 'a': value[i]=1;
                        break;
                        case 'b': value[i]=2;
                        break;
                        case 'c': value[i]=3;
                        break;
                        case 'd': value[i]=4;
                        break;
                        case 'e': value[i]=5;
                        break;
                        case 'f': value[i]=6;
                        break;
                        case 'g': value[i]=7;
                        break;
                        case 'h': value[i]=8;
                        break;
                        case 'i': value[i]=9;
                        break;
                        case 'j': value[i]=10;
                        break;
                        case 'k': value[i]=11;
                        break;
                        case 'l': value[i]=12;
                        break;
                        case 'm': value[i]=13;
                        break;
                        case 'n': value[i]=14;
                        break;
                        case 'o': value[i]=15;
                        break;
                        case 'p': value[i]=16;
                        break;
                        case 'q': value[i]=17;
                        break;
                        case 'r': value[i]=18;
                        break;
                        case 's': value[i]=19;
                        break;
                        case 't': value[i]=20;
                        break;
                        case 'u': value[i]=21;
                        break;
                        case 'v': value[i]=22;
                        break;
                        case 'w': value[i]=23;
                        break;
                        case 'x': value[i]=24;
                        break;
                        case 'y': value[i]=25;
                        break;
                        case 'z': value[i]=26;
                        break;
                        default:value[i]=0;
            }
             
        }
for(i=0;i<sizeCipher;i++)
        {
            d=randomString.charAt(i);
            switch (d)
                    {
                        case 'a': value1[i]=1;
                        break;
                        case 'b': value1[i]=2;
                        break;
                        case 'c': value1[i]=3;
                        break;
                        case 'd': value1[i]=4;
                        break;
                        case 'e': value1[i]=5;
                        break;
                        case 'f': value1[i]=6;
                        break;
                        case 'g': value1[i]=7;
                        break;
                        case 'h': value1[i]=8;
                        break;
                        case 'i': value1[i]=9;
                        break;
                        case 'j': value1[i]=10;
                        break;
                        case 'k': value1[i]=11;
                        break;
                        case 'l': value1[i]=12;
                        break;
                        case 'm': value1[i]=13;
                        break;
                        case 'n': value1[i]=14;
                        break;
                        case 'o': value1[i]=15;
                        break;
                        case 'p': value1[i]=16;
                        break;
                        case 'q': value1[i]=17;
                        break;
                        case 'r': value1[i]=18;
                        break;
                        case 's': value1[i]=19;
                        break;
                        case 't': value1[i]=20;
                        break;
                        case 'u': value1[i]=21;
                        break;
                        case 'v': value1[i]=22;
                        break;
                        case 'w': value1[i]=23;
                        break;
                        case 'x': value1[i]=24;
                        break;
                        case 'y': value1[i]=25;
                        break;
                        case 'z': value1[i]=26;
                        break;
                        default:value1[i]=0;
            }
             
        }
        for(i=0;i<sizeInput;i++)
        {
            if(j==sizeCipher)
                  j=0;
            final1[i]= value[i]+value1[j];
            j++;
              
        }
        for(i=sizeInput;i<(sizeInput+sizeKey);i++)
        {
                final1[i]=value1[y];
                y++;
        }
        final1[i]=sizeKey;
        System.out.println("Encrypted text is");
        for (i=0;i<(sizeInput+sizeKey+1);i++)
             System.out.print(final1[i]+" ");
        System.out.println();
        count=i;
        System.out.println("Count ="+count);
        System.out.println();
    }

       
         
    }
