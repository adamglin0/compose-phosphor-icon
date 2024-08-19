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

public val ThinGroup.Arrowsoutlinevertical: ImageVector
    get() {
        if (_arrowsoutlinevertical != null) {
            return _arrowsoutlinevertical!!
        }
        _arrowsoutlinevertical = Builder(name = "Arrowsoutlinevertical", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(216.0f, 124.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 128.0f)
                close()
                moveTo(98.83f, 50.83f)
                lineTo(124.0f, 25.66f)
                lineTo(124.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 25.66f)
                lineToRelative(25.17f, 25.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                close()
                moveTo(157.17f, 205.17f)
                lineTo(132.0f, 230.34f)
                lineTo(132.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(70.34f)
                lineTo(98.83f, 205.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                close()
            }
        }
        .build()
        return _arrowsoutlinevertical!!
    }

private var _arrowsoutlinevertical: ImageVector? = null
