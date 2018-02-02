package es.cex.apiRestGrabacionEnvio.dao.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import es.cex.apiRestGrabacionEnvio.domain.BultoJSON;
import es.chx.procedures.rowmappers.RowMapperOptionalCursor;



public class BultoRowMapper extends RowMapperOptionalCursor {

	
	/**
	 * {@inheritDoc}
	 * (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		
	
		
		ArrayList<BultoJSON> bultos = new ArrayList<BultoJSON>();
//		BultoSeguimiento[] listaBultos = null;
		BultoJSON bultoSeg = null;				
		do
		{
			String[] aux = rs.getString(1).split("\\|");
			
			bultoSeg = new BultoJSON();
			bultoSeg.setOrden(aux[0]);
			bultoSeg.setCodUnico(aux[1]);
			if (aux.length > 2){
				bultoSeg.setCodBultoCli(aux[2]);
				bultoSeg.setReferencia(aux[3]);
				bultoSeg.setDescripcion(aux[4]);
				bultoSeg.setObservaciones(aux[5]);
				bultoSeg.setKilos(aux[6]);
				bultoSeg.setVolumen(aux[7]);
				bultoSeg.setAlto(aux[8]);
				bultoSeg.setLargo(aux[9]);
				bultoSeg.setAncho(aux[10]);
			}

			bultos.add(bultoSeg);
		}while(rs.next());
		
		return bultos;
		
		
		
	}
}