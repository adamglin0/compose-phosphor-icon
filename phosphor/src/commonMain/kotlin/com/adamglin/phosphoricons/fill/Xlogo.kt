package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.XLogo: ImageVector
    get() {
        if (_xLogo != null) {
            return _xLogo!!
        }
        _xLogo = Builder(name = "XLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.0f, 219.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.0f, 4.15f)
                horizontalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.75f, -3.71f)
                lineToRelative(-40.49f, -63.63f)
                lineTo(53.92f, 221.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.84f, -10.76f)
                lineToRelative(61.77f, -68.0f)
                lineTo(41.25f, 44.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 32.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.75f, 3.71f)
                lineToRelative(40.49f, 63.63f)
                lineToRelative(58.84f, -64.72f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.84f, 10.76f)
                lineToRelative(-61.77f, 67.95f)
                lineToRelative(62.6f, 98.38f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 215.0f, 219.85f)
                close()
            }
        }
        .build()
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
