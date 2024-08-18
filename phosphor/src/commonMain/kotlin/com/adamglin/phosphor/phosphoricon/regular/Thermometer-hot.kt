package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Thermometer-hot`: ImageVector
    get() {
        if (`_thermometer-hot` != null) {
            return `_thermometer-hot`!!
        }
        `_thermometer-hot` = Builder(name = "Thermometer-hot", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 153.0f)
                lineTo(128.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(112.0f, 153.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 16.0f, 0.0f)
                close()
                moveTo(120.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 120.0f, 200.0f)
                close()
                moveTo(160.0f, 134.0f)
                lineTo(160.0f, 48.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f)
                verticalLineToRelative(86.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 80.0f, 0.0f)
                close()
                moveTo(120.0f, 232.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -27.42f, -87.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 138.0f)
                lineTo(96.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.42f, 6.56f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 120.0f, 232.0f)
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
        return `_thermometer-hot`!!
    }

private var `_thermometer-hot`: ImageVector? = null
