package com.zjh.action;

import java.io.File;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	private List<File> ppt;
	private List<String> pptFileName;
	private List<String> pptContentType;
	private List<String> desc;

	public List<File> getPpt() {
		return ppt;
	}

	public void setPpt(List<File> ppt) {
		this.ppt = ppt;
	}

	public List<String> getPptFileName() {
		return pptFileName;
	}

	public void setPptFileName(List<String> pptFileName) {
		this.pptFileName = pptFileName;
	}

	public List<String> getPptContentType() {
		return pptContentType;
	}

	public void setPptContentType(List<String> pptContentType) {
		this.pptContentType = pptContentType;
	}

	public List<String> getDesc() {
		return desc;
	}

	public void setDesc(List<String> desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "FileAction [ppt=" + ppt + ", pptFileName=" + pptFileName
				+ ", pptContentType=" + pptContentType + ", desc=" + desc + "]";
	}

	@Override
	public String execute() throws Exception {
		System.out.println(ppt);
		System.out.println(pptFileName);
		System.out.println(pptContentType);
		System.out.println(desc);

		// ServletContext servletContext = ServletActionContext
		// .getServletContext();
		// String dir = servletContext.getRealPath("/files/" + pptFileName);
		// System.out.println(dir);
		//
		// FileOutputStream out = new FileOutputStream(dir);
		// FileInputStream in = new FileInputStream(ppt);
		//
		// byte[] buffer = new byte[1024];
		// int len = 0;
		//
		// while ((len = in.read(buffer)) != -1) {
		// out.write(buffer, 0, len);
		// }
		//
		// out.close();
		// in.close();

		return INPUT;
	}
}
