package park.employees;

import park.objects.Plants;
import java.util.ArrayList;

/*
 * class Forester has one method:
 *          toFindOut(Owner ow)
 * that analyzes the tasks of the object of the class Owner
 * and further clears the task sheet, also redefined: hashCode(), toString()
 */
public class Forester {
    private String report = "Лесник отчитывается: ";
    ArrayList<Plants> modef = new ArrayList<>();    //storage of plant species on which work is carried out
    private int hash;                               //variable for hash code
    public void toFindOut(Owner ow) {
        hash = ow.task.hashCode();                  //passed before performing the body method
        if (ow.task.size() != 0) {
            Integer[] t = new Integer[ow.task.size()];
            t = ow.task.toArray(t);
            ow.task.clear();
            for (int i : t) {
                if (i == 1) {
                    modef.add(ow.mode.get(0));
                    System.out.println(report + ow.mode.get(0) + " посажено");
                    ow.mode.remove(0);
                }else if (i == 2) {
                    modef.add(ow.mode.get(0));
                    System.out.println(report + ow.mode.get(0) + " облагорожено");
                    ow.mode.remove(0);
                }else if (i == 3) {
                    modef.add(ow.mode.get(0));
                    System.out.println(report + ow.mode.get(0) + " вылечено");
                    ow.mode.remove(0);
                }else if (i == 4) {
                    modef.add(ow.mode.get(0));
                    System.out.println(report + ow.mode.get(0) + " уничтожено");
                    ow.mode.remove(0);
                }
            }
        }else {
            System.out.println(report + " Никаких заданий еще не было!");
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + hash + modef.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " --> " + report + "...";
    }
}

