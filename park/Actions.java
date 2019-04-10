package park;

import park.employees.Forester;
import park.employees.Owner;

import static park.objects.Plants.*;

/*
 *class Actions for checking actions between entities
 */
public class Actions {
    public static void main(String[]args) {
        Owner ow = new Owner();
        Forester fo = new Forester();
        System.out.println(ow);
        System.out.println(fo);

        ow.destructionPlant(BIRCH);
        ow.landingPlant(MAPLE);
        ow.artProcessingPlant(OAK);
        ow.treatmentPlant(PINE);
        fo.toFindOut(ow);

        ow.treatmentPlant(SPRUCE);
        fo.toFindOut(ow);
        ow.confirmExecution(fo);

        fo.toFindOut(ow);
    }
}
