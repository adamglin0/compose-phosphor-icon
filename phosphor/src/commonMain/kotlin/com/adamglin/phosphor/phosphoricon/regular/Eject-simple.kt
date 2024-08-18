package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Eject-simple`: ImageVector
    get() {
        if (`_eject-simple` != null) {
            return `_eject-simple`!!
        }
        `_eject-simple` = Builder(name = "Eject-simple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f)
                horizontalLineTo(224.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 200.0f)
                close()
                moveTo(25.59f, 150.84f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 2.0f, -17.07f)
                lineTo(109.26f, 32.94f)
                arcToRelative(24.11f, 24.11f, 0.0f, false, true, 37.48f, 0.0f)
                lineToRelative(81.65f, 100.83f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 215.91f, 160.0f)
                horizontalLineTo(40.09f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 25.59f, 150.84f)
                close()
                moveTo(40.0f, 143.91f)
                reflectiveCurveToRelative(0.0f, 0.09f, 0.08f, 0.11f)
                lineToRelative(175.83f, 0.0f)
                reflectiveCurveToRelative(0.08f, -0.09f, 0.08f, -0.13f)
                lineTo(134.3f, 43.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -12.6f, 0.0f)
                lineTo(40.0f, 143.84f)
                arcTo(0.28f, 0.28f, 0.0f, false, false, 40.0f, 143.91f)
                close()
            }
        }
        .build()
        return `_eject-simple`!!
    }

private var `_eject-simple`: ImageVector? = null
