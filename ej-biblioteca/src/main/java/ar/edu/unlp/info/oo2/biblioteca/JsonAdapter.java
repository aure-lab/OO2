package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class JsonAdapter implements Exporter{
	
	private JSONObject exportar(Socio socio) {
		JSONObject json = new JSONObject();
		json.put("nombre", socio.getNombre());
		json.put("email", socio.getEmail());
		json.put("legajo", socio.getLegajo());
		return json;
	}
	
	@Override
	public String exportar(List<Socio> socios) {
		JSONArray listaFormateada = new JSONArray();
		socios.stream().forEach( s -> listaFormateada.add(exportar(s)));
		return listaFormateada.toJSONString();
	}
	

}
