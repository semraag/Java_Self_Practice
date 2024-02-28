package day14_practice_tasks.device;

public abstract class   Device {
   private final  String   brand,model,size;
   private  double price;
   private String color;
   private boolean hasBattery;
   private boolean hasPowerButton;

   public Device(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
      this.brand = brand;
      if (brand==null || brand.isEmpty()) {
         throw new RuntimeException("Brand can not be empty or null"); }
         this.model = model;
      if (model == null || model.isEmpty()) {
            throw new RuntimeException("Model can not be empty or null");}
            this.size = size;
      if (size == null || size.isEmpty()) {
          throw new RuntimeException("make can not be empty or null");}
          this.price = price;
          this.color = color;
          this.hasBattery = hasBattery;
          this.hasPowerButton = hasPowerButton;
   }

   public String getBrand() {   return brand;     }

   public String getModel() {   return model;   }
   public String getSize() {   return size;  }

   public double getPrice() {   return price;  }

   public String getColor() {   return color;  }
   public boolean isHasBattery() {  return hasBattery;  }
   public boolean isHasPowerButton() {  return hasPowerButton;  }

   public void setPrice (double price){
               if (price < 0) {
                  throw new RuntimeException("Price can not be negative");
               }
               this.price = price;
            }

            public void setColor (String color){
               if (color == null || color.isEmpty()) {
                  throw new RuntimeException("Color can not be empty or null ");
               }
               this.color = color;
            }
            public void setHasBattery ( boolean hasBattery){
               this.hasBattery = hasBattery;
            }
            public void setHasPowerButton ( boolean hasPowerButton){
               this.hasPowerButton = hasPowerButton;
            }
            public abstract void  turnOn();
            public abstract void  turnOff();

   @Override
   public String toString() {
      return getClass().getSimpleName() + "{" +
              "brand='" + brand + '\'' +
              ", model='" + model + '\'' +
              ", size='" + size + '\'' +
              ", price=" + "$" +price +
              ", color='" + color + '\'' +
              ", hasBattery=" + hasBattery +
              ", hasPowerButton=" + hasPowerButton +
              '}';
   }
}

