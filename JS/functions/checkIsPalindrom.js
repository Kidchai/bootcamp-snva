console.log(`232 is palindrom? ${checkIsPalindrom(232)}`);
console.log(`0 is palindrom? ${checkIsPalindrom(0)}`);
console.log(`100 is palindrom? ${checkIsPalindrom(100)}`);
console.log(`-61 is palindrom? ${checkIsPalindrom(-61)}`);
console.log(`-66 is palindrom? ${checkIsPalindrom(-66)}`);

function checkIsPalindrom(num) {
    if (num < 0) {
        return false;
    } else if (num < 10) {
        return true;
    }
    const array = [];
    while (num > 0) {
        array.push(num % 10);
        num = Math.floor(num / 10);
    }

    const length = array.length;
    for (let i = 0; i < Math.floor(length / 2); i++) {
        if (array[i] !== array[length - 1 - i]) {
            return false;
        }
    }
    return true;
}