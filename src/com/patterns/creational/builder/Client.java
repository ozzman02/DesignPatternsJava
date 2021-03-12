package com.patterns.creational.builder;

public class Client {

	public static void main(String[] args) {
		
		String from = "client table";
		String where = "cliente name = Oscar";
		
		QueryBuildDirector director = new QueryBuildDirector();
		
		QueryBuilder sqlQueryBuilder = new SqlQueryBuilder();
		Query sqlQuery = director.buildQuery(from, where, sqlQueryBuilder);
		sqlQuery.execute();
		
		QueryBuilder mongoDbQueryBuilder = new MongoDBQueryBuilder();
		Query mongoDbQuery = director.buildQuery(from, where, mongoDbQueryBuilder);
		mongoDbQuery.execute();
		
	}

}
