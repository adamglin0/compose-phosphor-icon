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

public val ThinGroup.XLogo: ImageVector
    get() {
        if (_xLogo != null) {
            return _xLogo!!
        }
        _xLogo = Builder(name = "XLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.37f, 213.85f)
                lineTo(147.13f, 112.9f)
                lineTo(211.0f, 42.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 205.0f, 37.31f)
                lineTo(142.68f, 105.9f)
                lineTo(99.38f, 37.85f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 96.0f, 36.0f)
                horizontalLineTo(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.37f, 6.15f)
                lineTo(108.87f, 143.1f)
                lineTo(45.0f, 213.31f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 51.0f, 218.69f)
                lineToRelative(62.36f, -68.59f)
                lineToRelative(43.3f, 68.05f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 220.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.37f, -6.15f)
                close()
                moveTo(162.2f, 212.0f)
                lineTo(55.29f, 44.0f)
                horizontalLineTo(93.8f)
                lineTo(200.71f, 212.0f)
                close()
            }
        }
        .build()
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
