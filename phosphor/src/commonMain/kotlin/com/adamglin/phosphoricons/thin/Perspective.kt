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

public val ThinGroup.Perspective: ImageVector
    get() {
        if (_perspective != null) {
            return _perspective!!
        }
        _perspective = Builder(name = "Perspective", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 124.0f)
                horizontalLineTo(220.0f)
                verticalLineTo(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -14.15f, -11.81f)
                lineToRelative(-160.0f, 29.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 77.09f)
                verticalLineTo(124.0f)
                horizontalLineTo(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(36.0f)
                verticalLineToRelative(46.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.85f, 11.8f)
                lineToRelative(160.0f, 29.09f)
                arcToRelative(11.28f, 11.28f, 0.0f, false, false, 2.16f, 0.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(132.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(44.0f, 77.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.28f, -3.93f)
                lineToRelative(160.0f, -29.09f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 48.0f)
                verticalLineToRelative(76.0f)
                horizontalLineTo(44.0f)
                close()
                moveTo(212.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.72f, 3.93f)
                lineToRelative(-160.0f, -29.09f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 178.91f)
                verticalLineTo(132.0f)
                horizontalLineTo(212.0f)
                close()
            }
        }
        .build()
        return _perspective!!
    }

private var _perspective: ImageVector? = null
