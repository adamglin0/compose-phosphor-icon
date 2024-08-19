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

public val ThinGroup.Eyeslash: ImageVector
    get() {
        if (_eyeslash != null) {
            return _eyeslash!!
        }
        _eyeslash = Builder(name = "Eyeslash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(67.59f, 67.5f)
                curveTo(29.34f, 89.0f, 13.0f, 124.81f, 12.34f, 126.38f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, false, 0.0f, 3.25f)
                curveToRelative(0.34f, 0.77f, 8.52f, 18.89f, 26.83f, 37.2f)
                curveToRelative(17.0f, 17.0f, 46.14f, 37.17f, 88.83f, 37.17f)
                arcToRelative(122.59f, 122.59f, 0.0f, false, false, 53.06f, -11.69f)
                lineToRelative(24.0f, 26.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(149.1f, 157.16f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 101.0f, 104.22f)
                close()
                moveTo(128.0f, 196.0f)
                curveToRelative(-32.0f, 0.0f, -59.89f, -11.65f, -83.0f, -34.62f)
                arcTo(135.81f, 135.81f, 0.0f, false, true, 20.44f, 128.0f)
                curveToRelative(3.65f, -7.23f, 20.09f, -36.81f, 52.68f, -54.43f)
                lineToRelative(22.45f, 24.7f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 59.0f, 64.83f)
                lineToRelative(20.89f, 23.0f)
                arcTo(114.94f, 114.94f, 0.0f, false, true, 128.0f, 196.0f)
                close()
                moveTo(134.78f, 92.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.49f, -7.86f)
                arcToRelative(44.15f, 44.15f, 0.0f, false, true, 35.54f, 39.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.61f, 4.35f)
                lineToRelative(-0.38f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -3.63f)
                arcTo(36.1f, 36.1f, 0.0f, false, false, 134.78f, 92.64f)
                close()
                moveTo(243.66f, 129.64f)
                curveToRelative(-0.41f, 0.91f, -10.2f, 22.58f, -32.38f, 42.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.67f, 1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.67f, -7.0f)
                arcTo(136.71f, 136.71f, 0.0f, false, false, 235.56f, 128.0f)
                arcTo(136.07f, 136.07f, 0.0f, false, false, 211.0f, 94.62f)
                curveTo(187.89f, 71.65f, 160.0f, 60.0f, 128.0f, 60.0f)
                arcToRelative(122.0f, 122.0f, 0.0f, false, false, -20.0f, 1.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.32f, -7.89f)
                arcTo(129.3f, 129.3f, 0.0f, false, true, 128.0f, 52.0f)
                curveToRelative(42.7f, 0.0f, 71.87f, 20.22f, 88.83f, 37.18f)
                curveToRelative(18.31f, 18.31f, 26.49f, 36.44f, 26.83f, 37.2f)
                arcTo(4.08f, 4.08f, 0.0f, false, true, 243.66f, 129.63f)
                close()
            }
        }
        .build()
        return _eyeslash!!
    }

private var _eyeslash: ImageVector? = null
