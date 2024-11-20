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

public val BoldGroup.Cake: ImageVector
    get() {
        if (_cake != null) {
            return _cake!!
        }
        _cake = Builder(name = "Cake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 112.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, -28.0f)
                lineTo(140.0f, 84.0f)
                lineTo(140.0f, 81.94f)
                arcTo(36.07f, 36.07f, 0.0f, false, false, 164.0f, 48.0f)
                curveToRelative(0.0f, -31.06f, -29.38f, -46.11f, -30.63f, -46.73f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 0.0f)
                curveTo(121.38f, 1.89f, 92.0f, 16.94f, 92.0f, 48.0f)
                arcToRelative(36.07f, 36.07f, 0.0f, false, false, 24.0f, 33.94f)
                lineTo(116.0f, 84.0f)
                lineTo(48.0f, 84.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, 28.0f)
                verticalLineToRelative(23.33f)
                arcToRelative(44.7f, 44.7f, 0.0f, false, false, 8.0f, 25.49f)
                lineTo(28.0f, 200.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(200.0f, 228.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(228.0f, 160.82f)
                arcToRelative(44.7f, 44.7f, 0.0f, false, false, 8.0f, -25.49f)
                close()
                moveTo(124.0f, 29.93f)
                arcToRelative(42.49f, 42.49f, 0.0f, false, true, 4.0f, -3.57f)
                arcToRelative(41.26f, 41.26f, 0.0f, false, true, 4.0f, 3.57f)
                curveToRelative(5.33f, 5.52f, 8.0f, 11.6f, 8.0f, 18.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                curveTo(116.0f, 41.53f, 118.71f, 35.45f, 124.0f, 29.93f)
                close()
                moveTo(44.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(23.33f)
                curveToRelative(0.0f, 11.1f, -8.72f, 20.37f, -19.43f, 20.66f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 172.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.57f, 20.0f)
                curveTo(52.72f, 155.7f, 44.0f, 146.43f, 44.0f, 135.33f)
                close()
                moveTo(200.0f, 204.0f)
                lineTo(56.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 178.29f)
                arcTo(42.65f, 42.65f, 0.0f, false, false, 62.77f, 180.0f)
                arcToRelative(43.68f, 43.68f, 0.0f, false, false, 31.91f, -12.44f)
                curveToRelative(0.46f, -0.44f, 0.9f, -0.9f, 1.33f, -1.35f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 64.0f, 0.0f)
                curveToRelative(0.43f, 0.45f, 0.87f, 0.91f, 1.33f, 1.35f)
                arcTo(43.66f, 43.66f, 0.0f, false, false, 192.0f, 180.0f)
                lineToRelative(1.25f, 0.0f)
                arcTo(42.65f, 42.65f, 0.0f, false, false, 204.0f, 178.29f)
                lineTo(204.0f, 200.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 204.0f)
                close()
            }
        }
        .build()
        return _cake!!
    }

private var _cake: ImageVector? = null
