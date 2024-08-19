package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Numberfour: ImageVector
    get() {
        if (_numberfour != null) {
            return _numberfour!!
        }
        _numberfour = Builder(name = "Numberfour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 160.0f)
                lineTo(168.0f, 160.0f)
                lineTo(168.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.25f, -5.0f)
                lineToRelative(-96.0f, 120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 64.0f, 176.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(168.0f, 176.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(152.0f, 160.0f)
                lineTo(80.64f, 160.0f)
                lineTo(152.0f, 70.81f)
                close()
            }
        }
        .build()
        return _numberfour!!
    }

private var _numberfour: ImageVector? = null
