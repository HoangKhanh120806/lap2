    package com.example.hi

    import androidx.compose.foundation.layout.Arrangement
    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.layout.Row
    import androidx.compose.foundation.layout.Spacer
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.fillMaxWidth
    import androidx.compose.foundation.layout.height
    import androidx.compose.foundation.layout.padding
    import androidx.compose.foundation.text.KeyboardOptions
    import androidx.compose.material3.Button
    import androidx.compose.material3.OutlinedTextField
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.runtime.getValue
    import androidx.compose.runtime.mutableStateOf
    import androidx.compose.runtime.remember
    import androidx.compose.runtime.setValue
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.text.input.KeyboardType
    import androidx.compose.ui.unit.dp


    @Composable
    fun lap1(){
        var num1 by remember {mutableStateOf("")}
        var num2 by remember {mutableStateOf("")}
        var result by remember {mutableStateOf("")}

        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ){

            Spacer(modifier = Modifier.height(200.dp))

            OutlinedTextField(
                value = num1,
                onValueChange = {num1 = it},
                label = { Text( "Số thứ nhất")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = num2,
                onValueChange = {num2 = it},
                label = {Text("Số thứ 2")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = result,
                onValueChange = {},
                label = {Text("Kết quả")},
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                CalcButton("+"){
                    result = calculate(num1, num2, "+")
                }
                CalcButton("-"){
                    result = calculate(num1, num2, "-")
                }
                CalcButton("*"){
                    result = calculate(num1, num2, "*")
                }
                CalcButton("/"){
                    result = calculate(num1, num2, "/")
                }
                CalcButton("Del"){
                    num1 = ""
                    num2 = ""
                    result = ""
                }
            }
        }
    }

    @Composable
    fun CalcButton(text: String, onClick: () -> Unit) {
        Button(
            onClick = onClick,
            modifier = Modifier.padding(4.dp)
        ){Text(text)}
    }

    fun calculate(a: String, b: String, op: String): String{
        val numA = a.toDoubleOrNull()
        val numB = b.toDoubleOrNull()

        if (numA == null || numB == null) return "Lỗi"

        return when (op){
            "+" -> (numA + numB).toString()
            "-" -> (numA - numB).toString()
            "*" -> (numA * numB).toString()
            "/" -> if (numB != 0.0 ) (numA / numB).toString() else "Lỗi chia 0"
            else -> ""
        }
    }

