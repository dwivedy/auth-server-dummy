package com.dwivedy.legalLeague;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

import algo.GraphAlgo;

@SpringBootApplication
@EnableAuthorizationServer
public class AuthServerDummyApplication {

	public static void main(String[] args) {
		//System.out.println(new Boolean(null));
//		SpringApplication.run(AuthServerDummyApplication.class, args);
		
		int arr[]={};
		System.out.println("kxk");
		for(int i:arr){
	          System.out.println("kk");
			System.out.println(i);
		}
		
		String s1="abc";
		String s3="abc";
		String s2=new String("abc");
		
		System.out.println(s1==s2);
		String line1 = "[]";
		System.out.println(line1);
		
		GraphAlgo g = new GraphAlgo(4); 
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        
        System.out.println(g);
        
        
        
        g.DFS(3); 
        Dummy dummy= new Dummy("one");
		Dummy dummy2= new Dummy("1");
		TreeSet<Dummy> set=new TreeSet<>();  
		set.add(dummy);
		set.add(dummy2);
		System.out.println(set);
		System.out.println("s");
        
        try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			int tests = scanInt();
			for (test = 1; test <= tests; test++) {
				solve();
			}
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(1);
		}
        
        
	}
	
	static void solve() throws Exception {
		int n = scanInt();
		int k = scanInt();
		int ans = 0, cur = 0;
		for (int i = 0; i < n; i++) {
			int a = scanInt();
			if (a == k) {
				cur = k;
			} else if (a == cur - 1) {
				cur = a;
				if (a == 1) {
					++ans;
				}
			} else {
				cur = 0;
			}
		}
		printCase();
		out.println(ans);
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	static void printCase() {
		out.print("Case #" + test + ": ");
	}

	static void printlnCase() {
		out.println("Case #" + test + ":");
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;
	static int test;

	
	
}

 class Dummy implements Comparable<Dummy>{
	
	 String name;
		Dummy(String name){
		name=name;
	}
	
	@Override
	public String toString() {
		return "Dummy [name=" + name + "]";
	}

	@Override
	public int compareTo(Dummy o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
 
 class P{
		
public List<String>	abc(String abc){
	return null;
}
	
}

 class C extends P{

	@Override
	public List<String> abc(String abc) {
		return null;
	}
	 
	
 }