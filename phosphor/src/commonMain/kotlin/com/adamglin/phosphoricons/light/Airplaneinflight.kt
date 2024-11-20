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

public val LightGroup.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) {
            return _airplaneInFlight!!
        }
        _airplaneInFlight = Builder(name = "AirplaneInFlight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(72.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(216.0f, 210.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 216.0f)
                close()
                moveTo(246.0f, 136.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(61.07f, 166.0f)
                arcToRelative(37.77f, 37.77f, 0.0f, false, true, -36.4f, -27.08f)
                lineTo(10.6f, 92.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 24.0f, 74.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.24f, 1.76f)
                lineTo(58.49f, 98.0f)
                horizontalLineToRelative(26.1f)
                lineTo(74.73f, 68.43f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 88.0f, 50.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.25f, 1.76f)
                lineTo(146.49f, 98.0f)
                lineTo(208.0f, 98.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 246.0f, 136.0f)
                close()
                moveTo(234.0f, 136.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -26.0f, -26.0f)
                lineTo(144.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.24f, -1.76f)
                lineTo(93.52f, 62.0f)
                lineTo(88.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.9f, 2.63f)
                lineTo(98.6f, 102.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.69f, 7.9f)
                lineTo(56.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.24f, -1.76f)
                lineTo(29.52f, 86.0f)
                lineTo(24.0f, 86.0f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, false, -1.6f, 0.81f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, false, -0.31f, 1.76f)
                lineToRelative(14.06f, 46.9f)
                arcTo(25.86f, 25.86f, 0.0f, false, false, 61.07f, 154.0f)
                lineTo(234.0f, 154.0f)
                close()
            }
        }
        .build()
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
