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

public val FillGroup.`Thermometer-hot-fill`: ImageVector
    get() {
        if (`_thermometer-hot-fill` != null) {
            return `_thermometer-hot-fill`!!
        }
        `_thermometer-hot-fill` = Builder(name = "Thermometer-hot-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 146.08f)
                lineTo(152.0f, 40.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                lineTo(88.0f, 146.08f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(136.0f, 56.0f)
                lineTo(104.0f, 56.0f)
                lineTo(104.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
                moveTo(177.3f, 80.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.33f, -11.07f)
                curveToRelative(15.0f, -9.79f, 26.87f, -4.75f, 35.51f, -1.06f)
                curveTo(223.0f, 72.0f, 227.76f, 74.0f, 235.63f, 68.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.74f, 13.41f)
                curveTo(237.88f, 86.53f, 232.0f, 88.0f, 226.69f, 88.0f)
                curveToRelative(-7.0f, 0.0f, -12.92f, -2.54f, -17.83f, -4.63f)
                curveTo(201.0f, 80.0f, 196.24f, 78.0f, 188.37f, 83.11f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 177.3f, 80.77f)
                close()
                moveTo(246.7f, 103.23f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.33f, 11.07f)
                curveTo(237.88f, 118.53f, 232.0f, 120.0f, 226.69f, 120.0f)
                curveToRelative(-7.0f, 0.0f, -12.92f, -2.54f, -17.83f, -4.63f)
                curveToRelative(-7.87f, -3.36f, -12.62f, -5.38f, -20.49f, -0.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.74f, -13.41f)
                curveToRelative(15.0f, -9.79f, 26.87f, -4.75f, 35.51f, -1.06f)
                curveToRelative(7.87f, 3.36f, 12.62f, 5.39f, 20.49f, 0.25f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 246.7f, 103.23f)
                close()
            }
        }
        .build()
        return `_thermometer-hot-fill`!!
    }

private var `_thermometer-hot-fill`: ImageVector? = null
