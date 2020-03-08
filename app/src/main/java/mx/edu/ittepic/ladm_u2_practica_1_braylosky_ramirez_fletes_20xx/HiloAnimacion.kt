package mx.edu.ittepic.ladm_u2_practica_1_braylosky_ramirez_fletes_20xx

class HiloAnimacion (p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()

        while(true){
            sleep(100)
            puntero.runOnUiThread {
                puntero.lienzo!!.nevar()
            }
        }
    }
}