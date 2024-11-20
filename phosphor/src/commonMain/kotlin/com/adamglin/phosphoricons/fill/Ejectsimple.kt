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

public val FillGroup.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) {
            return _ejectSimple!!
        }
        _ejectSimple = Builder(name = "EjectSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f)
                horizontalLineTo(224.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 200.0f)
                close()
                moveTo(40.09f, 160.0f)
                horizontalLineTo(215.91f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 12.48f, -26.23f)
                lineTo(146.74f, 32.94f)
                arcToRelative(24.11f, 24.11f, 0.0f, false, false, -37.48f, 0.0f)
                lineTo(27.61f, 133.77f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 40.09f, 160.0f)
                close()
            }
        }
        .build()
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
