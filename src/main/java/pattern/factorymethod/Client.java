package pattern.factorymethod;

public class Client {
    public static void main(String[] args) {
        ReportFactory reportFactory = getReportFactoryByName("ddd");
        Report report = reportFactory.getReport();
        report.submit();
    }

    public static ReportFactory getReportFactoryByName(String name) {

        ReportFactory reportFactory = null;
        if (name.equalsIgnoreCase("eccp")) {
            reportFactory = new  EcpReportFactory();
        } else {
            reportFactory =  new PaperReportFactory();
        }
        return reportFactory;
    }
}
