package com.test;
class MyClass{

    public static void main(String[] args) {
        int n = 2;
        int z = 1;
        while(z <= n)
            {
                for(int i = n; i >= 1; i--)
                {
                    for(int j = 1; j <= n+1-z; j++)
                    {
                        System.out.print(i + " ");

                    }
                }
                z = z+1;
                System.out.print("$");
            }
        }
    }