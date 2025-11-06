package se.lexicon.model;

public class Soda implements Product {
        private final int id;
        private double price;
        private String productName;

        public Soda(double price, String productName) {
            this.id= Product.SEQUENCER.getAndIncrement();
            this.price = price;
            this.productName = productName;
        }


        @Override
        public String examine() {
            return "Soda{" +
                    "id=" + id +
                    ", price=" + price +
                    ", productName='" + productName + '\'' +
                    '}';
        }

        @Override
        public String use() {
            return "Soda is used";
        }

        @Override
        public int getId() {
            return 0;
        }

        @Override
        public String getProductName() {
            return "";
        }

        @Override
        public void setProductName(String productName) {
            this.productName = productName;
        }

        @Override
        public double getPrice() {
            return 0;
        }

        @Override
        public void setPrice(double price) {
            this.price = price;
        }
}
