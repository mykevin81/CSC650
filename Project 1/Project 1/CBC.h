//CBC.h: This class implements Cipher-Block Chaining
//Author: Kevin Hwang

#include<cstdlib>
#include"CryptoLibrary\des.h"

#define BITSIZE 64

using namespace std;

class CBC {
	
	public:
		CBC();

		//takes block and encrypt 
		void encryption();

		//takes block and decrypt
		void decryption();

		

};