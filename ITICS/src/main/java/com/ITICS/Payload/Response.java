package com.ITICS.Payload;

public class Response {
	    private String fileName;
	    private String fileDownloadUri;
	    private String fileType;
	    private long size;

	    
	    public String getFileName() {
			return fileName;
		}


		public void setFileName(String fileName) {
			this.fileName = fileName;
		}


		public String getFileDownloadUri() {
			return fileDownloadUri;
		}


		public void setFileDownloadUri(String fileDownloadUri) {
			this.fileDownloadUri = fileDownloadUri;
		}


		public String getFileType() {
			return fileType;
		}


		public void setFileType(String fileType) {
			this.fileType = fileType;
		}


		public long getSize() {
			return size;
		}


		public void setSize(long size) {
			this.size = size;
		}


		@Override
		public String toString() {
			return "Response [fileName=" + fileName + ", fileDownloadUri=" + fileDownloadUri + ", fileType=" + fileType
					+ ", size=" + size + "]";
		}


		public Response(String fileName2, String string, long filesize) {
			super();
			// TODO Auto-generated constructor stub
		}
	 
}
