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

public val LightGroup.ArrowFatLineDown: ImageVector
    get() {
        if (_arrowFatLineDown != null) {
            return _arrowFatLineDown!!
        }
        _arrowFatLineDown = Builder(name = "ArrowFatLineDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.54f, 133.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 130.0f)
                horizontalLineTo(182.0f)
                verticalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                horizontalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(58.0f)
                horizontalLineTo(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.24f, 10.24f)
                lineToRelative(96.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 0.0f)
                lineToRelative(96.0f, -96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 229.54f, 133.7f)
                close()
                moveTo(128.0f, 223.51f)
                lineTo(46.49f, 142.0f)
                horizontalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(78.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(33.51f)
                close()
                moveTo(74.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 74.0f, 40.0f)
                close()
            }
        }
        .build()
        return _arrowFatLineDown!!
    }

private var _arrowFatLineDown: ImageVector? = null
