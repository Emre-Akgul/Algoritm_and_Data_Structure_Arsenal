#include "iostream"
using namespace std;
class InsertionSort
{
    private:
        /* data */
    public:
        InsertionSort();
        ~InsertionSort();
        static void decreasingSort(int* arr,int len);
        static void increasingSort(int* arr,int len);

};

InsertionSort::InsertionSort()
{
}

InsertionSort::~InsertionSort()
{
}

void InsertionSort::decreasingSort(int* arr,int len){
    int key;
    for(int i = 1; i < len; i++){
        key = arr[i];
        
        int rightToLeft = i - 1;

        while(rightToLeft > -1 && arr[rightToLeft] > key){
            arr[rightToLeft + 1] = arr[rightToLeft];
            rightToLeft--;
        }

        arr[rightToLeft + 1] = key;
    }
}

void InsertionSort::increasingSort(int* arr,int len){
    int key;
    for(int i = 1; i < len; i++){
        key = arr[i];
        
        int rightToLeft = i - 1;

        while(rightToLeft > 0 && arr[rightToLeft] < key){
            arr[rightToLeft + 1] = arr[rightToLeft];
            rightToLeft--;
        }

        arr[rightToLeft] = key;
    }
}

/*
static void printArr(int* arr,int len){
    for(int i = 0; i < len; i++){
        cout << arr[i] << "-" ;    
    }
}


int main()
{
    int arr[] = {13,3,2,14,4,5,11,1,6,9,7,8,15,12,10};

    cout << "Initial" << endl;
    printArr(arr,sizeof(arr) / sizeof(int));

    InsertionSort::decreasingSort(arr,sizeof(arr) / sizeof(int));cout<<endl;

    cout << "Decreasingly Sorted" << endl;
    printArr(arr,sizeof(arr)/sizeof(int));

    InsertionSort::decreasingSort(arr,sizeof(arr) / sizeof(int));cout<<endl;

    cout << "Increasingly Sorted" << endl;
    printArr(arr,sizeof(arr)/sizeof(int));

    return 0;
}

*/