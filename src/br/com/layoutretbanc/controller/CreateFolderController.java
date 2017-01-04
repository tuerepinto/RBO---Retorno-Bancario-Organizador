package br.com.layoutretbanc.controller;

import java.io.File;

import javax.swing.JOptionPane;

import br.com.layoutretbanc.builder.DateClass;
import br.com.layoutretbanc.builder.FolderCreator;

public class CreateFolderController {

	File newFolder00 = null;
	File newFolderBD = null;
	File newFolserOut = null;

	File subfolderBlue = null;
	File subfolderCom = null;
	File subfolderCpr = null;
	File subfolderEmp = null;
	File subfolderGd = null;
	File subfolderGt = null;
	File subfolderCh = null;
	File subfolderHsp = null;
	File subfolderImp = null;
	File subfolderLum = null;
	File subfolderNeg = null;
	File subfolderObg = null;
	File subfolderPnl = null;
	File subfolderQui = null;
	File subfolderSpe = null;
	File subfolderVic = null;

	File subfolderBlueBD = null;
	File subfolderComBD = null;
	File subfolderCprBD = null;
	File subfolderEmpBD = null;
	File subfolderGdBD = null;
	File subfolderGtBD = null;
	File subfolderChBD = null;
	File subfolderHspBD = null;
	File subfolderImpBD = null;
	File subfolderLumBD = null;
	File subfolderNegBD = null;
	File subfolderObgBD = null;
	File subfolderPnlBD = null;
	File subfolderQuiBD = null;
	File subfolderSpeBD = null;
	File subfolderVicBD = null;

	boolean foldeRaiz = false;
	boolean subFolder00 = false;
	boolean subFolderBD = false;

	/*
	 * Cria o diretorio raiz onde sera seprado os .ret
	 */

	public void newFolde() {
		newFolder00 = new File(FolderCreator.folder00);
		newFolderBD = new File(FolderCreator.folderBD);
		newFolserOut = new File(FolderCreator.folderOutros);

		try {
			if (newFolder00.exists() && newFolderBD.exists() && newFolserOut.exists()) {
				JOptionPane.showMessageDialog(null, "Diretorios já existentes!");
			} else {
				foldeRaiz = newFolder00.mkdirs();
				foldeRaiz = newFolderBD.mkdirs();
				foldeRaiz = newFolserOut.mkdirs();

				JOptionPane.showMessageDialog(null, "Diretorios criados com sucesso!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void subFolder() {
		File subfolderBlue = new File(FolderCreator.subFolderBlue +"\\"+ DateClass.getDate());
		File subfolderCom = new File(FolderCreator.subFolderCom);
		File subfolderCpr = new File(FolderCreator.subFolderCpr);
		File subfolderGd = new File(FolderCreator.subFolderGd);
		File subfolderGt = new File(FolderCreator.subFolderGt);
		File subfolderCh = new File(FolderCreator.subFolderCh);
		File subfolderHsp = new File(FolderCreator.subFolderHsp);
		File subfolderImp = new File(FolderCreator.subFolderImp);
		File subfolderLum = new File(FolderCreator.subFolderLum);
		File subfolderNeg = new File(FolderCreator.subFolderNeg);
		File subfolderObg = new File(FolderCreator.subFolderObg);
		File subfolderPnl = new File(FolderCreator.subFolderPnl);
		File subfolderQui = new File(FolderCreator.subFolderQui);
		File subfolderSpe = new File(FolderCreator.subFolderSpe);
		File subfolderVic = new File(FolderCreator.subFolderVic);

		File subfolderBlueBD = new File(FolderCreator.subFolderBlueBD);
		File subfolderComBD = new File(FolderCreator.subFolderComBD);
		File subfolderCprBD = new File(FolderCreator.subFolderCprBD);
		File subfolderGdBD = new File(FolderCreator.subFolderGdBD);
		File subfolderGtBD = new File(FolderCreator.subFolderGtBD);
		File subfolderChBD = new File(FolderCreator.subFolderChBD);
		File subfolderHspBD = new File(FolderCreator.subFolderHspBD);
		File subfolderImpBD = new File(FolderCreator.subFolderImpBD);
		File subfolderLumBD = new File(FolderCreator.subFolderLumBD);
		File subfolderNegBD = new File(FolderCreator.subFolderNegBD);
		File subfolderObgBD = new File(FolderCreator.subFolderObgBD);
		File subfolderPnlBD = new File(FolderCreator.subFolderPnlBD);
		File subfolderQuiBD = new File(FolderCreator.subFolderQuiBD);
		File subfolderSpeBD = new File(FolderCreator.subFolderSpeBD);
		File subfolderVicBD = new File(FolderCreator.subFolderVicBD);

		try {
			if (subfolderBlue.exists() && subfolderBlueBD.exists()) {
				JOptionPane.showMessageDialog(null, "Subdiretorios já existentes!");
			} else {
				subFolder00 = subfolderBlue.mkdirs();
				subFolder00 = subfolderCom.mkdirs();
				subFolder00 = subfolderCpr.mkdirs();
				subFolder00 = subfolderGd.mkdirs();
				subFolder00 = subfolderGt.mkdirs();
				subFolder00 = subfolderCh.mkdirs();
				subFolder00 = subfolderHsp.mkdirs();
				subFolder00 = subfolderImp.mkdirs();
				subFolder00 = subfolderLum.mkdirs();
				subFolder00 = subfolderNeg.mkdirs();
				subFolder00 = subfolderObg.mkdirs();
				subFolder00 = subfolderPnl.mkdirs();
				subFolder00 = subfolderQui.mkdirs();
				subFolder00 = subfolderSpe.mkdirs();
				subFolder00 = subfolderVic.mkdirs();

				subFolderBD = subfolderBlueBD.mkdirs();
				subFolderBD = subfolderComBD.mkdirs();
				subFolderBD = subfolderCprBD.mkdirs();
				subFolderBD = subfolderGdBD.mkdirs();
				subFolderBD = subfolderGtBD.mkdirs();
				subFolderBD = subfolderChBD.mkdirs();
				subFolderBD = subfolderHspBD.mkdirs();
				subFolderBD = subfolderImpBD.mkdirs();
				subFolderBD = subfolderLumBD.mkdirs();
				subFolderBD = subfolderNegBD.mkdirs();
				subFolderBD = subfolderObgBD.mkdirs();
				subFolderBD = subfolderPnlBD.mkdirs();
				subFolderBD = subfolderQuiBD.mkdirs();
				subFolderBD = subfolderSpeBD.mkdirs();
				subFolderBD = subfolderVicBD.mkdirs();

				JOptionPane.showMessageDialog(null, "Subdiretorios criados com sucesso!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
