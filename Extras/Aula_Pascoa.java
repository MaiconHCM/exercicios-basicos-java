package Extras;

import java.util.Scanner;

public class Aula_Pascoa {
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);
        int y,a,b,c,d,z,g,k,h,j,m,r,p,n;
        System.out.println("Escreva o ano desejado:");
        y = input.nextInt();
        a = y%19;
        b = y/100;
        c = y%100;
        d = b/4;
        z = b%4;
        g = (8*b+13)/25;
        h = (19*a+b-d-g+15)%30;
        j = c/4;
        k = c%4;
        m = (a+11*h)/319;
        r = (2*z+2*j-k-h+m+32)%7;
        n = (h-m+r+90)/25;
        p = (h-m+r+n+19)%32;
        System.out.println("no ano de "+y+" o domingo pascoa sera no dia "+p+" "
                + "de abril");
    }
}
