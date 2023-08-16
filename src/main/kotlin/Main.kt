fun main(args: Array<String>) {

val Amount  = 1_500 //сумма перевода

val CommissionTransfer = 0.0075 //комисия за перевод

val minCommissionTransfer =35 // мин комисия
    //result комисия от перевода 0.75%
    var result = (Amount * CommissionTransfer).toInt()

//CommissionTotal итоговая комисия за перевод ( минимальная  или комисия от перевода)

val CommissionTotal  = if (result <= minCommissionTransfer)
     minCommissionTransfer else  result


println(" Комисия  0.75% от перевода : $result")
println("Tottal Commission: $CommissionTotal")

}