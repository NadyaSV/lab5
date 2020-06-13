package Shop;


public class shop {
    private String section;
    private ShopInfo info;

    public shop(String section, String service, Integer numProduct, NameProd nameProd) {
        this.section = section;
        this.info = new ShopInfo (service, numProduct, nameProd);
    }

    public String getSection() {
        return section;
    }

    public ShopInfo getService() {
        return info;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setService(String service, Integer numProduct, NameProd nameProd) {
        this.info = new ShopInfo (service, numProduct, nameProd);
    }

    @Override
    public String toString() {
        return "Product{" +
                "Отдел='" + section + '\'' +
                ", " + info;
    }

    private class ShopInfo {
        private String service;
        private Integer numProduct;
        private NameProd nameProd;

        public ShopInfo(String service, Integer numProduct, NameProd nameProd) {
            this.service = service;
            this.numProduct = numProduct;
            this.nameProd = nameProd;
        }

        public String getService() {
            return service;
        }

        public Integer getNumProduct() {
            return numProduct;
        }

        public NameProd getNameProd() {
            return nameProd;
        }

        public void setService(String service) {
            this.service = service;
        }

        public void setNumProduct(Integer numProduct) {
            this.numProduct = numProduct;
        }

        public void setNameProd(String nameProd) { //encapsulation
            this.nameProd = new NameProd (nameProd);
        }

        @Override
        public String toString() {
            return "Услуга='" + service + '\'' +
                    ", Номер упаковки товара=" + numProduct +
                    ", " + nameProd;
        }
    }

    public static class NameProd {
        private String nameProd;

        public NameProd(String nameProd) {
            this.nameProd = nameProd;
        }

        public String getNameProd() {
            return nameProd;
        }

        public void setNameProd(String nameProd) {
            this.nameProd = nameProd;
        }

        @Override
        public String toString() {
            return "Название продукта='" + nameProd + '\'' +
                    '}';
        }
    }
}
