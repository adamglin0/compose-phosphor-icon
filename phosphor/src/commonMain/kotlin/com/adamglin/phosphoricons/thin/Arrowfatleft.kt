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

public val ThinGroup.Arrowfatleft: ImageVector
    get() {
        if (_arrowfatleft != null) {
            return _arrowfatleft!!
        }
        _arrowfatleft = Builder(name = "Arrowfatleft", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 76.0f)
                lineTo(124.0f, 76.0f)
                lineTo(124.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.83f, -2.83f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(96.0f, 96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 124.0f, 224.0f)
                lineTo(124.0f, 180.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 76.0f)
                close()
                moveTo(212.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(120.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(38.34f)
                lineTo(29.66f, 128.0f)
                lineTo(116.0f, 41.66f)
                lineTo(116.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _arrowfatleft!!
    }

private var _arrowfatleft: ImageVector? = null
