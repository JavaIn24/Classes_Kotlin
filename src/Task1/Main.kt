package Task1
 fun main (){
     val miEight = Helicopter()
     miEight.name = "Ми - 8"
     miEight.maxFlighSpeed = 250
     miEight.takeoffWeight = 13000
     miEight.flightAltitude = 6000
     println("Спроектировали вертолет с названием ${miEight.name}, \n" +
             " c максимальной скоростью полета ${miEight.maxFlighSpeed} км/ч, \n" +
             " с максимальной высотой полета  ${miEight.flightAltitude} метров \n" +
             " с максимальной взлетной массой ${miEight.takeoffWeight} кг")
 }
