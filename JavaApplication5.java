/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author al-farouksaleh
 */
public class JavaApplication5 {
public static void main (String [] args)throws Exception{
    
    
int cnt1=-9;
int cnt2= (int) (Math.random()*25); 
File file = new File ("/Users/al-farouksaleh/Desktop/filee.txt");
String s = null; String w="";
int l = 0;int end=0;
char[] s2= new char[1000];
try {
Scanner fileScanner = new Scanner (file);
Scanner input = new Scanner (System.in);
int wrong=0;

while (fileScanner.hasNextLine()&&(cnt1<cnt2)&&(cnt1!=24)){
s=fileScanner.nextLine();
l=s.length();
    cnt1++;
}

for (int i=0;i<l-1;i++){
s2[i]='-';
}

for (int i=0;i<l;i++){
if (((int)s.charAt(i))==32)s2[i]=((char)32);

}

while (wrong<=10){
System.out.print("You are guessing:");
for (int i=0;i<l-1;i++)System.out.print(s2[i]);
System.out.println("");
System.out.println("You have guessed ("+wrong+") wrong letters:"+w);

System.out.print("Guess a letter:");

char temp = input.next().charAt(0);
int k=s.indexOf(temp);
if (k<0){
w+=" "+temp;
wrong++; end++;     
continue;
}

while (k>=0){
s2[k]=temp;
k=s.indexOf(temp,k+1);

}
int flag=1;
for (int i=0;i<l-1;i++){
if (s.charAt(i)!=s2[i])flag=0;
}

if (flag==1){System.out.println("You win!");
    System.out.println("you've guessed ");
    for (int i=0;i<l-1;i++)System.out.print(s2[i]);
    System.out.println(" correctly.");
    break;
}



    
    

}



}
catch (FileNotFoundException e){
    System.out.println("file not found mzfkr");
}
}
    
    
}
