package park.objects;

/*
 * Enums Plants keep the park's objects in it - trees.
 * The designer sets them Russian names.
 */
public enum Plants {
   BIRCH("Берёза"), OAK("Дуб"), PINE("Сосна"), SPRUCE("Ель"), MAPLE("Клен");
   String rusName;
   
   Plants(String rus) {
       rusName = rus;
   }
   
   public String toString() {
       return rusName;
   }
}
