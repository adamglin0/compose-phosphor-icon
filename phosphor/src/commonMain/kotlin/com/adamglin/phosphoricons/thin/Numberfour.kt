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

public val ThinGroup.NumberFour: ImageVector
    get() {
        if (_numberFour != null) {
            return _numberFour!!
        }
        _numberFour = Builder(name = "NumberFour", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 164.0f)
                lineTo(164.0f, 164.0f)
                lineTo(164.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.12f, -2.5f)
                lineToRelative(-96.0f, 120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 64.0f, 172.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(164.0f, 172.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(156.0f, 164.0f)
                lineTo(72.32f, 164.0f)
                lineTo(156.0f, 59.4f)
                close()
            }
        }
        .build()
        return _numberFour!!
    }

private var _numberFour: ImageVector? = null
