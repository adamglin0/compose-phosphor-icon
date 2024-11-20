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

public val ThinGroup.Confetti: ImageVector
    get() {
        if (_confetti != null) {
            return _confetti!!
        }
        _confetti = Builder(name = "Confetti", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.66f, 55.46f)
                arcToRelative(11.79f, 11.79f, 0.0f, false, false, -19.43f, 4.31f)
                lineTo(36.73f, 204.15f)
                arcToRelative(11.81f, 11.81f, 0.0f, false, false, 11.0f, 15.85f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, false, 4.08f, -0.73f)
                lineToRelative(144.38f, -52.5f)
                arcToRelative(11.79f, 11.79f, 0.0f, false, false, 4.31f, -19.43f)
                close()
                moveTo(102.13f, 192.46f)
                lineTo(63.52f, 153.87f)
                lineToRelative(16.19f, -44.51f)
                lineToRelative(66.92f, 66.93f)
                close()
                moveTo(49.13f, 211.74f)
                arcToRelative(3.81f, 3.81f, 0.0f, false, true, -4.87f, -4.87f)
                lineToRelative(16.27f, -44.72f)
                lineToRelative(33.32f, 33.32f)
                close()
                moveTo(195.93f, 156.49f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, true, -2.42f, 2.74f)
                lineToRelative(-38.56f, 14.0f)
                lineTo(82.72f, 101.07f)
                lineToRelative(14.0f, -38.56f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, true, 2.74f, -2.42f)
                arcToRelative(4.32f, 4.32f, 0.0f, false, true, 0.85f, -0.09f)
                arcTo(3.65f, 3.65f, 0.0f, false, true, 103.0f, 61.12f)
                lineTo(194.88f, 153.0f)
                arcTo(3.78f, 3.78f, 0.0f, false, true, 195.91f, 156.51f)
                close()
                moveTo(220.0f, 24.0f)
                curveToRelative(0.0f, 9.68f, -5.85f, 28.0f, -28.0f, 28.0f)
                curveToRelative(-8.31f, 0.0f, -14.18f, 3.29f, -17.42f, 9.79f)
                arcTo(26.12f, 26.12f, 0.0f, false, false, 172.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(34.06f, 34.06f, 0.0f, false, true, 3.42f, -13.79f)
                curveTo(170.66f, 51.73f, 177.56f, 44.0f, 192.0f, 44.0f)
                curveToRelative(19.29f, 0.0f, 20.0f, -18.0f, 20.0f, -20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 24.0f)
                close()
                moveTo(140.0f, 40.0f)
                lineTo(140.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(148.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(234.83f, 125.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                close()
                moveTo(241.26f, 75.8f)
                lineTo(217.26f, 83.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.27f, -7.79f)
                lineToRelative(24.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.53f, 7.59f)
                close()
            }
        }
        .build()
        return _confetti!!
    }

private var _confetti: ImageVector? = null
