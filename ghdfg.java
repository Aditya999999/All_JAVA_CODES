package com.test;

class ghdfg
{
    public static void main (String a[])
    {
        int n=2;
        int t=n;
        ghdfg cl = new ghdfg();
        for (int row = 1; row <= n; row++) {
            cl.print(n,t);
            t--;
            System.out.print("$");
        }
    }
    public void print(int num, int t)
    {

        while(num>0) {
            for(int i=1;i<=t;i++) {
                System.out.print(num+ " ");
            }
            num--;

        }
    }


}
