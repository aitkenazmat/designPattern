package pattern.factory.factoryMethod.report;


import pattern.factory.factoryMethod.report.factory.OutCatalogFactory;
import pattern.factory.factoryMethod.report.factory.ReportFactory;
import pattern.factory.factoryMethod.report.impl.Report;

public class Client {
    public static void main(String[] args) {
        //создаем конкретный фабрику
        //ReportFactory factory = new InCatalogReportFactory();
        ReportFactory factory = new OutCatalogFactory();
        //создаем отчет - зависит от фабрики
        Report report = factory.createReport();
        //выполняем метод
        report.submitReport();
    }
}
