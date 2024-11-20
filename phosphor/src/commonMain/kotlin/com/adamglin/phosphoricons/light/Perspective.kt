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

public val LightGroup.Perspective: ImageVector
    get() {
        if (_perspective != null) {
            return _perspective!!
        }
        _perspective = Builder(name = "Perspective", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 122.0f)
                horizontalLineTo(222.0f)
                verticalLineTo(48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -16.5f, -13.77f)
                lineTo(45.5f, 63.32f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 77.09f)
                verticalLineTo(122.0f)
                horizontalLineTo(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(34.0f)
                verticalLineToRelative(44.91f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 11.5f, 13.77f)
                lineToRelative(160.0f, 29.09f)
                arcTo(14.2f, 14.2f, 0.0f, false, false, 208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(134.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(46.0f, 77.09f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.64f, -2.0f)
                lineToRelative(160.0f, -29.1f)
                lineToRelative(0.37f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(74.0f)
                horizontalLineTo(46.0f)
                close()
                moveTo(210.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.72f, 1.53f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.64f, 0.44f)
                lineToRelative(-160.0f, -29.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.64f, -2.0f)
                verticalLineTo(134.0f)
                horizontalLineTo(210.0f)
                close()
            }
        }
        .build()
        return _perspective!!
    }

private var _perspective: ImageVector? = null
