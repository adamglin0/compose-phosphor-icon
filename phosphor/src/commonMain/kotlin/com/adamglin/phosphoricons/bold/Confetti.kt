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

public val BoldGroup.Confetti: ImageVector
    get() {
        if (_confetti != null) {
            return _confetti!!
        }
        _confetti = Builder(name = "Confetti", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.32f, 49.8f)
                arcTo(19.79f, 19.79f, 0.0f, false, false, 81.72f, 57.0f)
                lineTo(29.22f, 201.41f)
                arcTo(19.82f, 19.82f, 0.0f, false, false, 47.75f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 6.84f, -1.22f)
                lineTo(199.0f, 174.28f)
                arcToRelative(19.79f, 19.79f, 0.0f, false, false, 7.24f, -32.6f)
                close()
                moveTo(104.19f, 183.21f)
                lineToRelative(-31.4f, -31.4f)
                lineTo(82.94f, 123.9f)
                lineToRelative(49.16f, 49.16f)
                close()
                moveTo(51.77f, 209.61f)
                close()
                moveTo(63.77f, 176.7f)
                lineTo(79.3f, 192.26f)
                lineToRelative(-24.45f, 8.89f)
                close()
                moveTo(157.0f, 164.0f)
                lineTo(92.0f, 99.0f)
                lineToRelative(10.0f, -27.58f)
                lineTo(184.57f, 154.0f)
                close()
                moveTo(128.0f, 40.0f)
                lineTo(128.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(152.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(244.48f, 123.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                close()
                moveTo(243.79f, 83.38f)
                lineTo(219.79f, 91.38f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.59f, -22.77f)
                lineToRelative(24.0f, -8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 7.59f, 22.77f)
                close()
                moveTo(156.6f, 65.93f)
                curveTo(159.83f, 47.47f, 173.39f, 36.0f, 192.0f, 36.0f)
                curveToRelative(6.45f, 0.0f, 8.69f, -2.49f, 10.0f, -4.92f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 2.0f, -7.22f)
                lineTo(204.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                curveToRelative(0.0f, 14.47f, -9.59f, 36.0f, -36.0f, 36.0f)
                curveToRelative(-4.94f, 0.0f, -10.21f, 1.19f, -11.76f, 10.06f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.43f, 80.0f)
                arcToRelative(12.35f, 12.35f, 0.0f, false, true, -2.08f, -0.18f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 156.6f, 65.93f)
                close()
            }
        }
        .build()
        return _confetti!!
    }

private var _confetti: ImageVector? = null
