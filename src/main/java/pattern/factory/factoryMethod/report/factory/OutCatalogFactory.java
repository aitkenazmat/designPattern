package pattern.factory.factoryMethod.report.factory;

import pattern.factory.factoryMethod.report.impl.OutCatalogReport;
import pattern.factory.factoryMethod.report.impl.Report;

public class OutCatalogFactory implements ReportFactory {
    public Report createReport() {
        return new OutCatalogReport();
    }
}
