package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Musicnotesplus: ImageVector
    get() {
        if (_musicnotesplus != null) {
            return _musicnotesplus!!
        }
        _musicnotesplus = Builder(name = "Musicnotesplus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(206.0f, 54.0f)
                lineTo(206.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(194.0f, 54.0f)
                lineTo(176.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(18.0f)
                lineTo(194.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(206.0f, 42.0f)
                horizontalLineToRelative(18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 230.0f, 48.0f)
                close()
                moveTo(214.0f, 112.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(34.06f, 34.06f, 0.0f, true, true, -12.0f, -25.89f)
                lineTo(202.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(202.0f, 164.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, -22.0f, 22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 202.0f, 164.0f)
                close()
                moveTo(86.0f, 108.68f)
                lineTo(86.0f, 196.0f)
                arcToRelative(34.06f, 34.06f, 0.0f, true, true, -12.0f, -25.89f)
                lineTo(74.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.54f, -5.82f)
                lineToRelative(56.0f, -14.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 2.92f, 11.64f)
                lineTo(86.0f, 60.68f)
                lineTo(86.0f, 96.32f)
                lineToRelative(72.54f, -18.14f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 2.92f, 11.64f)
                close()
                moveTo(74.0f, 196.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, -22.0f, 22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 74.0f, 196.0f)
                close()
            }
        }
        .build()
        return _musicnotesplus!!
    }

private var _musicnotesplus: ImageVector? = null
