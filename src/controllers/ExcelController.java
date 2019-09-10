/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.io.File;

import java.io.IOException;
import java.util.ArrayList;

import jxl.Cell;

import jxl.NumberCell;

import jxl.Sheet;

import jxl.Workbook;

import jxl.read.biff.BiffException;

import javax.swing.JOptionPane;
/**
 *
 * @author gabri
 */
public class ExcelController {
    
private Workbook planilha; // objeto que receberá um instancia da planilha estudada
 
private Sheet aba; // objeto que será a aba

private File arquivo; // arquivo .xls que será lido
    
    ArrayList< ArrayList > matrizGeral = new ArrayList< ArrayList>();

    
    
/*for ( int i = 0; i < linhas; i++ ) {
// seu Objeto é a classe que representa o objeto q vc ta armazenando no ARrayList
matriz.add( new ArrayList< SeuObjeto >() );
}*/

    public Workbook getPlanilha() {
        return planilha;
    }

    public void setPlanilha(Workbook planilha) {
        this.planilha = planilha;
    }

    public Sheet getAba() {
        return aba;
    }

    public void setAba(Sheet aba) {
        this.aba = aba;
    }

    public File getArquivo() {
        return arquivo;
    }

    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }

    public ArrayList<ArrayList> getMatrizGeral() {
        return matrizGeral;
    }

    public void setMatrizGeral(ArrayList<ArrayList> matrizGeral) {
        this.matrizGeral = matrizGeral;
    }
    
  
    
    
    
}
