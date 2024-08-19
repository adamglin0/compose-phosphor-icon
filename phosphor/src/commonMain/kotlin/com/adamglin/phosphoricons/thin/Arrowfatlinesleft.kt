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

public val ThinGroup.Arrowfatlinesleft: ImageVector
    get() {
        if (_arrowfatlinesleft != null) {
            return _arrowfatlinesleft!!
        }
        _arrowfatlinesleft = Builder(name = "Arrowfatlinesleft", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 76.0f)
                lineTo(124.0f, 76.0f)
                lineTo(124.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.83f, -2.83f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(96.0f, 96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 124.0f, 224.0f)
                lineTo(124.0f, 180.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(156.0f, 80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 152.0f, 76.0f)
                close()
                moveTo(148.0f, 172.0f)
                lineTo(120.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(38.34f)
                lineTo(29.66f, 128.0f)
                lineTo(116.0f, 41.66f)
                lineTo(116.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(28.0f)
                close()
                moveTo(220.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(212.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(188.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(180.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowfatlinesleft!!
    }

private var _arrowfatlinesleft: ImageVector? = null
