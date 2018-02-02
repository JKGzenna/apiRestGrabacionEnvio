package es.cex.apiRestGrabacionEnvio.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Array;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import oracle.sql.ARRAY;
import oracle.sql.Datum;
import oracle.sql.STRUCT;

public class Utility {

    /**
     * Permite escribir un Long en un Struct de oracle comprobando si el valor
     * es nulo
     * 
     * @param stream
     * @param value
     * @throws SQLException
     */
    public static void writeLongNull(SQLOutput stream, Long value) throws SQLException {
        if (value == null)
            stream.writeBigDecimal(null);
        else
            stream.writeLong(value.longValue());
    }

    /**
     * Escribe un entero en un Struct de oracle comprobando si el valor es nulo
     * 
     * @param stream
     * @param value
     * @throws SQLException
     */
    public static void writeIntNull(SQLOutput stream, Integer value) throws SQLException {
        if (value == null)
            stream.writeBigDecimal(null);
        else
            stream.writeInt(value.intValue());
    }

    /**
     * Lee un long de un Struct de oracle devolviendo nulo si se leyo un SQL
     * NULL
     * 
     * @param input
     * @return
     * @throws SQLException
     */
    public static Long readLongNull(SQLInput input) throws SQLException {
        Long value = input.readLong();

        if (input.wasNull()) {
            return null;
        }

        return value;
    }

    /**
     * Lee un Integer de un Struct de oracle devolviendo nulo si se leyo SQL
     * NULL
     * 
     * @param input
     * @return
     * @throws SQLException
     */
    public static Integer readIntNull(SQLInput input) throws SQLException {
        Integer value = input.readInt();
        if (input.wasNull()) {
            return null;
        }

        return value;

    }

    public static Long readCodError(BigDecimal value) {
        if (value != null) {
            return value.longValue();
        } else {
            return Long.valueOf(0);
        }

    }

    /**
     * Lee un BigInteger de un Struct de oracle devolviendo nulo si se leyo SQL
     * NULL
     * 
     * @param input
     * @return
     * @throws SQLException
     */
    public static BigInteger readBigInteger(SQLInput input) throws SQLException {
        BigDecimal value = input.readBigDecimal();
        if (value == null) {
            return null;
        }

        return value.toBigInteger();

    }

    /**
     * Escribe un BigInteger de un Struct de oracle devolviendo nulo si se leyo
     * SQL NULL
     * 
     * @param stream
     * @param value
     * @return
     * @throws SQLException
     */
    public static void writeBigInteger(SQLOutput stream, BigInteger value) throws SQLException {
        if (value == null)
            stream.writeBigDecimal(null);
        else
            stream.writeBigDecimal(new BigDecimal(value));

    }

    /**
     * Escribe un Date en un Struct de oracle
     * 
     * @param stream
     * @param value
     * @return
     * @throws SQLException
     */
    public static void writeDate(SQLOutput stream, Date value) throws SQLException {
        if (value == null)
            stream.writeDate(null);
        else
            stream.writeTimestamp(new java.sql.Timestamp(value.getTime()));

    }

    /**
     * Devuelve un Date de un Struct NULL
     * 
     * @param input
     * 
     * @return
     * @throws SQLException
     */
    public static Date readDate(SQLInput input) throws SQLException {
        return input.readTimestamp();

    }

    /**
     * Devuelve un BigInteger en caso de que no sea nulo el BigDecimal
     * 
     * @param value
     * @return
     */
    public static BigInteger readBigInteger(BigDecimal value) {
        if (value != null)
            return value.toBigIntegerExact();

        return null;
    }

    /**
     * Devuelve un String de un Datum en caso de que no sea el valor
     * 
     * @param value
     * @return
     * @throws SQLException
     */
    public static String readDatnumString(Datum value) throws SQLException {
        if (value != null)
            return value.stringValue();

        return null;
    }

    /**
     * Devuelve un BigInteger en caso de que no sea nulo el valor
     * 
     * @param value
     * @return
     * @throws SQLException
     */
    public static BigInteger readDatnumBigInteger(Datum value) throws SQLException {
        if (value != null)
            return readBigInteger(value.bigDecimalValue());

        return null;
    }

    /**
     * Devuelve un BigDecimal en caso de que no sea nulo el valor
     * 
     * @param value
     * @return
     * @throws SQLException
     */
    public static BigDecimal readDatnumBigDecimal(Datum value) throws SQLException {
        if (value != null)
            return value.bigDecimalValue();

        return null;
    }

    /**
     * Devuelve un Integer en caso de que no sea nulo el valor
     * 
     * @param value
     * @return
     * @throws SQLException
     */
    public static Integer readDatnumInteger(Datum value) throws SQLException {
        if (value != null)
            return readBigInteger(value.bigDecimalValue()).intValue();

        return null;
    }

    /**
     * Devuelve un Integer en caso de que no sea nulo el valor
     * 
     * @param value
     * @return
     * @throws SQLException
     */
    public static Long readDatnumLong(Datum value) throws SQLException {
        if (value != null)
            return readBigInteger(value.bigDecimalValue()).longValue();

        return null;
    }

    /**
     * Convierte un Object[] a List<c>
     * 
     * @param array
     * @param c
     * @return
     */
    public static <T> List<T> readArrayToList(Object[] array, Class<T> c) {
        List<T> lista = new ArrayList<T>();
        if (array != null) {
            for (Object element : array) {
                lista.add(c.cast(element));
            }
        }

        return lista;
    }

 

 
}
