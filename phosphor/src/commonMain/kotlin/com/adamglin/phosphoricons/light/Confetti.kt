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

public val LightGroup.Confetti: ImageVector
    get() {
        if (_confetti != null) {
            return _confetti!!
        }
        _confetti = Builder(name = "Confetti", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(110.08f, 54.0f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -22.73f, 5.05f)
                lineTo(34.85f, 203.47f)
                arcTo(13.82f, 13.82f, 0.0f, false, false, 47.76f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 4.77f, -0.85f)
                lineToRelative(144.38f, -52.5f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 5.0f, -22.73f)
                close()
                moveTo(48.43f, 209.87f)
                arcToRelative(1.79f, 1.79f, 0.0f, false, true, -2.3f, -2.3f)
                lineTo(61.31f, 165.8f)
                lineTo(90.2f, 194.68f)
                close()
                moveTo(102.64f, 190.16f)
                lineTo(65.84f, 153.35f)
                lineTo(80.51f, 113.0f)
                lineTo(143.0f, 175.49f)
                close()
                moveTo(194.0f, 156.07f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, true, -1.14f, 1.3f)
                lineTo(155.44f, 171.0f)
                lineTo(85.0f, 100.55f)
                lineTo(98.63f, 63.19f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, true, 1.3f, -1.14f)
                arcToRelative(1.58f, 1.58f, 0.0f, false, true, 0.41f, 0.0f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, true, 1.25f, 0.53f)
                lineToRelative(91.88f, 91.88f)
                arcTo(1.73f, 1.73f, 0.0f, false, true, 194.0f, 156.07f)
                close()
                moveTo(162.0f, 72.0f)
                arcToRelative(35.52f, 35.52f, 0.0f, false, true, 3.63f, -14.68f)
                curveTo(170.57f, 47.44f, 179.93f, 42.0f, 192.0f, 42.0f)
                curveToRelative(7.47f, 0.0f, 12.53f, -2.74f, 15.48f, -8.38f)
                arcTo(24.18f, 24.18f, 0.0f, false, false, 210.0f, 24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 216.0f, 18.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                curveToRelative(0.0f, 10.38f, -6.27f, 30.0f, -30.0f, 30.0f)
                curveToRelative(-7.47f, 0.0f, -12.53f, 2.74f, -15.48f, 8.38f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 174.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineToRelative(0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 162.0f, 72.0f)
                close()
                moveTo(138.0f, 40.0f)
                lineTo(138.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(150.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(236.24f, 123.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                close()
                moveTo(241.9f, 77.69f)
                lineTo(217.9f, 85.69f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -3.8f, -11.38f)
                lineToRelative(24.0f, -8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.8f, 11.38f)
                close()
            }
        }
        .build()
        return _confetti!!
    }

private var _confetti: ImageVector? = null
