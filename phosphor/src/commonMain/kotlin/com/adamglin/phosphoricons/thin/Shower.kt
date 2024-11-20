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

public val ThinGroup.Shower: ImageVector
    get() {
        if (_shower != null) {
            return _shower!!
        }
        _shower = Builder(name = "Shower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(60.0f, 236.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 60.0f, 236.0f)
                close()
                moveTo(84.0f, 196.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 84.0f, 196.0f)
                close()
                moveTo(20.0f, 196.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 196.0f)
                close()
                moveTo(52.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 52.0f, 164.0f)
                close()
                moveTo(252.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(217.66f, 44.0f)
                lineTo(187.73f, 73.93f)
                lineTo(165.86f, 202.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.17f, 9.44f)
                arcTo(12.09f, 12.09f, 0.0f, false, true, 154.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.46f, -3.52f)
                lineToRelative(-98.0f, -98.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 54.0f, 90.14f)
                lineToRelative(128.0f, -21.87f)
                lineToRelative(31.1f, -31.1f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 36.0f)
                horizontalLineToRelative(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 252.0f, 40.0f)
                close()
                moveTo(179.11f, 76.89f)
                lineTo(55.37f, 98.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.19f, 6.78f)
                lineToRelative(98.0f, 98.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.78f, -2.17f)
                close()
            }
        }
        .build()
        return _shower!!
    }

private var _shower: ImageVector? = null
