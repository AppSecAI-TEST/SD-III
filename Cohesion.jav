//Low Cohesion
class BudgetReport {
    void connectToRDBMS(){ }
    void generateBudgetReport() { }
    void saveToFile() { }
    void print() { }
}
//High Cohesion
class BudgetReport {
    Options getReportingOptions() { }
    void generateBudgetReport(Options o) { }
}
  class ConnectToRDBMS {
    DBconnection getRDBMS() { }
}
  class PrintStuff {
    PrintOptions getPrintOptions() { }
}
  class FileSaver {
    SaveOptions getFileSaveOptions() { }
}
