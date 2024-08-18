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

public val RegularGroup.Parachute: ImageVector
    get() {
        if (_parachute != null) {
            return _parachute!!
        }
        _parachute = Builder(name = "Parachute", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 120.0f)
                arcTo(104.12f, 104.12f, 0.0f, false, false, 128.0f, 16.0f)
                horizontalLineToRelative(0.0f)
                arcTo(104.12f, 104.12f, 0.0f, false, false, 24.0f, 120.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, false, 3.05f, 6.27f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, false, 0.15f, 0.13f)
                lineTo(120.0f, 196.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(136.0f, 196.0f)
                lineToRelative(92.8f, -69.6f)
                horizontalLineToRelative(0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 120.0f)
                close()
                moveTo(215.64f, 112.0f)
                lineTo(175.83f, 112.0f)
                curveToRelative(-1.54f, -37.95f, -13.91f, -62.43f, -25.11f, -77.0f)
                arcTo(88.2f, 88.2f, 0.0f, false, true, 215.64f, 112.0f)
                close()
                moveTo(128.0f, 34.0f)
                arcToRelative(76.89f, 76.89f, 0.0f, false, true, 13.88f, 16.22f)
                curveTo(149.49f, 62.0f, 158.45f, 81.87f, 159.82f, 112.0f)
                lineTo(96.18f, 112.0f)
                curveToRelative(1.37f, -30.13f, 10.33f, -50.0f, 17.94f, -61.74f)
                arcTo(76.92f, 76.92f, 0.0f, false, true, 128.0f, 34.0f)
                close()
                moveTo(154.4f, 128.0f)
                lineTo(128.0f, 175.53f)
                lineTo(101.6f, 128.0f)
                close()
                moveTo(83.29f, 128.0f)
                lineTo(102.79f, 163.09f)
                lineTo(56.0f, 128.0f)
                close()
                moveTo(172.71f, 128.0f)
                lineTo(200.0f, 128.0f)
                lineToRelative(-46.79f, 35.09f)
                close()
                moveTo(105.28f, 35.0f)
                curveToRelative(-11.2f, 14.57f, -23.57f, 39.05f, -25.11f, 77.0f)
                lineTo(40.36f, 112.0f)
                arcTo(88.2f, 88.2f, 0.0f, false, true, 105.28f, 35.0f)
                close()
            }
        }
        .build()
        return _parachute!!
    }

private var _parachute: ImageVector? = null
