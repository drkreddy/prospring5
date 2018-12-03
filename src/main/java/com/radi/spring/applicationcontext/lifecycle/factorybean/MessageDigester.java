package com.radi.spring.applicationcontext.lifecycle.factorybean;

import java.security.MessageDigest;

public class MessageDigester {
    private MessageDigest shaDigest;

    public MessageDigest getShaDigest() {
        return shaDigest;
    }

    public MessageDigest getDefaultDigest() {
        return defaultDigest;
    }

    private MessageDigest defaultDigest;

    public void setShaDigest(MessageDigest shaDigest) {
        this.shaDigest = shaDigest;
    }

    public void setDefaultDigest(MessageDigest defaultDigest) {
        this.defaultDigest = defaultDigest;
    }

    public void digest(String msg){
        System.out.println("Using shadigest");
        digest(msg,shaDigest);
        System.out.println("Using default Digest");
        digest(msg,defaultDigest);
    }

    private void digest(String msg, MessageDigest digest) {
        System.out.println("Using alorithm"+digest.getAlgorithm());
        digest.reset();
        byte[] bytes = msg.getBytes();
        byte[] out = digest.digest(bytes);
        System.out.println(out);

    }
}
