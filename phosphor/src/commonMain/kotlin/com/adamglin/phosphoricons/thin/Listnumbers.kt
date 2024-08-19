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

public val ThinGroup.Listnumbers: ImageVector
    get() {
        if (_listnumbers != null) {
            return _listnumbers!!
        }
        _listnumbers = Builder(name = "Listnumbers", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 128.0f)
                close()
                moveTo(104.0f, 68.0f)
                horizontalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(216.0f, 188.0f)
                horizontalLineTo(104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(41.79f, 51.58f)
                lineTo(52.0f, 46.47f)
                verticalLineTo(104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.79f, -3.58f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 3.58f, 7.16f)
                close()
                moveTo(72.0f, 204.0f)
                horizontalLineTo(48.0f)
                lineToRelative(23.85f, -31.92f)
                arcToRelative(19.54f, 19.54f, 0.0f, false, false, 4.0f, -14.8f)
                arcToRelative(19.76f, 19.76f, 0.0f, false, false, -8.0f, -13.28f)
                arcToRelative(20.84f, 20.84f, 0.0f, false, false, -28.59f, 3.92f)
                arcToRelative(19.85f, 19.85f, 0.0f, false, false, -3.0f, 5.38f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 43.76f, 156.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 1.78f, -3.22f)
                arcToRelative(12.78f, 12.78f, 0.0f, false, true, 17.54f, -2.37f)
                arcToRelative(11.85f, 11.85f, 0.0f, false, true, 4.81f, 7.94f)
                arcToRelative(11.65f, 11.65f, 0.0f, false, true, -2.41f, 8.85f)
                lineTo(36.8f, 205.61f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 212.0f)
                horizontalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _listnumbers!!
    }

private var _listnumbers: ImageVector? = null
