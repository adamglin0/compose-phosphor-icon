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

public val ThinGroup.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 80.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 133.59f, 37.56f)
                lineTo(63.52f, 106.83f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 60.0f, 115.31f)
                verticalLineToRelative(75.0f)
                lineTo(29.17f, 221.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineTo(65.66f, 196.0f)
                horizontalLineToRelative(75.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.48f, -3.51f)
                lineToRelative(0.0f, 0.0f)
                lineTo(218.0f, 122.83f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.4f, -0.4f)
                arcTo(59.63f, 59.63f, 0.0f, false, false, 236.0f, 80.0f)
                close()
                moveTo(139.23f, 43.23f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 213.5f, 116.0f)
                lineTo(145.66f, 116.0f)
                lineToRelative(41.17f, -41.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineTo(116.0f, 134.34f)
                lineTo(116.0f, 66.19f)
                close()
                moveTo(68.0f, 115.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.16f, -2.81f)
                lineTo(108.0f, 74.1f)
                verticalLineToRelative(68.24f)
                lineToRelative(-40.0f, 40.0f)
                close()
                moveTo(143.51f, 186.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, 1.17f)
                horizontalLineToRelative(-67.0f)
                lineToRelative(64.0f, -64.0f)
                horizontalLineToRelative(68.0f)
                close()
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
