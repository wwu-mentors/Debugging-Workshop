#include <stdlib.h>
#include <stdio.h>

int func1();
char* func2();
void func3();

int main(int argc, char *argv[]) {
	int a = 3;
	int *b;
	char *array[5];
	array[0] = "hello";
	array[1] = "world";
	array[2] = "why";
	array[3] = "C";
	array[4] = 0;

	for (int i = 0; i < 5; i++) {
		printf("array %d is %s\n", i, array[i]);
	}

	printf("%d\n",func1(a));
	printf("%s\n",func2(a));
	func3(b, 4);
}

int func1(int var) {
	for (int k = 1; k < 7; k++) {
		var = var + k;
		printf("var is now %d\n", var);

	}

	return 1;
}

char* func2(int num) {
	for (int j = 4; j >= 0 ; j--) {
		printf("%d divided by %d is %d\n", num, j, num / j);
	}

	return "apple";
}

void func3(int *number, int value) {
	*number = value;
}