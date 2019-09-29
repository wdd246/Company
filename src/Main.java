public class Main {
    public static void main(String[] args) {
        Manager mrSlate = new Manager("Mr. Slate");

        Department d = new Department();
        d.setBoss(mrSlate);
        System.out.println("D's boss: "+d.getBoss());

        Department d1 = new Department();
        System.out.println("D1's boss: "+d1.getBoss());

        System.out.println("D's boss name: "+d.getBoss().orElse(new Manager("Unknown")).getName());
        System.out.println("D1's boss name: "+d1.getBoss().orElse(new Manager("Unknown")).getName());

        System.out.println("D's boss name map: "+ d.getBoss().map(Manager::getName));
        System.out.println("D1's boss name map: "+ d1.getBoss().map(Manager::getName));

    }
}
