package test;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DbBackup {
    public boolean backupDataWithOutDatabase(String dumpExePath, String host, String port, String user, String password, String database, String backupPath) {
        boolean status = false;
        try {
            Process p = null;
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = new Date();
            String filepath = "backup(without_DB)-" + database + "-" + host + "-(" + dateFormat.format(date) + ").sql";

            String batchCommand = "";
            if (password != "") {
                batchCommand = dumpExePath + " -h " + host + " --port " + port + " -u " + user + " --password=" + password + " " + database + " -r \"" + backupPath + "" + filepath + "\"";
            } else {
                batchCommand = dumpExePath + " -h " + host + " --port " + port + " -u " + user + " " + database + " -r \"" + backupPath + "" + filepath + "\"";
            }
            Runtime runtime = Runtime.getRuntime();
            p = runtime.exec(batchCommand);
            int processComplete = p.waitFor();
            if (processComplete == 0) {
                status = true;
                System.out.println("Backup created successfully for without DB " + database + " in " + host + ":" + port);
            } else {
                status = false;
                System.out.println("Could not create the backup for without DB " + database + " in " + host + ":" + port);
            }
        } catch (IOException ioe) {
            //    log.error(ioe, ioe.getCause());

        } catch (Exception e) {
            // log.error(e, e.getCause());
        }
        return status;
    }

    public static void main(String[] args) {
        new DbBackup().backupDataWithOutDatabase("C:\\Program Files\\MySQL\\MySQL Server 5.6\\bin\\mysqldump", "localhost", "3306", "root", "mysql123", "bd_hospital_ssmc", "C:\\Users\\Rakib\\Desktop\\DababaseBackup");
    }
}
