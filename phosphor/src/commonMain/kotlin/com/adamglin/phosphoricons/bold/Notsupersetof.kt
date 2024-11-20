package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) {
            return _notSupersetOf!!
        }
        _notSupersetOf = Builder(name = "NotSupersetOf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 188.0f)
                horizontalLineTo(89.67f)
                lineToRelative(14.55f, -16.0f)
                horizontalLineTo(152.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 204.86f, 61.29f)
                lineToRelative(12.0f, -13.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.76f, -16.14f)
                lineToRelative(-12.4f, 13.63f)
                arcTo(67.62f, 67.62f, 0.0f, false, false, 152.0f, 36.0f)
                horizontalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(43.74f, 43.74f, 0.0f, false, true, 18.06f, 3.89f)
                lineTo(93.6f, 148.0f)
                horizontalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(71.78f)
                lineTo(39.12f, 207.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.76f, 16.14f)
                lineToRelative(11.0f, -12.07f)
                horizontalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(188.44f, 79.36f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 152.0f, 148.0f)
                horizontalLineTo(126.0f)
                close()
            }
        }
        .build()
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
