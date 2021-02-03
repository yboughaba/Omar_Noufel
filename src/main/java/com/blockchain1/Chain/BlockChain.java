package com.blockchain1.Chain;

import com.blockchain1.Block.Block;
import com.blockchain1.Transaction.Transaction;

import java.util.ArrayList;

public class BlockChain {
    //Th e blockchain is implemented as an arraylist of blocks
    public static ArrayList<Block> blockChain = new ArrayList<>();
    public static ArrayList<Transaction> transactions = new ArrayList<>();

    //Create the first block called the genesis block]
    public static Block createGenesisBlock(){
        return new Block(0, "\"Note that this is the beginning of the block 👌\"", "0");
    }

    //Repeatedly Generate a new block based on the latest block
    public static Block createNextBlock(Block prevBlock){
        return new Block(prevBlock.index +1, transactions.toString(), prevBlock.hash);
    }

    public static void printChain(){
        for (int i = 0; i <blockChain.size() ; i++) {
            System.out.println(blockChain.get(i));
        }
    }
}
