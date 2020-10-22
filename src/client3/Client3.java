/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client3;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import operation.*;

/**
 *
 * @author a
 */
public class Client3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        	
            /*
             * Reverse
            Scanner sc = new Scanner(System.in);
            System.out.println("Donner une chaine : ");
            String s = sc.next();
            ReverseInterface rev = (ReverseInterface) Naming.lookup("rmi://localhost:1099/rev");
            String result = rev.reverseString(s);
            
            System.out.println("L'inverse de " + s + " est " + result);
            */
        	
        	/*
             *Trielist
        	ArrayList<String> mylist = new ArrayList<>();
        	mylist.add("qwerty");
        	mylist.add("AZERTY");
        	TrielistInterface trie = (TrielistInterface) Naming.lookup("rmi://localhost:1099/trie");
        	System.out.println(trie.Trielist(mylist));
        	*/
        
        	/*
            *Produit
        	ProduitInterface pr = (ProduitInterface) Naming.lookup("rmi://localhost:1099/produit");
        	System.out.println(pr.Produit(2, 10));
        	*/
        	
        	PalindromeInterface pl = (PalindromeInterface) Naming.lookup("rmi://localhost:1099/palindrome");
        	System.out.println(pl.Palindrome("ala"));
        	
        } catch (NotBoundException ex) {
            Logger.getLogger(Client3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Client3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Client3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
