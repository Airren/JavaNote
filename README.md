 java Note





[多线程与并发](imooc/imooc_剑指offer/8th_Java多线程与并发/8th_java多线程与并发.md)



```

#include <iostream>
#include <vector>

using namespace std;
vector<string> split(const string& str, const string& delim);


int main()
{


//    string str = "#:a:3#b:8#c:9";
    string str;
    cin>>str;



    vector<string> AllStr = split(str,"#");
    cout<<AllStr.size()<<endl;
    for (int i=0; i<AllStr.size();i++)
    {
        vector<string> tempStr;
        tempStr = split(AllStr[i], ":");
        if(tempStr.size()>=2)
        {
            printf("%s %s\n",tempStr[0].c_str(),tempStr[1].c_str());
        }
    }
}

vector<string> split(const string& str, const string& delim) {
    vector<string> res;
    if("" == str) return res;
    //先将要切割的字符串从string类型转换为char*类型
    char * strs = new char[str.length() + 1] ; //不要忘了
    strcpy(strs, str.c_str());

    char * d = new char[delim.length() + 1];
    strcpy(d, delim.c_str());

    char *p = strtok(strs, d);
    while(p) {
        string s = p; //分割得到的字符串转换为string类型
        res.push_back(s); //存入结果数组
        p = strtok(NULL, d);
    }

    return res;
}
```