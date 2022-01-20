package org.example;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.UniqueHashCode;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvParserTest {

    public static void main(String[] args) throws IOException {

        List<Employee> employeeList = new ArrayList<>();
        ICsvBeanReader csvBeanReader = new CsvBeanReader(new FileReader("C:\\untitled44\\src\\main\\java\\org\\example\\test1.csv"), CsvPreference.STANDARD_PREFERENCE);

        // указываем как будем мапить
        String[] mapping = new String[]{"id", "name", "role", "salary"};

        // получаем обработчики
        CellProcessor[] procs = getProcessors();
        Employee employee;
        // обходим весь csv файлик до конца
        while ((employee = csvBeanReader.read(Employee.class, mapping, procs)) != null) {
            employeeList.add(employee);
        }
        System.out.println(employeeList);
        csvBeanReader.close();
    }

    /**
     * Задаем обработчики ячеек
     */
    private static CellProcessor[] getProcessors() {
        return new CellProcessor[]{
                new UniqueHashCode(), // для идентификатора (id)
                new NotNull(), // name не должно быть null
                new Optional(), // указываем, что это необязательное поле role
                new NotNull() // salary также не должно быть null
        };
    }
}
