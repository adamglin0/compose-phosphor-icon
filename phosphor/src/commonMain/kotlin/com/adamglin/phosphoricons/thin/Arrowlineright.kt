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

public val ThinGroup.ArrowLineRight: ImageVector
    get() {
        if (_arrowLineRight != null) {
            return _arrowLineRight!!
        }
        _arrowLineRight = Builder(name = "ArrowLineRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.83f, 125.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-72.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(174.34f, 132.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(174.34f)
                lineTo(109.17f, 58.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                close()
                moveTo(216.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
            }
        }
        .build()
        return _arrowLineRight!!
    }

private var _arrowLineRight: ImageVector? = null
