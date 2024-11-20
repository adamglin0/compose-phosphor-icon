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

public val ThinGroup.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) {
            return _pinwheel!!
        }
        _pinwheel = Builder(name = "Pinwheel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.83f, 221.17f)
                lineTo(173.35f, 167.7f)
                arcToRelative(56.83f, 56.83f, 0.0f, false, false, 9.79f, -2.6f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 33.47f, -71.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.13f, -2.39f)
                lineToRelative(-55.31f, 20.13f)
                arcToRelative(56.78f, 56.78f, 0.0f, false, false, 7.06f, -11.38f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -69.9f, -76.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.39f, 5.12f)
                lineToRelative(20.13f, 55.32f)
                arcToRelative(56.33f, 56.33f, 0.0f, false, false, -11.38f, -7.06f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -76.28f, 69.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 25.47f, 149.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.06f, 0.13f)
                lineTo(83.85f, 129.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 62.84f, 87.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.39f, -5.13f)
                lineTo(129.0f, 156.17f)
                arcToRelative(56.5f, 56.5f, 0.0f, false, false, 11.38f, 7.06f)
                arcToRelative(55.88f, 55.88f, 0.0f, false, false, 22.48f, 5.24f)
                lineToRelative(58.36f, 58.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                close()
                moveTo(99.88f, 29.71f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 32.72f, 89.9f)
                close()
                moveTo(125.09f, 122.38f)
                lineTo(117.64f, 125.09f)
                lineTo(114.92f, 117.64f)
                lineTo(122.38f, 114.92f)
                close()
                moveTo(29.71f, 140.14f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 89.9f, -32.72f)
                close()
                moveTo(140.14f, 210.31f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -32.72f, -89.9f)
                close()
                moveTo(164.43f, 160.49f)
                arcToRelative(48.08f, 48.08f, 0.0f, false, true, -44.0f, -27.89f)
                lineToRelative(89.9f, -32.72f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -45.79f, 60.61f)
                close()
            }
        }
        .build()
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
