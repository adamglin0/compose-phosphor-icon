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

public val ThinGroup.Toolbox: ImageVector
    get() {
        if (_toolbox != null) {
            return _toolbox!!
        }
        _toolbox = Builder(name = "Toolbox", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 68.0f)
                horizontalLineTo(172.0f)
                verticalLineTo(56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(104.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 84.0f, 56.0f)
                verticalLineTo(68.0f)
                horizontalLineTo(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 80.0f)
                verticalLineTo(192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 68.0f)
                close()
                moveTo(92.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineTo(68.0f)
                horizontalLineTo(92.0f)
                close()
                moveTo(32.0f, 76.0f)
                horizontalLineTo(224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(36.0f)
                horizontalLineTo(188.0f)
                verticalLineTo(104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(76.0f)
                verticalLineTo(104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(28.0f)
                verticalLineTo(80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 32.0f, 76.0f)
                close()
                moveTo(224.0f, 196.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(124.0f)
                horizontalLineTo(68.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(124.0f)
                horizontalLineTo(180.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(124.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 224.0f, 196.0f)
                close()
            }
        }
        .build()
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
