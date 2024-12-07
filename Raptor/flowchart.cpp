#include <iostream>
#include <string>

using namespace std;
int main()
{
   string raptor_prompt_variable_zzyz;
   int  p;
   int si;
int  amount;
int  t;
   int r;

   raptor_prompt_variable_zzyz ="Enter principal amount";
   cout << raptor_prompt_variable_zzyz << endl;
   cin >> p;
   raptor_prompt_variable_zzyz ="Enter time";
   cout << raptor_prompt_variable_zzyz << endl;
   cin >> t;
   raptor_prompt_variable_zzyz ="Enter  Rate";
   cout << raptor_prompt_variable_zzyz << endl;
   cin >> r;
   si =p*r*t/100;
   amount =si+p;
   cout << "Amount: "+amount << endl;   cout << "SI: "+si << endl;
   return 0;
}
