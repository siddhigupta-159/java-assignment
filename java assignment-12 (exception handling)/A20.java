// 10. Real-Time Logging
// You are writing logs to a file. Suddenly, the file system becomes read-only.
// Which exception will occur?
// How would you make sure logs are not lost (maybe backup to console or DB)?

class Testmain {

    static void writeLog(boolean canWrite, String logMessage) throws Exception {
        if (canWrite) {
            System.out.println("Log written successfully: " + logMessage);
        } else {

            throw new Exception("File system is read-only! Cannot write log.");
        }
    }

    public static void main(String[] args) {
        String logMessage = "User logged in successfully.";
        boolean fileSystemWritable = false;

        try {
            writeLog(fileSystemWritable, logMessage);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Backup log to console: " + logMessage);

        }

        System.out.println("Program continues...");
    }
}
