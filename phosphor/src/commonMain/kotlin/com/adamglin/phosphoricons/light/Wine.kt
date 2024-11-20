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

public val LightGroup.Wine: ImageVector
    get() {
        if (_wine != null) {
            return _wine!!
        }
        _wine = Builder(name = "Wine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(203.41f, 104.23f)
                lineTo(181.64f, 30.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.75f, -4.3f)
                lineTo(80.11f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.75f, 4.3f)
                lineTo(52.59f, 104.23f)
                arcToRelative(61.48f, 61.48f, 0.0f, false, false, 16.87f, 62.65f)
                arcTo(85.35f, 85.35f, 0.0f, false, false, 122.0f, 189.77f)
                lineTo(122.0f, 234.0f)
                lineTo(88.0f, 234.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                lineTo(134.0f, 234.0f)
                lineTo(134.0f, 189.77f)
                arcToRelative(85.38f, 85.38f, 0.0f, false, false, 52.54f, -22.89f)
                arcTo(61.48f, 61.48f, 0.0f, false, false, 203.41f, 104.23f)
                close()
                moveTo(84.6f, 38.0f)
                horizontalLineToRelative(86.8f)
                lineToRelative(20.51f, 69.63f)
                curveToRelative(0.26f, 0.9f, 0.5f, 1.8f, 0.71f, 2.7f)
                curveToRelative(-22.54f, 9.07f, -48.17f, -0.73f, -61.91f, -7.68f)
                curveTo(104.1f, 89.17f, 83.48f, 88.34f, 68.83f, 91.52f)
                close()
                moveTo(178.35f, 158.11f)
                arcToRelative(73.67f, 73.67f, 0.0f, false, true, -100.7f, 0.0f)
                arcToRelative(49.53f, 49.53f, 0.0f, false, true, -13.56f, -50.48f)
                lineToRelative(0.74f, -2.51f)
                curveToRelative(12.34f, -4.46f, 32.26f, -6.05f, 60.46f, 8.23f)
                curveToRelative(11.0f, 5.55f, 28.65f, 12.64f, 47.52f, 12.64f)
                arcTo(65.56f, 65.56f, 0.0f, false, false, 194.0f, 122.62f)
                arcTo(49.22f, 49.22f, 0.0f, false, true, 178.35f, 158.11f)
                close()
            }
        }
        .build()
        return _wine!!
    }

private var _wine: ImageVector? = null
