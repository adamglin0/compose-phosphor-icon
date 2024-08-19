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

public val RegularGroup.Confetti: ImageVector
    get() {
        if (_confetti != null) {
            return _confetti!!
        }
        _confetti = Builder(name = "Confetti", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(111.49f, 52.63f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, -26.0f, 5.77f)
                lineTo(33.0f, 202.78f)
                arcTo(15.83f, 15.83f, 0.0f, false, false, 47.76f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 5.46f, -1.0f)
                lineToRelative(144.37f, -52.5f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, 5.78f, -26.0f)
                close()
                moveTo(103.16f, 187.84f)
                lineTo(68.16f, 152.84f)
                lineTo(81.32f, 116.63f)
                lineTo(139.37f, 174.68f)
                close()
                moveTo(48.16f, 207.84f)
                lineTo(62.16f, 169.43f)
                lineTo(86.61f, 193.88f)
                close()
                moveTo(156.0f, 168.64f)
                lineTo(87.36f, 100.0f)
                lineToRelative(13.0f, -35.87f)
                lineToRelative(91.43f, 91.43f)
                close()
                moveTo(160.0f, 72.0f)
                arcToRelative(37.8f, 37.8f, 0.0f, false, true, 3.84f, -15.58f)
                curveTo(169.14f, 45.83f, 179.14f, 40.0f, 192.0f, 40.0f)
                curveToRelative(6.7f, 0.0f, 11.0f, -2.29f, 13.65f, -7.21f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 208.0f, 23.94f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 24.0f)
                curveToRelative(0.0f, 12.86f, -8.52f, 32.0f, -32.0f, 32.0f)
                curveToRelative(-6.7f, 0.0f, -11.0f, 2.29f, -13.65f, 7.21f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 176.0f, 72.06f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 72.0f)
                close()
                moveTo(136.0f, 40.0f)
                lineTo(136.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(152.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(237.66f, 122.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.32f, 11.31f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                close()
                moveTo(242.53f, 79.59f)
                lineTo(218.53f, 87.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.06f, -15.18f)
                lineToRelative(24.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.06f, 15.18f)
                close()
            }
        }
        .build()
        return _confetti!!
    }

private var _confetti: ImageVector? = null
