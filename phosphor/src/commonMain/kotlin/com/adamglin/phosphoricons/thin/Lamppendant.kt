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

public val ThinGroup.LampPendant: ImageVector
    get() {
        if (_lampPendant != null) {
            return _lampPendant!!
        }
        _lampPendant = Builder(name = "LampPendant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 77.34f)
                verticalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineTo(60.0f)
                horizontalLineTo(96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 84.0f, 72.0f)
                verticalLineToRelative(5.34f)
                arcTo(107.75f, 107.75f, 0.0f, false, false, 20.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(92.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                arcTo(107.75f, 107.75f, 0.0f, false, false, 172.0f, 77.34f)
                close()
                moveTo(156.0f, 184.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(28.08f, 172.0f)
                arcTo(99.77f, 99.77f, 0.0f, false, true, 89.54f, 83.66f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 92.0f, 80.0f)
                verticalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.46f, 3.69f)
                arcTo(99.77f, 99.77f, 0.0f, false, true, 227.92f, 172.0f)
                close()
            }
        }
        .build()
        return _lampPendant!!
    }

private var _lampPendant: ImageVector? = null
