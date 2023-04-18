function Book(title, author, price) {
    this.title = title;
    this.author = author;
    this.price = price;

    this.showDetails = function() {
        console.log(`Title: ${this.title}`);
        console.log(`Author: ${this.author}`);
        console.log(`Price: ${this.price}`);
    }
}

let book1 = new Book("The Little Mermaid", "Hans Christian Andersen ", 32);
book1.showDetails();

console.log();

let book2 = new Book("The Colour of Magic", "Terry Pratchett", 45); 
book2.showDetails();