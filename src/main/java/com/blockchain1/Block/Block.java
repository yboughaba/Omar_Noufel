package com.blockchain1.Block;

import com.blockchain1.Encryption.Encryption;

import java.util.Date;

public class Block{
    private long timestamp;
    public int index;
    public String data;
    public String prev_hash;
    public String hash;

    //Constructor for the block class
    public Block(int index, String data, String prev_hash){
        this.index = index;
        this.data = data;
        this.timestamp = new Date().getTime();
        this.prev_hash = prev_hash;
        this.hash = getHash();//To be done in a few
    }

    private String getHash(){
        return Encryption.sha256(this.index + this.timestamp + this.data + this.prev_hash);
    }

    //Override the toString method
    @Override
    public String toString(){
        return ("Block #" + this.index + "\n\ttimed-at: " + this.timestamp +
                " \n\t Data: " + this.data + "\n\tHash: {" + this.hash + "}\n");
    }
}
