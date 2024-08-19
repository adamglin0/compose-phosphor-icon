package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Seat: ImageVector
    get() {
        if (_seat != null) {
            return _seat!!
        }
        _seat = Builder(name = "Seat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(112.0f, 236.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(216.0f, 228.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 232.0f)
                close()
                moveTo(220.0f, 160.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(114.11f, 204.0f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, true, -10.74f, -6.63f)
                lineToRelative(-58.11f, -116.0f)
                arcToRelative(12.07f, 12.07f, 0.0f, false, true, 0.0f, -10.74f)
                lineToRelative(22.12f, -44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.0f, -5.42f)
                lineToRelative(33.78f, 14.27f)
                lineToRelative(0.23f, 0.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.37f, 16.1f)
                lineToRelative(-0.06f, 0.1f)
                lineTo(108.4f, 78.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 3.53f)
                lineToRelative(31.78f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.57f, 2.2f)
                lineTo(208.0f, 147.99f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 160.0f)
                close()
                moveTo(212.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(143.77f, 156.0f)
                arcTo(11.94f, 11.94f, 0.0f, false, true, 133.0f, 149.37f)
                lineToRelative(-31.78f, -64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -10.72f)
                lineToRelative(0.06f, -0.11f)
                lineToRelative(14.27f, -26.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.71f, -5.27f)
                lineTo(80.13f, 28.53f)
                lineToRelative(-0.24f, -0.11f)
                arcTo(3.91f, 3.91f, 0.0f, false, false, 78.11f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 2.21f)
                lineToRelative(-22.12f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 3.57f)
                lineToRelative(58.11f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 2.21f)
                lineTo(208.0f, 195.99f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _seat!!
    }

private var _seat: ImageVector? = null
