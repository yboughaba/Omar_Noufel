package com.blockchain1;

import com.blockchain1.Block.Block;
import com.blockchain1.Chain.BlockChain;

import static com.blockchain1.Chain.BlockChain.*;

public class Main {
    public final static int NUM_BLOCKS = 20;
    public static void main(String []args){
        BlockChain.blockChain.add(createGenesisBlock());//Creates the start of the block and add it to the chain

        for (int i = 0; i <NUM_BLOCKS ; i++) {
            Block next = createNextBlock(BlockChain.blockChain.get(i));
            BlockChain.blockChain.add(next);
        }

        printChain();
    }
}