package pattern.factory.factoryMethod.report.factory;


import pattern.factory.factoryMethod.report.impl.InCatalogReport;
import pattern.factory.factoryMethod.report.impl.Report;

public class InCatalogReportFactory implements ReportFactory {
    public Report createReport() {
        return new InCatalogReport();
    }
}
