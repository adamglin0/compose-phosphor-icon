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

public val LightGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(181.92f, 153.0f)
                arcTo(55.58f, 55.58f, 0.0f, false, true, 137.0f, 197.92f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.0f, 0.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.0f, -11.92f)
                curveToRelative(17.38f, -2.92f, 32.13f, -17.68f, 35.08f, -35.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.84f, 2.0f)
                close()
                moveTo(214.0f, 144.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, true, -172.0f, 0.0f)
                curveToRelative(0.0f, -27.47f, 10.85f, -55.61f, 32.25f, -83.64f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.0f, -0.67f)
                lineToRelative(26.34f, 25.56f)
                lineToRelative(23.09f, -63.31f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.47f, -2.56f)
                curveTo(163.72f, 37.33f, 214.0f, 85.4f, 214.0f, 144.0f)
                close()
                moveTo(202.0f, 144.0f)
                curveToRelative(0.0f, -48.4f, -38.65f, -89.84f, -61.07f, -109.8f)
                lineTo(117.64f, 98.06f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.82f, 2.25f)
                lineToRelative(-28.0f, -27.22f)
                curveTo(62.67f, 97.13f, 54.0f, 121.0f, 54.0f, 144.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, 148.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
