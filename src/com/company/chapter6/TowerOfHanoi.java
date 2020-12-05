package com.company.chapter6;

public class TowerOfHanoi {
    static void towerOfHanoi(int nDisks,char fromRod,char toRod,char auxRod)
    {
        if(nDisks==1)
        {
            System.out.println("Move  disk 1 from rod "+fromRod+" to "+toRod);
            return;
        }
        towerOfHanoi(nDisks-1,fromRod,auxRod,toRod);
        System.out.println("Move disk "+nDisks+" from rod "+fromRod+" to "+toRod);
        towerOfHanoi(nDisks-1,auxRod,toRod,fromRod);
    }

    public static void main(String[] args)
    {
        towerOfHanoi(3,'A','B','C');
    }
}
