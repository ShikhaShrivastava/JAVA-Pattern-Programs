package com.abc.Multithreading;

class MSWord1 extends Thread{
	public void run()
	{
		if (Thread.currentThread().getName().equals("Typing"))
		{
			try {
				Typing();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(Thread.currentThread().getName().equals("Spellcheck"))
		{
			try {
				Spellcheck();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			try {
				Autosave();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
void Typing() throws InterruptedException
{
	System.out.println("Typing Started");
	for(int i=0;i<4;i++) {
		System.out.println("Typing....");
		Thread.sleep(4000);
	}
	System.out.println("Typing completed");
}
void Spellcheck() throws InterruptedException
{
	System.out.println("Spelling Check Started");
	for(int i=0;i<4;i++) {
		System.out.println("Spell 	Checking....");
		Thread.sleep(4000);
	}
	System.out.println("Spelling check completed");
}
void Autosave() throws InterruptedException {
	System.out.println("AutoSave Started");
	for(int i=0;i<4;i++) {
		System.out.println("AutoSaving....");
		Thread.sleep(4000);
	}
	System.out.println("AutoSave completed");
}
}


public class DaemonThread {
public static void main(String[] args) {
	MSWord1 ms1= new MSWord1();
	MSWord1 ms2= new MSWord1();
	MSWord1 ms3= new MSWord1();
	ms1.setName("Typing");
	ms2.setName("Spellcheck");
	ms3.setName("Autosave");
	ms1.setDaemon(true);
	ms2.setDaemon(true);
	ms3.setDaemon(true);
	ms1.start();
	ms2.start();
	ms3.start();

}
}

