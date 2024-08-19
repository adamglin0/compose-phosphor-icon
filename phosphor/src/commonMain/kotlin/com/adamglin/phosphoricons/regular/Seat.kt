package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Seat: ImageVector
    get() {
        if (_seat != null) {
            return _seat!!
        }
        _seat = Builder(name = "Seat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(112.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(216.0f, 224.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 232.0f)
                close()
                moveTo(224.0f, 160.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(114.11f, 208.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, true, -14.32f, -8.85f)
                lineToRelative(-58.11f, -116.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 0.0f, -14.32f)
                lineToRelative(22.12f, -44.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 85.0f, 17.56f)
                lineToRelative(33.69f, 14.22f)
                lineToRelative(0.47f, 0.22f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 7.15f, 21.46f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, true, -0.11f, 0.22f)
                lineTo(112.0f, 80.0f)
                lineToRelative(31.78f, 64.0f)
                lineTo(208.0f, 144.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 160.0f)
                close()
                moveTo(208.0f, 160.0f)
                lineTo(143.77f, 160.0f)
                arcToRelative(15.91f, 15.91f, 0.0f, false, true, -14.31f, -8.85f)
                lineToRelative(-31.79f, -64.0f)
                arcToRelative(16.07f, 16.07f, 0.0f, false, true, 0.0f, -14.29f)
                lineToRelative(0.12f, -0.22f)
                lineTo(112.0f, 46.32f)
                lineTo(78.57f, 32.21f)
                arcTo(4.84f, 4.84f, 0.0f, false, true, 78.1f, 32.0f)
                lineTo(56.0f, 76.0f)
                lineTo(114.1f, 192.0f)
                lineTo(208.0f, 192.0f)
                close()
            }
        }
        .build()
        return _seat!!
    }

private var _seat: ImageVector? = null
