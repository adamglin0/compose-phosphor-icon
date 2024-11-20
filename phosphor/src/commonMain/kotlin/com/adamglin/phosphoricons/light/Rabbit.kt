package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Rabbit: ImageVector
    get() {
        if (_rabbit != null) {
            return _rabbit!!
        }
        _rabbit = Builder(name = "Rabbit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(110.0f, 164.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 110.0f, 164.0f)
                close()
                moveTo(156.0f, 154.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 156.0f, 154.0f)
                close()
                moveTo(214.0f, 188.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, -86.0f, 34.7f)
                arcToRelative(50.0f, 50.0f, 0.0f, true, true, -69.39f, -71.91f)
                arcTo(70.0f, 70.0f, 0.0f, false, true, 65.23f, 129.0f)
                arcToRelative(235.12f, 235.12f, 0.0f, false, true, -20.56f, -59.3f)
                curveToRelative(-3.0f, -15.62f, -5.0f, -36.91f, 2.69f, -49.62f)
                arcTo(19.84f, 19.84f, 0.0f, false, true, 65.07f, 10.0f)
                curveTo(89.91f, 10.0f, 105.23f, 52.92f, 114.0f, 91.43f)
                arcToRelative(69.44f, 69.44f, 0.0f, false, true, 28.0f, 0.0f)
                curveTo(150.77f, 52.92f, 166.09f, 10.0f, 190.93f, 10.0f)
                arcToRelative(19.84f, 19.84f, 0.0f, false, true, 17.71f, 10.11f)
                curveToRelative(7.68f, 12.71f, 5.7f, 34.0f, 2.69f, 49.62f)
                arcTo(235.12f, 235.12f, 0.0f, false, true, 190.77f, 129.0f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, true, 6.62f, 21.76f)
                arcTo(49.79f, 49.79f, 0.0f, false, true, 214.0f, 188.0f)
                close()
                moveTo(153.56f, 94.83f)
                arcToRelative(70.05f, 70.05f, 0.0f, false, true, 21.64f, 13.48f)
                arcToRelative(71.17f, 71.17f, 0.0f, false, true, 8.05f, 8.72f)
                curveTo(199.87f, 81.2f, 207.0f, 40.54f, 198.37f, 26.32f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 190.93f, 22.0f)
                curveTo(178.1f, 22.0f, 163.61f, 50.4f, 153.56f, 94.83f)
                close()
                moveTo(72.75f, 117.0f)
                arcToRelative(71.17f, 71.17f, 0.0f, false, true, 8.0f, -8.72f)
                arcToRelative(70.05f, 70.05f, 0.0f, false, true, 21.64f, -13.48f)
                curveTo(92.39f, 50.4f, 77.9f, 22.0f, 65.07f, 22.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.44f, 4.32f)
                curveTo(49.0f, 40.54f, 56.13f, 81.2f, 72.75f, 117.0f)
                close()
                moveTo(202.0f, 188.0f)
                arcToRelative(37.87f, 37.87f, 0.0f, false, false, -14.07f, -29.52f)
                arcToRelative(6.05f, 6.05f, 0.0f, false, true, -2.2f, -4.09f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, -115.44f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.19f, 4.08f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 51.5f, 55.64f)
                lineToRelative(-11.42f, -9.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 7.67f, -9.22f)
                lineTo(128.0f, 205.5f)
                lineToRelative(12.16f, -10.11f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 7.67f, 9.22f)
                lineToRelative(-11.42f, 9.5f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 202.0f, 188.0f)
                close()
            }
        }
        .build()
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
