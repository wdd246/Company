import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private int id;
    //public Optional<Employee> findEmployeeById(int id);

    public Employee(int id){
        this.id=id;
    }

//    public List<Employee> findEmployeesByIds(List<Integer> ids){
//        return ids.stream()
//                .map(this::findEmployeesByIds)
//                .flatMap(optional->
//                        optional.map(Stream::of)
//                                .orElseGet(Stream::empty))
//                .collect(Collectors.toList());

//        return ids.stream()
//                .map(this::findEmployeesByIds)
//                .filter(Optional::isPresent)
//                .map(Optional::get)
//                .collect(Collectors.toList());
//    }
}
