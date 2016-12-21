package br.com.layoutretbanc.controller;

import java.io.File;

import br.com.layoutretbanc.builder.DirectoryFolder;
import br.com.layoutretbanc.builder.ListFile;

public class OpenFolderController {
	DirectoryFolder df = new DirectoryFolder();
	ReadeFileController rfc = new ReadeFileController();
	MoveFileController mfc = new MoveFileController();
	ListFile lf = new ListFile();
	File folder = new File(dir);

	public static String dir = DirectoryFolder.directory;

	public void openFolder() {

		// folder list directory
		for (String arq : folder.list()) {
			if (arq.endsWith(".RET")) {
				DirectoryFolder.setNome(arq);
				try {
					System.out.println(headerDetalhe(dir + "\\" + arq));
					System.out.println(loteDetalhe(dir + "\\" + arq));
					System.out.println(trailerDetalhe(dir + "\\" + arq));
					System.out.println(move(dir + "\\" + arq));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	// method reader header .ret banc - class ReadeFile
	private String headerDetalhe(String dir) {
		rfc.headerDetalhe();
		return DirectoryFolder.getNome() + "\n" + ListFile.getHeader() + ListFile.getLoteHeader();
	}

	// method reader lote .ret banc - class ReadeFile
	private String loteDetalhe(String dir) {
		// rfc.loteDetalhe();
		return "";
	}

	// method reader trailer .ret banc - class ReadeFile
	private String trailerDetalhe(String dir) {
		rfc.trailerDetalhe();
		return ListFile.getTrailer();
	}
	
	private String move(String string) {
		rfc.filesMove();
		return "";
	}

}
