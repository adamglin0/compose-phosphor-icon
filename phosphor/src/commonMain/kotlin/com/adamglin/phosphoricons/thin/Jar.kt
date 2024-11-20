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

public val ThinGroup.Jar: ImageVector
    get() {
        if (_jar != null) {
            return _jar!!
        }
        _jar = Builder(name = "Jar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 52.23f)
                verticalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 32.0f)
                verticalLineTo(52.23f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 44.0f, 88.0f)
                verticalLineTo(200.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                verticalLineTo(88.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 180.0f, 52.23f)
                close()
                moveTo(172.0f, 32.0f)
                verticalLineTo(52.0f)
                horizontalLineTo(148.0f)
                verticalLineTo(28.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 32.0f)
                close()
                moveTo(116.0f, 52.0f)
                verticalLineTo(28.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(52.0f)
                close()
                moveTo(88.0f, 28.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(52.0f)
                horizontalLineTo(84.0f)
                verticalLineTo(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 88.0f, 28.0f)
                close()
                moveTo(204.0f, 200.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                horizontalLineTo(80.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                verticalLineTo(88.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 80.0f, 60.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                close()
            }
        }
        .build()
        return _jar!!
    }

private var _jar: ImageVector? = null
