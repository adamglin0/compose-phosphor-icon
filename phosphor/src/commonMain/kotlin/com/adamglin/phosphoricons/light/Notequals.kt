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

public val LightGroup.NotEquals: ImageVector
    get() {
        if (_notEquals != null) {
            return _notEquals!!
        }
        _notEquals = Builder(name = "NotEquals", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(101.56f)
                lineTo(52.44f, 220.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 43.56f, 212.0f)
                lineToRelative(41.79f, -46.0f)
                horizontalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(96.25f)
                lineToRelative(47.28f, -52.0f)
                horizontalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(154.44f)
                lineToRelative(49.12f, -54.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 212.44f, 44.0f)
                lineTo(170.65f, 90.0f)
                horizontalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(159.75f)
                lineToRelative(-47.28f, 52.0f)
                horizontalLineTo(216.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 160.0f)
                close()
            }
        }
        .build()
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
