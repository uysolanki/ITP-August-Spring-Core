package com.itp.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Player //implements InitializingBean,DisposableBean
{
		private int jno;
		private String pname;
		
		public Player() {}
		public Player(int jno, String pname) {
			System.out.println("All Args Constructor of Player class");
			this.jno = jno;
			this.pname = pname;
		}
		
		
		public int getJno() {
			return jno;
		}
		public void setJno(int jno) {
			this.jno = jno;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		
		
		@Override
		public String toString() {
			return "Player [jno=" + jno + ", pname=" + pname + "]";
		}
		

		
		@PostConstruct
		public void morning() {
		System.out.println("Immediately After constructor of Player class");
			
		}

		@PreDestroy
		public void night(){
			System.out.println("Before GC");
			
		}
		
		
		
}
