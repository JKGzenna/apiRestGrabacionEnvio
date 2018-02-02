package es.cex.apiRestGrabacionEnvio.domain;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;
import oracle.sql.STRUCT;
import org.springframework.data.jdbc.support.oracle.StructMapper;





import oracle.sql.Datum;

@SuppressWarnings("serial")
public class SqlEtiqueta extends ObtencionEtiqueta implements StructMapper<SqlEtiqueta> {

    // @Override
    public void readSQL(SQLInput stream, String typeName) throws SQLException {
        setCodigoBarras(stream.readString());
        setFechaEnvio(stream.readString());
        setCodigoRemi(stream.readString());
        setNombreRemi(stream.readString());
        setDireccionRemi(stream.readString());
        setCpRemi(stream.readString());
        setPoblacionRemi(stream.readString());
        setTelefonoRemi(stream.readString());
        setNumeroEnvio(stream.readString());
        setNombreDest(stream.readString());
        setDireccionDest(stream.readString());
        setContactoDest(stream.readString());
        setTelefonoDest(stream.readString());
        setReferencia(stream.readString());
        setObservaciones(stream.readString());
        setCpDest(stream.readString());
        setPoblacionDest(stream.readString());
        setNombreDelDest(stream.readString());
        setKilos(stream.readBigDecimal());
        setBultos(stream.readLong());
        setPortes(stream.readString());
        setProducto(stream.readLong());
        setNombreProducto(stream.readString());
        setReembolso(stream.readBigDecimal());
        setEntregaSab(stream.readLong());
        setEnvioRetorno(stream.readString());
        setObs2(stream.readString());
        setCodigoEtiqueta(stream.readString());
    }

    //@Override
    public void writeSQL(SQLOutput stream) throws SQLException {
        stream.writeString(getCodigoBarras());
        stream.writeString(getFechaEnvio());
        stream.writeString(getCodigoRemi());
        stream.writeString(getNombreRemi());
        stream.writeString(getDireccionRemi());
        stream.writeString(getCpRemi());
        stream.writeString(getPoblacionRemi());
        stream.writeString(getTelefonoRemi());
        stream.writeString(getNumeroEnvio());
        stream.writeString(getNombreDest());
        stream.writeString(getDireccionDest());
        stream.writeString(getContactoDest());
        stream.writeString(getTelefonoDest());
        stream.writeString(getReferencia());
        stream.writeString(getObservaciones());
        stream.writeString(getCpDest());
        stream.writeString(getPoblacionDest());
        stream.writeString(getNombreDelDest());
        stream.writeBigDecimal(getKilos());
        stream.writeLong(getBultos());
        stream.writeString(getPortes());
        stream.writeLong(getProducto());
        stream.writeString(getNombreProducto());
        stream.writeBigDecimal(getReembolso());
        stream.writeLong(getEntregaSab());
        stream.writeString(getEnvioRetorno());
        stream.writeString(getObs2());
        stream.writeString(getCodigoEtiqueta());

        stream.writeStruct(null);
    }

    @Override
    public SqlEtiqueta fromStruct(STRUCT struct) throws SQLException {
        SqlEtiqueta sqlEtiqueta = new SqlEtiqueta();
        Datum[] oracleValues = struct.getOracleAttributes();
        sqlEtiqueta.setCodigoBarras(Utility.readDatnumString(oracleValues[0]));
        sqlEtiqueta.setFechaEnvio(Utility.readDatnumString(oracleValues[1]));
        sqlEtiqueta.setCodigoRemi(Utility.readDatnumString(oracleValues[2]));
        sqlEtiqueta.setNombreRemi(Utility.readDatnumString(oracleValues[3]));
        sqlEtiqueta.setDireccionRemi(Utility.readDatnumString(oracleValues[4]));
        sqlEtiqueta.setCpRemi(Utility.readDatnumString(oracleValues[5]));
        sqlEtiqueta.setPoblacionRemi(Utility.readDatnumString(oracleValues[6]));
        sqlEtiqueta.setTelefonoRemi(Utility.readDatnumString(oracleValues[7]));
        sqlEtiqueta.setNumeroEnvio(Utility.readDatnumString(oracleValues[8]));
        sqlEtiqueta.setNombreDest(Utility.readDatnumString(oracleValues[9]));
        sqlEtiqueta.setDireccionDest(Utility.readDatnumString(oracleValues[10]));
        sqlEtiqueta.setContactoDest(Utility.readDatnumString(oracleValues[11]));
        sqlEtiqueta.setTelefonoDest(Utility.readDatnumString(oracleValues[12]));
        sqlEtiqueta.setReferencia(Utility.readDatnumString(oracleValues[13]));
        sqlEtiqueta.setObservaciones(Utility.readDatnumString(oracleValues[14]));
        sqlEtiqueta.setCpDest(Utility.readDatnumString(oracleValues[15]));
        sqlEtiqueta.setPoblacionDest(Utility.readDatnumString(oracleValues[16]));
        sqlEtiqueta.setNombreDelDest(Utility.readDatnumString(oracleValues[17]));
        sqlEtiqueta.setKilos(Utility.readDatnumBigDecimal(oracleValues[18]));
        sqlEtiqueta.setBultos(Utility.readDatnumLong(oracleValues[19]));
        sqlEtiqueta.setPortes(Utility.readDatnumString(oracleValues[20]));
        sqlEtiqueta.setProducto(Utility.readDatnumLong(oracleValues[21]));
        sqlEtiqueta.setNombreProducto(Utility.readDatnumString(oracleValues[22]));
        sqlEtiqueta.setReembolso(Utility.readDatnumBigDecimal(oracleValues[23]));
        sqlEtiqueta.setEntregaSab(Utility.readDatnumLong(oracleValues[24]));
        sqlEtiqueta.setEnvioRetorno(Utility.readDatnumString(oracleValues[25]));
        sqlEtiqueta.setObs2(Utility.readDatnumString(oracleValues[26]));
        sqlEtiqueta.setCodigoEtiqueta(Utility.readDatnumString(oracleValues[27]));

        return sqlEtiqueta;
    }

	@Override
	public STRUCT toStruct(SqlEtiqueta source, Connection conn, String typeName) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
