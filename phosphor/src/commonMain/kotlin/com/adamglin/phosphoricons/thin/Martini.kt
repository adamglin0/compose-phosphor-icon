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

public val ThinGroup.Martini: ImageVector
    get() {
        if (_martini != null) {
            return _martini!!
        }
        _martini = Builder(name = "Martini", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.83f, 42.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 36.0f)
                horizontalLineTo(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, 6.83f)
                lineTo(124.0f, 145.66f)
                verticalLineTo(212.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(145.66f)
                close()
                moveTo(33.66f, 44.0f)
                horizontalLineTo(222.34f)
                lineToRelative(-24.0f, 24.0f)
                horizontalLineTo(57.66f)
                close()
                moveTo(128.0f, 138.34f)
                lineTo(65.66f, 76.0f)
                horizontalLineTo(190.34f)
                close()
            }
        }
        .build()
        return _martini!!
    }

private var _martini: ImageVector? = null
