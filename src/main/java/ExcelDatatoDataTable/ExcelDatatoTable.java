package ExcelDatatoDataTable;
 

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import cucumber.api.DataTable;
import cucumber.api.Transformer;
import cucumber.runtime.ParameterInfo;
import cucumber.runtime.table.TableConverter;
import cucumber.runtime.xstream.LocalizedXStreams;
import edu.emory.mathcs.backport.java.util.Arrays;
import gherkin.formatter.model.Comment;
import gherkin.formatter.model.DataTableRow;

public class ExcelDatatoTable extends Transformer<DataTable>  {

	@Override
	public DataTable transform(String excelpath) {
		List<List<String>> excelData = new LinkedList();
		ExcelApachePOI reader = new ExcelApachePOI();
		try {
			
			excelData = reader.getsheetData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		List<DataTableRow> dataTableRows = new LinkedList();
		int line =1;
		//Object excelData;
		for(List<String> list : excelData){
			Comment commnet = new Comment("", line);
			DataTableRow tableRow = new DataTableRow((List<Comment>) commnet, list, line++);
			dataTableRows.add(tableRow);
		}
		ParameterInfo parameterInfo = new ParameterInfo(null, null, null, null);
	    TableConverter tableConverter = new TableConverter(new LocalizedXStreams(Thread.currentThread().getContextClassLoader()).get(Locale.getDefault()), parameterInfo);
		
		DataTable table = new DataTable(dataTableRows, tableConverter);
		return table;
		//return null;
	}

		
}
