package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Number-circle-zero`: ImageVector
    get() {
        if (`_number-circle-zero` != null) {
            return `_number-circle-zero`!!
        }
        `_number-circle-zero` = Builder(name = "Number-circle-zero", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(128.0f, 72.0f)
                curveToRelative(-14.23f, 0.0f, -26.0f, 6.44f, -34.0f, 18.61f)
                curveToRelative(-6.47f, 9.86f, -10.0f, 23.14f, -10.0f, 37.39f)
                reflectiveCurveToRelative(3.56f, 27.53f, 10.0f, 37.39f)
                curveToRelative(8.0f, 12.18f, 19.74f, 18.61f, 34.0f, 18.61f)
                reflectiveCurveToRelative(26.0f, -6.43f, 34.0f, -18.61f)
                curveToRelative(6.47f, -9.86f, 10.0f, -23.14f, 10.0f, -37.39f)
                reflectiveCurveToRelative(-3.56f, -27.53f, -10.0f, -37.39f)
                curveTo(154.0f, 78.44f, 142.23f, 72.0f, 128.0f, 72.0f)
                close()
                moveTo(128.0f, 168.0f)
                curveToRelative(-22.1f, 0.0f, -28.0f, -25.14f, -28.0f, -40.0f)
                reflectiveCurveToRelative(5.9f, -40.0f, 28.0f, -40.0f)
                reflectiveCurveToRelative(28.0f, 25.14f, 28.0f, 40.0f)
                reflectiveCurveTo(150.1f, 168.0f, 128.0f, 168.0f)
                close()
            }
        }
        .build()
        return `_number-circle-zero`!!
    }

private var `_number-circle-zero`: ImageVector? = null
