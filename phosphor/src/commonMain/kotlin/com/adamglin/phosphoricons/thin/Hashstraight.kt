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

public val ThinGroup.Hashstraight: ImageVector
    get() {
        if (_hashstraight != null) {
            return _hashstraight!!
        }
        _hashstraight = Builder(name = "Hashstraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 156.0f)
                lineTo(164.0f, 156.0f)
                lineTo(164.0f, 100.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(164.0f, 92.0f)
                lineTo(164.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(156.0f, 92.0f)
                lineTo(100.0f, 92.0f)
                lineTo(100.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(92.0f, 92.0f)
                lineTo(40.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(92.0f, 100.0f)
                verticalLineToRelative(56.0f)
                lineTo(40.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(92.0f, 164.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(100.0f, 164.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(164.0f, 164.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(100.0f, 156.0f)
                lineTo(100.0f, 100.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(56.0f)
                close()
            }
        }
        .build()
        return _hashstraight!!
    }

private var _hashstraight: ImageVector? = null