package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Calendarstar: ImageVector
    get() {
        if (_calendarstar != null) {
            return _calendarstar!!
        }
        _calendarstar = Builder(name = "Calendarstar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(188.0f, 28.0f)
                lineTo(188.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(92.0f, 28.0f)
                lineTo(92.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 52.0f)
                lineTo(68.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(176.92f, 109.65f)
                lineTo(149.5f, 107.53f)
                lineTo(139.0f, 83.25f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.0f, 0.0f)
                lineTo(106.5f, 107.53f)
                lineToRelative(-27.42f, 2.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.72f, 21.22f)
                lineToRelative(20.58f, 17.0f)
                lineToRelative(-6.25f, 25.26f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.73f, 13.22f)
                lineTo(128.0f, 172.46f)
                lineToRelative(23.58f, 13.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.73f, -13.22f)
                lineToRelative(-6.25f, -25.26f)
                lineToRelative(20.58f, -17.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.72f, -21.22f)
                close()
                moveTo(141.92f, 134.16f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.0f, 12.13f)
                lineToRelative(1.21f, 4.89f)
                lineToRelative(-5.07f, -3.0f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, -12.18f, 0.0f)
                lineToRelative(-5.07f, 3.0f)
                lineToRelative(1.21f, -4.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.0f, -12.13f)
                lineToRelative(-3.47f, -2.87f)
                lineToRelative(5.0f, -0.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.09f, -7.21f)
                lineToRelative(2.33f, -5.4f)
                lineToRelative(2.33f, 5.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.09f, 7.21f)
                lineToRelative(5.0f, 0.39f)
                close()
            }
        }
        .build()
        return _calendarstar!!
    }

private var _calendarstar: ImageVector? = null
