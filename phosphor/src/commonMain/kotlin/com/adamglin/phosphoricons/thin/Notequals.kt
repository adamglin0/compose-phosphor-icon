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

public val ThinGroup.NotEquals: ImageVector
    get() {
        if (_notEquals != null) {
            return _notEquals!!
        }
        _notEquals = Builder(name = "NotEquals", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(100.68f)
                lineTo(51.0f, 218.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 45.0f, 213.31f)
                lineTo(89.87f, 164.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(97.14f)
                lineToRelative(50.91f, -56.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(155.32f)
                lineTo(205.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 211.0f, 42.69f)
                lineTo(166.13f, 92.0f)
                horizontalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(158.86f)
                lineTo(108.0f, 156.0f)
                horizontalLineTo(216.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 160.0f)
                close()
            }
        }
        .build()
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
