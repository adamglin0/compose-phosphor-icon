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

public val ThinGroup.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = Builder(name = "PaintBucket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.33f, 165.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.66f, 0.0f)
                curveTo(228.0f, 166.8f, 212.0f, 191.0f, 212.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 40.0f, 0.0f)
                curveTo(252.0f, 191.0f, 236.0f, 166.8f, 235.33f, 165.78f)
                close()
                moveTo(232.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                curveToRelative(0.0f, -10.25f, 7.49f, -24.64f, 12.0f, -32.37f)
                curveToRelative(4.51f, 7.73f, 12.0f, 22.1f, 12.0f, 32.37f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 232.0f, 220.0f)
                close()
                moveTo(235.89f, 132.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.06f, -3.74f)
                lineTo(119.34f, 13.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, 0.0f)
                lineTo(70.25f, 56.6f)
                lineTo(42.82f, 29.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, 5.66f)
                lineTo(64.6f, 62.26f)
                lineTo(17.86f, 109.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.29f)
                lineToRelative(84.85f, 84.85f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f)
                lineTo(210.16f, 143.0f)
                lineToRelative(23.1f, -7.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 235.89f, 132.4f)
                close()
                moveTo(206.74f, 135.69f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, false, -1.57f, 1.0f)
                lineToRelative(-79.83f, 79.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(23.51f, 131.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(70.25f, 67.92f)
                lineToRelative(34.2f, 34.2f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 141.0f, 133.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -30.86f, -36.51f)
                lineToRelative(-34.2f, -34.2f)
                lineToRelative(40.61f, -40.6f)
                lineTo(224.59f, 129.74f)
                close()
                moveTo(112.69f, 104.69f)
                arcToRelative(0.0f, 0.0f, 0.0f, false, false, 0.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 22.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.64f)
                close()
            }
        }
        .build()
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
