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

public val ThinGroup.Globex: ImageVector
    get() {
        if (_globex != null) {
            return _globex!!
        }
        _globex = Builder(name = "Globex", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, 0.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.49f, -7.11f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.3f, -0.24f, -23.57f, -19.41f, -33.78f, -56.88f)
                lineTo(128.0f, 164.01f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(94.82f, 156.01f)
                arcToRelative(140.42f, 140.42f, 0.0f, false, true, 0.0f, -56.0f)
                horizontalLineToRelative(66.36f)
                arcTo(137.89f, 137.89f, 0.0f, false, true, 164.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(149.23f, 149.23f, 0.0f, false, false, -2.59f, -28.0f)
                horizontalLineToRelative(46.23f)
                arcTo(91.6f, 91.6f, 0.0f, false, true, 220.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(117.54f, 36.6f)
                arcTo(129.39f, 129.39f, 0.0f, false, false, 88.35f, 92.0f)
                horizontalLineToRelative(-45.0f)
                arcTo(92.25f, 92.25f, 0.0f, false, true, 117.54f, 36.6f)
                close()
                moveTo(117.54f, 219.4f)
                arcTo(92.25f, 92.25f, 0.0f, false, true, 43.34f, 164.0f)
                horizontalLineToRelative(45.0f)
                arcTo(129.39f, 129.39f, 0.0f, false, false, 117.54f, 219.4f)
                close()
                moveTo(86.59f, 156.0f)
                lineTo(40.36f, 156.0f)
                arcToRelative(92.09f, 92.09f, 0.0f, false, true, 0.0f, -56.0f)
                lineTo(86.59f, 100.0f)
                arcToRelative(152.65f, 152.65f, 0.0f, false, false, 0.0f, 56.0f)
                close()
                moveTo(96.73f, 92.0f)
                curveTo(105.0f, 61.8f, 121.67f, 43.48f, 128.0f, 37.39f)
                curveToRelative(6.33f, 6.09f, 23.0f, 24.41f, 31.27f, 54.61f)
                close()
                moveTo(167.65f, 92.0f)
                arcToRelative(129.39f, 129.39f, 0.0f, false, false, -29.19f, -55.4f)
                arcTo(92.25f, 92.25f, 0.0f, false, true, 212.66f, 92.0f)
                close()
                moveTo(218.83f, 170.83f)
                lineTo(197.66f, 192.0f)
                lineToRelative(21.17f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(192.0f, 197.66f)
                lineToRelative(-21.17f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(186.34f, 192.0f)
                lineToRelative(-21.17f, -21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(192.0f, 186.34f)
                lineToRelative(21.17f, -21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                close()
            }
        }
        .build()
        return _globex!!
    }

private var _globex: ImageVector? = null
