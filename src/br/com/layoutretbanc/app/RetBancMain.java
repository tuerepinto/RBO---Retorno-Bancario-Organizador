package br.com.layoutretbanc.app;

import javax.swing.JOptionPane;

import br.com.layoutretbanc.builder.DirectoryFolder;
import br.com.layoutretbanc.controller.OpenFolderController;

public class RetBancMain {

	public static void main(String[] args) {
		OpenFolderController ofc = new OpenFolderController();
		ofc.openFolder();
		JOptionPane.showMessageDialog(null, "Programa executado com sucesso. Confira as pastas:" + DirectoryFolder.directory);

	}

}
