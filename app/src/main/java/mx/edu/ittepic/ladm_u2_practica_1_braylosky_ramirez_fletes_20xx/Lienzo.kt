package mx.edu.ittepic.ladm_u2_practica_1_braylosky_ramirez_fletes_20xx

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p:MainActivity) : View(p) {

    var puntero = p
    var casa = FiguraGeometrica(300, 600, 280, 200)
    var pasto = FiguraGeometrica(20, 700, 700, 1200)
    var ventana = FiguraGeometrica(350, 660, 30)
    var puerta = FiguraGeometrica(420, 650, 80, 150)
    var tronco = FiguraGeometrica(100, 650, 50, 150)
    var hoja1 = FiguraGeometrica(120, 640, 50)
    var hoja2 = FiguraGeometrica(120, 590, 50)
    var nube1 = FiguraGeometrica(130, 200, 80)
    var nube2 = FiguraGeometrica(210, 220, 80)
    var nube3 = FiguraGeometrica(290, 180, 80)
    var nube4 = FiguraGeometrica(210, 120, 80)
    var sol = FiguraGeometrica(650, 40, 80)
    var copo1 = FiguraGeometrica(150, 30, 10)
    var copo2 = FiguraGeometrica(250, 40, 10)
    var copo3 = FiguraGeometrica(150, 30, 10)
    var copo4 = FiguraGeometrica(350, 30, 10)
    var copo5 = FiguraGeometrica(450, 40, 10)
    var copo6 = FiguraGeometrica(500, 30, 10)

    var copo7 = FiguraGeometrica(220, -50, 10)
    var copo8 = FiguraGeometrica(260, -10, 10)
    var copo9 = FiguraGeometrica(10, -30, 10)
    var copo10 = FiguraGeometrica(600, -30, 10)
    var copo11 = FiguraGeometrica(430, -40, 10)
    var copo12 = FiguraGeometrica(580, -30, 10)

    var copo13 = FiguraGeometrica(220, -80, 10)
    var copo14 = FiguraGeometrica(260, -100, 10)
    var copo15 = FiguraGeometrica(10, -200, 10)
    var copo16 = FiguraGeometrica(600, -150, 10)
    var copo17 = FiguraGeometrica(430, -200, 10)
    var copo18 = FiguraGeometrica(580, -90, 10)

    var punteroFiguraGeometrica: FiguraGeometrica? = null

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.BLACK)
        //Techo
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f

        canvas.drawLine(440f, 500f, 300f, 600f, paint)//left
        canvas.drawLine(440f, 500f, 580f, 600f, paint)//right

        //Pasto Rectangulo
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        pasto.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        pasto.pintar(canvas, paint)

        //Casa Rectangulo
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(199, 143, 104)
        casa.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        casa.pintar(canvas, paint)


        //Ventana
        paint.style = Paint.Style.FILL
        paint.color = Color.BLUE
        ventana.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        ventana.pintar(canvas, paint)

        //Puerta
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(199, 143, 104)
        puerta.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        puerta.pintar(canvas, paint)


        //tronco
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(199, 143, 104)
        tronco.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.rgb(199, 143, 104)
        paint.strokeWidth = 5f
        tronco.pintar(canvas, paint)

        //HOJA 1
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        hoja1.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GREEN
        paint.strokeWidth = 5f
        hoja1.pintar(canvas, paint)

        //HOJA 2
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        hoja2.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GREEN
        paint.strokeWidth = 5f
        hoja2.pintar(canvas, paint)

        //Nube1
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        nube1.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        nube1.pintar(canvas, paint)

        //Nube2
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        nube2.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        nube2.pintar(canvas, paint)

        //Nube3
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        nube3.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        nube3.pintar(canvas, paint)

        //Nube4
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        nube4.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        nube4.pintar(canvas, paint)

        //SOL
        paint.style = Paint.Style.FILL
        paint.color = Color.YELLOW
        sol.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        sol.pintar(canvas, paint)

        //COPOS
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo1.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo1.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo2.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo2.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo3.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo3.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo4.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo4.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo5.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo5.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo6.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo6.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo6.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo6.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo7.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo7.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo8.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo8.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo9.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo9.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo10.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo10.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo11.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo11.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo12.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo12.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo13.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo13.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo14.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo14.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo15.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo15.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo16.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo16.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo17.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo17.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo18.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copo18.pintar(canvas, paint)

    }



    fun nevar() {
        copo2.nieve(height)
        copo1.nieve(height)
        copo3.nieve(height)
        copo4.nieve(height)
        copo5.nieve(height)
        copo6.nieve(height)
        copo7.nieve(height)
        copo8.nieve(height)
        copo9.nieve(height)
        copo10.nieve(height)
        copo11.nieve(height)
        copo12.nieve(height)
        copo13.nieve(height)
        copo14.nieve(height)
        copo15.nieve(height)
        copo16.nieve(height)
        copo17.nieve(height)
        copo18.nieve(height)

        invalidate()
    }
}