package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.XLogo: ImageVector
    get() {
        if (_xLogo != null) {
            return _xLogo!!
        }
        _xLogo = Builder(name = "XLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.75f, 211.71f)
                lineToRelative(-62.6f, -98.38f)
                lineToRelative(61.77f, -67.95f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.84f, -10.76f)
                lineTo(143.24f, 99.34f)
                lineTo(102.75f, 35.71f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 32.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.75f, 12.3f)
                lineToRelative(62.6f, 98.37f)
                lineToRelative(-61.77f, 68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, 10.76f)
                lineToRelative(58.84f, -64.72f)
                lineToRelative(40.49f, 63.63f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 224.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.75f, -12.29f)
                close()
                moveTo(164.39f, 208.0f)
                lineTo(62.57f, 48.0f)
                horizontalLineToRelative(29.0f)
                lineTo(193.43f, 208.0f)
                close()
            }
        }
        .build()
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
