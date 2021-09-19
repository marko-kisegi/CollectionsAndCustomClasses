package drugi;

import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PlasmanExplorer {
	List<Plasman> listaPlasmana =new ArrayList<Plasman>();
	
	public void printPobjednike() {
		listaPlasmana.stream()
		.filter( s -> s.getGodina() >= 2000 && s.getPlasman() == 1)
		.map(s -> s.getVozac())
		.sorted()
		.distinct()
		.forEach(s -> System.out.println(s));
	}
	
	public void loadPlasmani(String filepath) {
		
		BufferedReader br;
		try{
		br=new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream(filepath)),"UTF-8"));
		String strLine;
		while((strLine=br.readLine())!=null){
		String[]inputData=strLine.split(";");
		listaPlasmana.add(new Plasman(Integer.parseInt(inputData[0]),Integer.parseInt(inputData[1]),inputData[2],Integer.parseInt(inputData[3])));
		}
		}catch(Exception ex ){
		System.err.println(ex);
		}
	}
	
	public PlasmanExplorer(String s) {
		loadPlasmani(s);
	}
	
	public static void main(String[] args) {
		PlasmanExplorer xpl = new PlasmanExplorer("F1.csv");
		xpl.printPobjednike();
	}
}
