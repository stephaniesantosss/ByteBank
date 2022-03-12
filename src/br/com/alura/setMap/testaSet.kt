package br.com.alura.setMap

fun testaSet(): MutableList<String> {
    //set devolve objetos distintos já a lista pode retornar valores duplicados
    val assistiramCursoDeAndroid: Set<String> = setOf("Stephanie", "Jhony", "Belinha", "Tom", "John", "Doris")
    val assistiramCursoDeKotlin: Set<String> = setOf("Stephanie", "Jhony", "Maria", "Doris")
    //val assistiramAmbos = assistiramCursoDeAndroid + assistiramCursoDeKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoDeAndroid)
    assistiramAmbos.addAll(assistiramCursoDeKotlin)
    assistiramAmbos.add("Pedro")
    //distinct() mostra apenas campos distitos
    //println(assistiramAmbos.distinct())

    //os métodos abaixo só existem no Set
    //une
    println(assistiramCursoDeAndroid union assistiramCursoDeKotlin)
    //subtrai
    println(assistiramCursoDeAndroid subtract assistiramCursoDeKotlin)
    //traz o resultado de pessoas que estão nos dois cursos somente
    println(assistiramCursoDeAndroid intersect assistiramCursoDeKotlin)
    println(assistiramAmbos)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Jhony")
    println(assistiramList)
    return assistiramList
}