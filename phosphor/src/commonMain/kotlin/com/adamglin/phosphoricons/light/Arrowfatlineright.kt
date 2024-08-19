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

public val LightGroup.Arrowfatlineright: ImageVector
    get() {
        if (_arrowfatlineright != null) {
            return _arrowfatlineright!!
        }
        _arrowfatlineright = Builder(name = "Arrowfatlineright", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.24f, 123.76f)
                lineToRelative(-96.0f, -96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 130.0f, 32.0f)
                verticalLineTo(74.0f)
                horizontalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(58.0f)
                verticalLineToRelative(42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.24f, 4.24f)
                lineToRelative(96.0f, -96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 236.24f, 123.76f)
                close()
                moveTo(142.0f, 209.51f)
                verticalLineTo(176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                horizontalLineTo(78.0f)
                verticalLineTo(86.0f)
                horizontalLineToRelative(58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(46.49f)
                lineTo(223.51f, 128.0f)
                close()
                moveTo(46.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowfatlineright!!
    }

private var _arrowfatlineright: ImageVector? = null
