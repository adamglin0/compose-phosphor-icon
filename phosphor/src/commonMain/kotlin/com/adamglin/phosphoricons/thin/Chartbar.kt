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

public val ThinGroup.Chartbar: ImageVector
    get() {
        if (_chartbar != null) {
            return _chartbar!!
        }
        _chartbar = Builder(name = "Chartbar", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 204.0f)
                horizontalLineTo(212.0f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(84.0f)
                horizontalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(44.0f)
                horizontalLineTo(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(68.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(156.0f, 44.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(204.0f)
                horizontalLineTo(156.0f)
                close()
                moveTo(100.0f, 92.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(204.0f)
                horizontalLineTo(100.0f)
                close()
                moveTo(52.0f, 140.0f)
                horizontalLineTo(92.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(52.0f)
                close()
            }
        }
        .build()
        return _chartbar!!
    }

private var _chartbar: ImageVector? = null
