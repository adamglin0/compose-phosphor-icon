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

public val ThinGroup.Paperplaneright: ImageVector
    get() {
        if (_paperplaneright != null) {
            return _paperplaneright!!
        }
        _paperplaneright = Builder(name = "Paperplaneright", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.89f, 117.43f)
                lineToRelative(-168.0f, -95.88f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.7f, 36.0f)
                lineToRelative(31.08f, 92.0f)
                lineTo(44.71f, 220.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 56.0f, 236.0f)
                arcToRelative(12.13f, 12.13f, 0.0f, false, false, 5.93f, -1.57f)
                lineToRelative(167.94f, -96.08f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -20.92f)
                close()
                moveTo(225.89f, 131.43f)
                lineTo(58.0f, 227.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.72f, -4.83f)
                lineToRelative(0.0f, -0.07f)
                lineTo(82.87f, 132.0f)
                lineTo(144.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(82.87f, 124.0f)
                lineTo(52.26f, 33.37f)
                arcTo(3.89f, 3.89f, 0.0f, false, true, 53.44f, 29.0f)
                arcTo(4.13f, 4.13f, 0.0f, false, true, 56.0f, 28.0f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, true, 1.93f, 0.54f)
                lineToRelative(168.0f, 95.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 7.0f)
                close()
            }
        }
        .build()
        return _paperplaneright!!
    }

private var _paperplaneright: ImageVector? = null
