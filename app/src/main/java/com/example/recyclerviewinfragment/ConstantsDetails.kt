package com.example.recyclerviewinfragment
import com.example.gfg.Employee


object ConstantsDetails {
    fun getEmployeeData(): ArrayList<Employee> {
        val employeeList = ArrayList<Employee>()

        val emp1 = Employee("Chennai ", "9874653211",)
        employeeList.add(emp1)
        val emp2 = Employee("Bangalore", "6369096229",)
        employeeList.add(emp2)
        val emp3 = Employee("Coimbatore", "9965422529",)
        employeeList.add(emp3)
        val emp4 = Employee("Erode ", "9578950624",)
        employeeList.add(emp4)
        val emp5 = Employee("Bangkok", "8897653322",)
        employeeList.add(emp5)
        val emp6 = Employee("Malaysia", "9980764322",)
        employeeList.add(emp6)
        val emp7 = Employee("Turkey", "7644235199",)
        employeeList.add(emp7)
        val emp8 = Employee("Istanbul", "9087654321",)
        employeeList.add(emp8)
        val emp9 = Employee("Coimbatore", "7654321902",)
        employeeList.add(emp9)
        val emp10 = Employee("Bangalore", "9087564312",)
        employeeList.add(emp10)

        return employeeList
    }

    private fun Employee(Residence: String, Number: String): Employee {


        return TODO("Provide the return value")
    }
}

