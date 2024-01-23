package com.joincoded.accountstatements.model


data class DataTransaction(
    //val name : String,
    val transactionType: String,
    val amount: Double,
    val date: String,
    val currency: String,
    val balence: Double,


)
//
//@Composable
//fun AccountStatmentCard(accountStatement: Data) {
//
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp),
//
//        ) {
//        Column(
//            modifier = Modifier
//                .padding(16.dp)
//        ) {
//
//            Text(
//                text = accountStatement.transactionType,
//                fontWeight = FontWeight.Bold,
//                fontSize = 18.sp,
//
//            )
//
//            Spacer(modifier = Modifier.height(8.dp))
//
//
//            Text(
//                text = "${accountStatement.amount} USD",
//                fontSize = 16.sp
//            )
//
//            Spacer(modifier = Modifier.height(4.dp))
//
//
//            Text(
//                text = accountStatement.date,
//                fontSize = 14.sp,
//                color = Color.Gray
//            )
//
//            Spacer(modifier = Modifier.height(4.dp))
//
//
//            Text(
//                text = accountStatement.currency,
//                fontSize = 14.sp
//            )
//
//            Spacer(modifier = Modifier.height(8.dp))
//
//
//            Text(
//                text = "Balance: ${accountStatement.balence} KWD",
//                fontSize = 16.sp,
//                fontWeight = FontWeight.Bold
//            )
//        }
//
//    }
//}
//
//@Composable
//fun AccountStatmentList(accountStatement: List<Data>) {
//    LazyColumn {
//        items(accountStatement) { statement ->
//            AccountStatmentCard(accountStatement = statement)
//        }
//    }
//}
//@Composable
//fun AccountStatementsListPage() {
//    val dummyData = generateDummyData()
//    AccountStatmentList(accountStatement= dummyData)
//}
//fun generateDummyData(): List<Data> {
//    return listOf(
//        Data("Deposit", 100.0, "2024-01-23", "KWD", 1500.0),
//        Data("Withdraw", 50.0, "2024-01-22", "KWD", 1450.0),
//        Data("Withdraw", 50.0, "2024-01-22", "KWD", 14.0),
//    )
//}




// color = if (accountStatement.transactionType == "Deposit") Color.Green else Color.Red