package client;

import client.ClientClass;

import java.io.IOException;

public class MainClass {
    public static void main (String[] argc)
    {
        ClientClass client = new ClientClass("192.168.0.1", 9797); // momentan ar trebui sa fim conectati
        client.play();
    }
}
