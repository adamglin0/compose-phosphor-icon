package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Number-circle-zero-fill`: ImageVector
    get() {
        if (`_number-circle-zero-fill` != null) {
            return `_number-circle-zero-fill`!!
        }
        `_number-circle-zero-fill` = Builder(name = "Number-circle-zero-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 128.0f)
                curveToRelative(0.0f, 14.86f, -5.9f, 40.0f, -28.0f, 40.0f)
                reflectiveCurveToRelative(-28.0f, -25.14f, -28.0f, -40.0f)
                reflectiveCurveToRelative(5.9f, -40.0f, 28.0f, -40.0f)
                reflectiveCurveTo(156.0f, 113.14f, 156.0f, 128.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(172.0f, 128.0f)
                curveToRelative(0.0f, -14.25f, -3.56f, -27.53f, -10.0f, -37.39f)
                curveTo(154.0f, 78.44f, 142.23f, 72.0f, 128.0f, 72.0f)
                reflectiveCurveToRelative(-26.0f, 6.44f, -34.0f, 18.61f)
                curveToRelative(-6.47f, 9.86f, -10.0f, 23.14f, -10.0f, 37.39f)
                reflectiveCurveToRelative(3.56f, 27.53f, 10.0f, 37.39f)
                curveToRelative(8.0f, 12.18f, 19.74f, 18.61f, 34.0f, 18.61f)
                reflectiveCurveToRelative(26.0f, -6.43f, 34.0f, -18.61f)
                curveTo(168.44f, 155.53f, 172.0f, 142.25f, 172.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_number-circle-zero-fill`!!
    }

private var `_number-circle-zero-fill`: ImageVector? = null
