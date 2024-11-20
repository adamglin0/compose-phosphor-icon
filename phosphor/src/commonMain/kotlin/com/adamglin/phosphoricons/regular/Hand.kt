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

public val RegularGroup.Hand: ImageVector
    get() {
        if (_hand != null) {
            return _hand!!
        }
        _hand = Builder(name = "Hand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 48.0f)
                arcToRelative(27.75f, 27.75f, 0.0f, false, false, -12.0f, 2.71f)
                lineTo(176.0f, 44.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -54.65f, -8.6f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 80.0f, 60.0f)
                verticalLineToRelative(64.0f)
                lineToRelative(-3.82f, -6.13f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -48.6f, 27.82f)
                curveToRelative(16.0f, 33.77f, 28.93f, 57.72f, 43.72f, 72.69f)
                curveTo(86.24f, 233.54f, 103.2f, 240.0f, 128.0f, 240.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, -88.0f)
                lineTo(216.0f, 76.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 188.0f, 48.0f)
                close()
                moveTo(200.0f, 152.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, 72.0f)
                curveToRelative(-20.38f, 0.0f, -33.51f, -4.88f, -45.33f, -16.85f)
                curveTo(69.44f, 193.74f, 57.26f, 171.0f, 41.9f, 138.58f)
                arcToRelative(6.36f, 6.36f, 0.0f, false, false, -0.3f, -0.58f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.79f, -12.0f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, 0.14f, 0.23f)
                lineToRelative(18.67f, 30.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 152.0f)
                lineTo(96.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(176.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _hand!!
    }

private var _hand: ImageVector? = null
