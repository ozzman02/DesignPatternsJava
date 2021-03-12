package com.patterns.creational.builder;

public class MongoDBQuery implements Query {

	private String from;
	
	private String where;
	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	@Override
	public void execute() {
		System.out.println("Executing mongoDbQuery from: "+from+" where "+where);
	}

}
