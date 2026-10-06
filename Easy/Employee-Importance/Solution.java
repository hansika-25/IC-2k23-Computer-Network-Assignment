import java.util.*;

class Employee {

    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}

class Solution {

    public int getImportance(List<Employee> employees, int id) {

        // Store employees by their ID
        Map<Integer, Employee> employeeMap = new HashMap<>();

        for (Employee employee : employees) {
            employeeMap.put(employee.id, employee);
        }

        // Calculate total importance using DFS
        return dfs(employeeMap, id);
    }

    private int dfs(Map<Integer, Employee> employeeMap, int id) {

        Employee employee = employeeMap.get(id);

        int totalImportance = employee.importance;

        for (int subordinateId : employee.subordinates) {
            totalImportance += dfs(employeeMap, subordinateId);
        }

        return totalImportance;
    }
}