package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Smiley-sad-light`: ImageVector
    get() {
        if (`_smiley-sad-light` != null) {
            return `_smiley-sad-light`!!
        }
        `_smiley-sad-light` = Builder(name = "Smiley-sad-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(82.0f, 108.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 82.0f, 108.0f)
                close()
                moveTo(174.0f, 108.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 108.0f)
                close()
                moveTo(173.19f, 173.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.38f, 6.0f)
                curveToRelative(-7.84f, -13.54f, -20.2f, -21.0f, -34.81f, -21.0f)
                reflectiveCurveToRelative(-27.0f, 7.46f, -34.81f, 21.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.2f, 3.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -3.0f, -0.81f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 82.81f, 173.0f)
                curveToRelative(9.92f, -17.16f, 26.39f, -27.0f, 45.19f, -27.0f)
                reflectiveCurveTo(163.27f, 155.84f, 173.19f, 173.0f)
                close()
            }
        }
        .build()
        return `_smiley-sad-light`!!
    }

private var `_smiley-sad-light`: ImageVector? = null
