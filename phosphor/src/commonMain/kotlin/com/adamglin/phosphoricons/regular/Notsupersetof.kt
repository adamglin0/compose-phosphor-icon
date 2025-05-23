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

public val RegularGroup.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) {
            return _notSupersetOf!!
        }
        _notSupersetOf = Builder(name = "NotSupersetOf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 192.0f)
                horizontalLineTo(80.63f)
                lineToRelative(21.82f, -24.0f)
                horizontalLineTo(152.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 199.54f, 61.2f)
                lineToRelative(14.38f, -15.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.84f, -10.76f)
                lineTo(187.43f, 50.73f)
                arcTo(63.66f, 63.66f, 0.0f, false, false, 152.0f, 40.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(47.72f, 47.72f, 0.0f, false, true, 24.51f, 6.75f)
                lineTo(95.37f, 152.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(80.82f)
                lineTo(42.08f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, 10.76f)
                lineTo(66.08f, 208.0f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(188.71f, 73.12f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 152.0f, 152.0f)
                horizontalLineTo(117.0f)
                close()
            }
        }
        .build()
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
