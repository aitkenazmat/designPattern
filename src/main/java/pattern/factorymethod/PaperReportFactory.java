package pattern.factorymethod;


public class PaperReportFactory implements ReportFactory {
    public Report getReport() {
        return new PaperReport();
    }
}
