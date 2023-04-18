class Product {
    constructor(id, name, price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class ProductOnSale extends Product {
    constructor(id, name, price, discount) {
        super(id, name, price);
        this.discount = discount;
    }

    calculateDiscount() {
        this.discount = this.price * this.discount / 100;
    }

    report() {
        console.log(`Product id:       ${this.id}`);
        console.log(`Product name:     ${this.name}`);
        console.log(`Product price:    ${this.price}`);
        console.log(`Product discount: ${this.discount}`);
    }
}

let discountedPhone = new ProductOnSale(142, "PhoneX", 620, 15);
discountedPhone.calculateDiscount();
discountedPhone.report();