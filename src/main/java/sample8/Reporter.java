package sample8;

import java.util.Map;

import sample7.Viewer;

public class Reporter {

	private Map<DocType, Viewer> viewers;
	
	public void setViewers(Map<DocType, Viewer> viewers) {
		this.viewers = viewers;
	}
	
	public void reporting(DocType docType){
		Viewer viewer = viewers.get(docType);
		viewer.view();
	}
}
