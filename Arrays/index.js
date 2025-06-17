class MyArray{

	constructor() {
		this.length = 0;
		this.data = {};
	}

	push(item) {
		this.data[this.length] = item;
		this.length++;
	}

}

const myArray = new MyArray();
myArray.push("Apple");
console.log(myArray);
