package Streams;

import java.io.*;


class Producer extends Thread{
	
	
	OutputStream os;
	
	public Producer(OutputStream o) {
		os=o;
	}
	
	public void run() {
		int count=1;
		
		while(true) {
			try {
			os.write(count);
			os.flush();
			
			System.out.println("Producer "+count);
			count++;
			}catch(Exception e) {
				
			}
			
		}
	}
}

class Consumer extends Thread{
	
	
	InputStream is;
	
	public Consumer(InputStream i) {
		is=i;
	}
	
	public void run() {
		int z=1;
		
		while(true) {
			try {
			z=is.read();
		
			
			System.out.println("Consumer "+z);
			System.out.flush();
			Thread.sleep(10);
			}catch(Exception e) {
				
			}
			
		}
	}
}



public class PipedStream {

	
	public static void main(String args[]) throws Exception {
		
		PipedInputStream pis= new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		
		pis.connect(pos);
		
		Producer p = new Producer(pos);
		Consumer c = new Consumer(pis);
		
		p.start();
		c.start();

	}
}
