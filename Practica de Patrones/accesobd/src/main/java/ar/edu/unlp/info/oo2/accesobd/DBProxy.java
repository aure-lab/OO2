package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class DBProxy implements DatabaseAccess {
	private DatabaseRealAccess bd;
	private int pswd;
	private boolean isLogedIn;
	private static final Logger logger = Logger.getLogger(DBProxy.class.getName());
	
	
	public DBProxy (DatabaseRealAccess bd, int pswd) {
		this.bd = bd;
		this.isLogedIn = false;
		this.pswd = pswd;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.isLogedIn) {
			logger.info("Acceso válido para búsqueda"); 
			return this.bd.getSearchResults(queryString);
		}
		logger.severe("Acceso invalido.");
		return Collections.emptyList();
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(this.isLogedIn) {
			logger.warning("Acceso valido para la insersion");
			return this.bd.insertNewRow(rowData);
		}
		logger.severe("Acceso invalido.");
		return 0;
	}
	
	public void logIn (int pswd) {
		if (this.pswd == pswd)
			this.isLogedIn = true;
	}
	
	public void logOut () {
		this.isLogedIn = false;
	}

}
