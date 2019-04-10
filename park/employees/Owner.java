package park.employees;

import park.objects.Plants;
import java.util.ArrayList;

/*
 * class Owner has four methods that specify the commands:
 *     landingPlant(Plants plant)
 *     artProcessingPlant(Plants plant)
 *     treatmentPlant(Plants plant)
 *     destructionPlant(Plants plant)
 * and one:
 *     confirmExecution(Forester fo)
 * for the analysis and confirmation of execution, also redefined: hashCode(), toString()
 */
public class Owner{
    final private String speak = "Владелец задает: ";
    final private String confirm = "Владелец подтверждает: ";
    ArrayList<Integer> task = new ArrayList<>();      /*collection to store the list of tasks in the form Integer*/
    ArrayList<Plants> mode = new ArrayList<>();       /*storage of plant species corresponding to the task*/
    public void landingPlant(Plants plant) {
        System.out.println(speak + "Высадить - " + plant);
        task.add(1);
        mode.add(plant);
    }

    public void artProcessingPlant(Plants plant) {
        System.out.println(speak + "Произвести художественную обработку - " + plant);
        task.add(2);
        mode.add(plant);
    }

    public void treatmentPlant(Plants plant) {
        System.out.println(speak + "Лечить - " + plant);
        task.add(3);
        mode.add(plant);
    }

    public void destructionPlant(Plants plant) {
        System.out.println(speak + "Уничтожить - " + plant);
        task.add(4);
        mode.add(plant);
    }
    public void confirmExecution(Forester fo) {
        if (fo.modef.size() == 0) {
            /* check: if the list with the object is empty,
               the tasks have not been specified or have already been approved! */
            System.out.println(confirm + " Никаких заданий еще не давал!");

        }else {
            System.out.println(confirm + " Все работы с деревьями: " + fo.modef + " проведены!");
            fo.modef.clear();
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + task.hashCode() + mode.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " --> " + speak + "..." + confirm + "...";
    }
}
