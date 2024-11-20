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

public val LightGroup.Egg: ImageVector
    get() {
        if (_egg != null) {
            return _egg!!
        }
        _egg = Builder(name = "Egg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.0f, 60.67f)
                curveTo(167.18f, 34.0f, 145.87f, 18.0f, 128.0f, 18.0f)
                reflectiveCurveTo(88.82f, 34.0f, 71.0f, 60.67f)
                curveTo(52.57f, 88.32f, 42.0f, 121.61f, 42.0f, 152.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                curveTo(214.0f, 121.61f, 203.43f, 88.32f, 185.0f, 60.67f)
                close()
                moveTo(128.0f, 226.0f)
                arcToRelative(74.09f, 74.09f, 0.0f, false, true, -74.0f, -74.0f)
                curveToRelative(0.0f, -28.08f, 9.84f, -58.94f, 27.0f, -84.67f)
                curveTo(96.11f, 44.65f, 114.56f, 30.0f, 128.0f, 30.0f)
                reflectiveCurveToRelative(31.89f, 14.65f, 47.0f, 37.33f)
                curveToRelative(17.15f, 25.73f, 27.0f, 56.59f, 27.0f, 84.67f)
                arcTo(74.09f, 74.09f, 0.0f, false, true, 128.0f, 226.0f)
                close()
            }
        }
        .build()
        return _egg!!
    }

private var _egg: ImageVector? = null
