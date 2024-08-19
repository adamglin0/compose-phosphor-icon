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

public val BoldGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.0f, 96.0f)
                arcToRelative(20.33f, 20.33f, 0.0f, false, false, -17.74f, -14.0f)
                lineToRelative(-56.59f, -4.57f)
                lineTo(146.83f, 24.62f)
                arcToRelative(20.36f, 20.36f, 0.0f, false, false, -37.66f, 0.0f)
                lineTo(87.35f, 77.44f)
                lineTo(30.76f, 82.0f)
                arcTo(20.45f, 20.45f, 0.0f, false, false, 19.1f, 117.88f)
                lineToRelative(43.18f, 37.24f)
                lineToRelative(-13.2f, 55.7f)
                arcTo(20.37f, 20.37f, 0.0f, false, false, 79.57f, 233.0f)
                lineTo(128.0f, 203.19f)
                lineTo(176.43f, 233.0f)
                arcToRelative(20.39f, 20.39f, 0.0f, false, false, 30.49f, -22.15f)
                lineToRelative(-13.2f, -55.7f)
                lineToRelative(43.18f, -37.24f)
                arcTo(20.43f, 20.43f, 0.0f, false, false, 243.0f, 96.0f)
                close()
                moveTo(172.53f, 141.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.84f, 11.86f)
                lineTo(181.58f, 208.0f)
                lineToRelative(-47.29f, -29.08f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.58f, 0.0f)
                lineTo(74.42f, 208.0f)
                lineToRelative(12.89f, -54.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.84f, -11.86f)
                lineTo(41.2f, 105.24f)
                lineToRelative(55.4f, -4.47f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.13f, -7.38f)
                lineTo(128.0f, 41.89f)
                lineToRelative(21.27f, 51.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.13f, 7.38f)
                lineToRelative(55.4f, 4.47f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
