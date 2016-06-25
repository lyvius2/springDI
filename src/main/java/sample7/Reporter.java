package sample7;

import java.util.Set;

public class Reporter {

	//private PdfViewer pdf;
	//private ExcelViewer excel;
	
	Set<Viewer> viewers;
	
	public void setViewers(Set<Viewer> viewers) {
		this.viewers = viewers;
	}

	public void reporting(){
		for(Viewer v : viewers){
			v.view();
		}
	}
}
