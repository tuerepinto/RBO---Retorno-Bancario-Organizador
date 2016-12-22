package br.com.layoutretbanc.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import br.com.layoutretbanc.builder.DirectoryFolder;
import br.com.layoutretbanc.builder.ListFile;
import br.com.layoutretbanc.builder.MoveFile;

public class ReaderAllFileController {

	MoveFile mf = new MoveFile();

	private static String lote = "";
	private static String loteDetalhe = "";
	public static String line = "";
	private BufferedReader readerlote;

	public void readerLote() {
		try {
			readerlote = new BufferedReader(
					new FileReader(new File(OpenFolderController.dir + "\\" + DirectoryFolder.getNome())));
			while ((line = readerlote.readLine()) != null) {
				if (line.contains("")) {
					lote = new StringBuilder(lote).append(line.concat("\n")).toString();
					loteDetalhe = lote
							.substring(lote.lastIndexOf(ListFile.getLoteHeader()) + ListFile.getLoteHeader().length());
					ListFile.setLotes(loteDetalhe);

				}
			}
			readerlote.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void filesMoveBD() {
		if (ListFile.getLotes().contains(mf.lineArqOneConHoldBD)
				&& ListFile.getLotes().contains(mf.lineArqOneConHold)) {
			MoveFileBDController.moveFilesChBD();
		} else if (ListFile.getLotes().contains(mf.lineArqOneConObGBD)
				&& ListFile.getLotes().contains(mf.lineArqOneConObG)) {
			MoveFileBDController.moveFilesObGBD();
		} else if (ListFile.getLotes().contains(mf.lineArqOneConComBD)
				&& ListFile.getLotes().contains(mf.lineArqOneConCom)) {
			MoveFileBDController.moveFilesComBD();
		} else if (ListFile.getLotes().contains(mf.lineArqOneConCprBD)
				&& ListFile.getLotes().contains(mf.lineArqOneConCpr)) {
			MoveFileBDController.moveFilesCprBD();
		} else if (ListFile.getLotes().contains(mf.lineArqOneConQuiBD)
				&& ListFile.getLotes().contains(mf.lineArqOneConQui)) {
			MoveFileBDController.moveFilesQuiBD();
		} else if (ListFile.getLotes().contains(mf.lineArqOneConPnlBD)
				&& ListFile.getLotes().contains(mf.lineArqOneConPnl)) {
			MoveFileBDController.moveFilesPnlBD();
		} else if (ListFile.getLotes().contains(mf.lineArqOneConNegBD)
				&& ListFile.getLotes().contains(mf.lineArqOneConNeg)) {
			MoveFileBDController.moveFilesNegBD();
		} else if (ListFile.getLotes().contains(mf.lineArqOneConGdBD)
				&& ListFile.getLotes().contains(mf.lineArqOneConGd)) {
			MoveFileBDController.moveFilesGdBD();
		} else if (ListFile.getLotes().contains(mf.lineArqOneConGtBD)
				&& ListFile.getLotes().contains(mf.lineArqOneConGt)) {
			MoveFileBDController.moveFilesGtBD();
		} else if (ListFile.getLotes().contains(mf.lineArqOneConImpBD)
				&& ListFile.getLotes().contains(mf.lineArqOneConSpe)) {
			MoveFileBDController.moveFilesImpBD();
		} else if (ListFile.getLotes().contains(mf.lineArqOneConLumBD)
				&& ListFile.getLotes().contains(mf.lineArqOneConLum)) {
			MoveFileBDController.moveFilesLumBD();
		} else if (ListFile.getLotes().contains(mf.lineArqOneConVicBD)
				&& ListFile.getLotes().contains(mf.lineArqOneConVic)) {
			MoveFileBDController.moveFilesVicBD();
		} else if (ListFile.getLotes().contains(mf.lineArqOneConBlueBD)
				&& ListFile.getLotes().contains(mf.lineArqOneConBlue)) {
			MoveFileBDController.moveFilesBlueBD();
		} else if (ListFile.getLotes().contains(mf.lineArqOneConHspBD)
				&& ListFile.getLotes().contains(mf.lineArqOneConHsp)) {
			MoveFileBDController.moveFilesHspBD();
		} else if (ListFile.getLotes().contains(mf.lineArqOneConSpeBD)
				&& ListFile.getLotes().contains(mf.lineArqOneConSpe)) {
			MoveFileBDController.moveFilesSpeBD();
		}
	}
}
