/**
 * A File Cabinet that can open the cabinet to
 * add or remove files, empty file, read file, or list the file titles
 * 
 * @author Jerry Fu
 * @version 2/1/2024
*/

public class fileCabinet {
    private String fileTitle;
    private String fileContent = "";
    private int fileNum;
    private boolean status;
    private int password;
    /*
     * Constructs a file
     * @param String fileTitle, String fileContent, int fileNum, boolean status, int password
     */
    public fileCabinet(String fileTitle, String fileContent, int fileNum, boolean status, int password) {
        this.fileTitle = fileTitle;
        this.fileContent = fileContent;
        this.fileNum = fileNum;
        this.status = status;
        this.password = password;
    }

    /**
     * Opens the cabinet
     * @param int eneteredPassword
     * @return status
     */
    public boolean openCabinet(int enteredPassword) {
        if(enteredPassword == password) {
            status = true;
            return status;
        }
        else {
            System.out.println("The password you have entered is false. Please try again");
            return status;
        }
    }

    /**
     * Close the cabinet
     * @return status
     */
    public boolean closeCabinet() {
        status = false;
        return status;
    }

    /**
     * Get file title
     * @return fileTitle or error message
     */
    public String getFileTitle() {
        if(status == true) {
            return fileTitle;
        }
        else {
            return "Open the cabinet first before viewing the file";
        }
    }

    /**
     * Get file contents
     * @return fileContent or error message
     */
    public String getFileContent() {
        if(status == true) {
            return fileContent;
        }
        else {
            return "Open the cabinet first before viewing the file";
        }
    }

    /**
     * Get status
     * @return status
     */
    public boolean getStatus() {
        return status;
    }

    /**
     * Get file number
     * @return fileNum or -1
     */
    public int getFileNum() {
        if(status == true) {
            return fileNum;
        }
        else {
            System.out.println("Open the cabinet first before viewing the file");
            return -1;
        }
    }
}
