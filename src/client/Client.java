/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import operation.*;

/**
 *
 * @author a
 */
public class Client {

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
        	
        	/*
        	 * RMI
        	 * 		PalindromeInterface pl = (PalindromeInterface) Naming.lookup("rmi://localhost:1099/palindrome");
        	*/
        	
        	//JNDI
		        	final Hashtable<Object,Object> jndiProperties = new Hashtable<Object,Object>();
		        	
		        	jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.rmi.registry.RegistryContextFactory");
		        	jndiProperties.put(Context.PROVIDER_URL, "rmi://localhost:1099");
		        	
		        	InitialContext ctx = new InitialContext(jndiProperties);
		        	PalindromeInterface pl = (PalindromeInterface) ctx.lookup("palindrome");
        	
        	System.out.println(pl.Palindrome("ala"));
        	
        } catch (RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

}
