package pattern.factorymethod;

class EcpReportFactory implements ReportFactory {
    public Report getReport() {
        return new EcpReport();
    }
}
