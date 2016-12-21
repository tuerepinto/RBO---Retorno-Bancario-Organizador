package br.com.layoutretbanc.builder;

public class ListFile {
	public static String line = "";
	public static String retorno = "";
	public static String header = "";
	public static String loteHeader = "";
	public static String lotes = "";
	public static String trailer = "";

	public static String getHeader() {
		return header;
	}

	public static void setHeader(String header) {
		ListFile.header = header;
	}

	public static String getTrailer() {
		return trailer;
	}

	public static void setTrailer(String trailer) {
		ListFile.trailer = trailer;
	}

	public static String getLine() {
		return line;
	}

	public static void setLine(String line) {
		ListFile.line = line;
	}

	public static String getRetorno() {
		return retorno;
	}

	public static void setRetorno(String retorno) {
		ListFile.retorno = retorno;
	}

	public static String getLoteHeader() {
		return loteHeader;
	}

	public static void setLoteHeader(String loteHeader) {
		ListFile.loteHeader = loteHeader;
	}

	public static String getLotes() {
		return lotes;
	}

	public static void setLotes(String lotes) {
		ListFile.lotes = lotes;
	}

}
