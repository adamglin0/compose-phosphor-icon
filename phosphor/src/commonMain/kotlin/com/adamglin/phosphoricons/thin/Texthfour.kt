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

public val ThinGroup.Texthfour: ImageVector
    get() {
        if (_texthfour != null) {
            return _texthfour!!
        }
        _texthfour = Builder(name = "Texthfour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 56.0f)
                lineTo(148.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(140.0f, 120.0f)
                lineTo(44.0f, 120.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(96.0f)
                lineTo(140.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(252.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(236.0f, 188.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(228.0f, 188.0f)
                lineTo(176.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.16f, -6.46f)
                lineToRelative(56.0f, -72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 112.0f)
                verticalLineToRelative(68.0f)
                horizontalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 252.0f, 184.0f)
                close()
                moveTo(228.0f, 123.66f)
                lineTo(184.18f, 180.0f)
                lineTo(228.0f, 180.0f)
                close()
            }
        }
        .build()
        return _texthfour!!
    }

private var _texthfour: ImageVector? = null
