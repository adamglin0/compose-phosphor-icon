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

public val ThinGroup.GridFour: ImageVector
    get() {
        if (_gridFour != null) {
            return _gridFour!!
        }
        _gridFour = Builder(name = "GridFour", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 44.0f)
                lineTo(56.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 56.0f)
                lineTo(44.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 44.0f)
                close()
                moveTo(204.0f, 56.0f)
                verticalLineToRelative(68.0f)
                lineTo(132.0f, 124.0f)
                lineTo(132.0f, 52.0f)
                horizontalLineToRelative(68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 56.0f)
                close()
                moveTo(56.0f, 52.0f)
                horizontalLineToRelative(68.0f)
                verticalLineToRelative(72.0f)
                lineTo(52.0f, 124.0f)
                lineTo(52.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 56.0f, 52.0f)
                close()
                moveTo(52.0f, 200.0f)
                lineTo(52.0f, 132.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(72.0f)
                lineTo(56.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 52.0f, 200.0f)
                close()
                moveTo(200.0f, 204.0f)
                lineTo(132.0f, 204.0f)
                lineTo(132.0f, 132.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 204.0f)
                close()
            }
        }
        .build()
        return _gridFour!!
    }

private var _gridFour: ImageVector? = null
