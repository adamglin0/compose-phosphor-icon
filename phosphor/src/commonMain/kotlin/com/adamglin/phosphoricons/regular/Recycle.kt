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

public val RegularGroup.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -20.77f, -36.0f)
                lineToRelative(34.29f, -59.25f)
                lineTo(39.47f, 124.5f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 35.33f, 109.0f)
                lineToRelative(32.77f, -8.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.8f, 5.66f)
                lineToRelative(8.79f, 32.77f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 81.0f, 148.5f)
                arcToRelative(8.37f, 8.37f, 0.0f, false, true, -2.08f, 0.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.72f, -5.93f)
                lineToRelative(-3.8f, -14.15f)
                lineTo(33.11f, 188.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 200.0f)
                lineTo(88.0f, 200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 208.0f)
                close()
                moveTo(236.73f, 180.0f)
                lineTo(213.59f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.84f, 8.0f)
                lineToRelative(23.14f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 200.0f)
                lineTo(147.31f, 200.0f)
                lineToRelative(10.34f, -10.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.32f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.31f, -11.32f)
                lineTo(147.31f, 216.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 20.77f, -36.0f)
                close()
                moveTo(128.0f, 32.0f)
                arcToRelative(7.85f, 7.85f, 0.0f, false, true, 6.92f, 4.0f)
                lineToRelative(34.29f, 59.25f)
                lineToRelative(-14.08f, -3.78f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 151.0f, 106.92f)
                lineToRelative(32.78f, 8.79f)
                arcToRelative(8.23f, 8.23f, 0.0f, false, false, 2.07f, 0.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.72f, -5.93f)
                lineToRelative(8.79f, -32.79f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.45f, -4.14f)
                lineToRelative(-3.8f, 14.17f)
                lineTo(148.77f, 28.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -41.54f, 0.0f)
                lineTo(84.07f, 68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.85f, 8.0f)
                lineToRelative(23.16f, -40.0f)
                arcTo(7.85f, 7.85f, 0.0f, false, true, 128.0f, 32.0f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
