package com.itp.model;

public class Engine {
	private int engineCC;
	private int engineLiter;
	private String engineMfg;
	private String engineType;
	
	public Engine() {}
	public Engine(int engineCC, int engineLiter, String engineMfg, String engineType) {
		System.out.println("All Args Constructor of Engine");
		this.engineCC = engineCC;
		this.engineLiter = engineLiter;
		this.engineMfg = engineMfg;
		this.engineType = engineType;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public int getEngineLiter() {
		return engineLiter;
	}
	public void setEngineLiter(int engineLiter) {
		this.engineLiter = engineLiter;
	}
	public String getEngineMfg() {
		return engineMfg;
	}
	public void setEngineMfg(String engineMfg) {
		this.engineMfg = engineMfg;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	
	@Override
	public String toString() {
		return "Engine [engineCC=" + engineCC + ", engineLiter=" + engineLiter + ", engineMfg=" + engineMfg
				+ ", engineType=" + engineType + "]";
	}
	
	
	

}
