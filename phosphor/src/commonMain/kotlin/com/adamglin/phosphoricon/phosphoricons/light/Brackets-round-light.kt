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

public val LightGroup.`Brackets-round-light`: ImageVector
    get() {
        if (`_brackets-round-light` != null) {
            return `_brackets-round-light`!!
        }
        `_brackets-round-light` = Builder(name = "Brackets-round-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.52f, 64.0f)
                curveTo(44.23f, 81.46f, 38.0f, 103.0f, 38.0f, 128.0f)
                reflectiveCurveToRelative(6.23f, 46.54f, 18.52f, 64.0f)
                curveToRelative(9.17f, 13.0f, 18.49f, 18.81f, 18.59f, 18.87f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.2f, 10.27f)
                curveTo(67.16f, 220.09f, 26.0f, 194.63f, 26.0f, 128.0f)
                reflectiveCurveTo(67.16f, 35.91f, 68.91f, 34.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.2f, 10.27f)
                curveTo(75.0f, 45.19f, 65.69f, 51.0f, 56.52f, 64.0f)
                close()
                moveTo(187.09f, 34.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.2f, 10.27f)
                curveToRelative(0.1f, 0.06f, 9.42f, 5.84f, 18.59f, 18.87f)
                curveTo(211.77f, 81.46f, 218.0f, 103.0f, 218.0f, 128.0f)
                reflectiveCurveToRelative(-6.23f, 46.54f, -18.52f, 64.0f)
                curveToRelative(-9.17f, 13.0f, -18.49f, 18.81f, -18.57f, 18.85f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 6.18f, 10.29f)
                curveToRelative(1.75f, -1.0f, 42.91f, -26.51f, 42.91f, -93.14f)
                reflectiveCurveTo(188.84f, 35.91f, 187.09f, 34.86f)
                close()
            }
        }
        .build()
        return `_brackets-round-light`!!
    }

private var `_brackets-round-light`: ImageVector? = null
