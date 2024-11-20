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

public val ThinGroup.Pentagram: ImageVector
    get() {
        if (_pentagram != null) {
            return _pentagram!!
        }
        _pentagram = Builder(name = "Pentagram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.39f, 92.29f)
                arcTo(11.82f, 11.82f, 0.0f, false, false, 224.0f, 84.0f)
                lineTo(160.0f, 84.0f)
                lineTo(139.42f, 20.47f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -22.83f, 0.0f)
                lineTo(96.0f, 84.0f)
                lineTo(32.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.0f, 21.72f)
                lineTo(76.82f, 143.0f)
                lineTo(57.0f, 204.25f)
                arcToRelative(11.83f, 11.83f, 0.0f, false, false, 4.36f, 13.41f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 14.09f, 0.0f)
                lineTo(128.0f, 179.83f)
                lineToRelative(52.58f, 37.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.47f, -13.41f)
                lineTo(179.18f, 143.0f)
                lineTo(231.0f, 105.7f)
                arcTo(11.83f, 11.83f, 0.0f, false, false, 235.39f, 92.29f)
                close()
                moveTo(124.21f, 22.88f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, 7.59f, 0.0f)
                lineTo(151.62f, 84.0f)
                lineTo(104.38f, 84.0f)
                close()
                moveTo(29.67f, 99.23f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 32.0f, 92.0f)
                lineTo(93.37f, 92.0f)
                lineToRelative(-14.0f, 43.0f)
                close()
                moveTo(70.67f, 211.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.15f, -4.47f)
                horizontalLineToRelative(0.0f)
                lineToRelative(19.08f, -58.8f)
                lineToRelative(37.51f, 27.0f)
                close()
                moveTo(86.19f, 139.97f)
                lineTo(101.78f, 92.0f)
                horizontalLineToRelative(52.44f)
                lineToRelative(15.55f, 47.93f)
                lineTo(128.0f, 170.0f)
                close()
                moveTo(191.4f, 206.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.17f, 4.46f)
                lineTo(134.85f, 174.9f)
                lineToRelative(37.51f, -27.0f)
                close()
                moveTo(226.3f, 99.26f)
                lineTo(176.59f, 135.0f)
                lineToRelative(-14.0f, -43.0f)
                lineTo(224.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.36f, 7.22f)
                close()
            }
        }
        .build()
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
