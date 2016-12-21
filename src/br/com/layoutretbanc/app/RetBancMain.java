package br.com.layoutretbanc.app;

import javax.swing.JOptionPane;

import br.com.layoutretbanc.builder.DirectoryFolder;
import br.com.layoutretbanc.controller.CreateFolderController;
import br.com.layoutretbanc.controller.OpenFolderController;

public class RetBancMain {

	public static void main(String[] args) {
		CreateFolderController cfc = new CreateFolderController();
		OpenFolderController ofc = new OpenFolderController();

		cfc.newFolde();
		cfc.subFolder();
		ofc.openFolder();
		JOptionPane.showMessageDialog(null, "Programa executado com sucesso. Confira as pastas:" + DirectoryFolder.directory);

	}

}
