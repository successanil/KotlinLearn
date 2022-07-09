fun main() {
 StepsPrint(3,'#')
}

fun StepsPrint(input:Int,replace:Char) : String {
 var retValue = ""
 var rChar = replace
   for(i in 1..input) {
       retValue += "${rChar} \n"
       print(retValue)
   }

 return retValue
}