package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Push-pin-bold`: ImageVector
    get() {
        if (`_push-pin-bold` != null) {
            return `_push-pin-bold`!!
        }
        `_push-pin-bold` = Builder(name = "Push-pin-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.15f, 78.54f)
                lineTo(177.46f, 17.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.3f, 0.0f)
                lineTo(97.2f, 70.0f)
                curveToRelative(-12.43f, -3.33f, -36.68f, -5.72f, -61.74f, 14.5f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -1.6f, 29.73f)
                lineToRelative(45.46f, 45.47f)
                lineToRelative(-39.8f, 39.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(39.8f, -39.81f)
                lineToRelative(45.47f, 45.46f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 155.91f, 228.0f)
                curveToRelative(0.46f, 0.0f, 0.93f, 0.0f, 1.4f, -0.05f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 171.87f, 220.0f)
                curveToRelative(4.69f, -6.23f, 11.0f, -16.13f, 14.44f, -28.0f)
                reflectiveCurveToRelative(3.45f, -22.88f, 0.16f, -33.4f)
                lineToRelative(51.7f, -51.87f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 238.15f, 78.54f)
                close()
                moveTo(163.89f, 147.33f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.23f, 13.84f)
                curveToRelative(3.43f, 6.86f, 6.9f, 21.0f, -6.28f, 40.65f)
                lineTo(54.08f, 100.53f)
                curveToRelative(21.09f, -14.59f, 39.53f, -6.64f, 41.0f, -6.0f)
                arcToRelative(11.67f, 11.67f, 0.0f, false, false, 13.81f, -2.29f)
                lineToRelative(54.43f, -54.61f)
                lineToRelative(55.0f, 55.0f)
                close()
            }
        }
        .build()
        return `_push-pin-bold`!!
    }

private var `_push-pin-bold`: ImageVector? = null
