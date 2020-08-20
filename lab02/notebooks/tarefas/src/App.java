import pt.c08componentes.s20catalog.s10ds.*;
import pt.c08componentes.s20catalog.s20console.*;

IDataSet dataset = new DataSetComponent();
dataset.setDataSource("../../../db/zombie/zombie-health-spreadsheet.csv");

IConsole console = new ConsoleComponent();
console.connect(dataset);

console.update();