package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class Cliente {
	private DatabaseAccess db;
	
	public Cliente (DatabaseAccess db) {
		this.db = db;
	}
	
	public int insertNewRow (List<String> rowData) {
		return this.db.insertNewRow(rowData);
	}
	
	public Collection<String> getSearchResults(String queryString){
		return this.db.getSearchResults(queryString);
	}

}
