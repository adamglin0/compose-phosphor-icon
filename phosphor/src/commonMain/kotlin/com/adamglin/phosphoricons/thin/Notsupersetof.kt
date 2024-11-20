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

public val ThinGroup.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) {
            return _notSupersetOf!!
        }
        _notSupersetOf = Builder(name = "NotSupersetOf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 196.0f)
                horizontalLineTo(71.59f)
                lineToRelative(29.09f, -32.0f)
                horizontalLineTo(152.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 194.07f, 61.27f)
                lineTo(211.0f, 42.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 205.0f, 37.31f)
                lineTo(188.0f, 56.0f)
                arcToRelative(59.73f, 59.73f, 0.0f, false, false, -36.0f, -12.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(51.75f, 51.75f, 0.0f, false, true, 30.6f, 10.0f)
                lineTo(97.14f, 156.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(89.87f)
                lineTo(45.0f, 213.31f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 51.0f, 218.69f)
                lineTo(64.31f, 204.0f)
                horizontalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(188.69f, 67.19f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 152.0f, 156.0f)
                horizontalLineTo(108.0f)
                close()
            }
        }
        .build()
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
