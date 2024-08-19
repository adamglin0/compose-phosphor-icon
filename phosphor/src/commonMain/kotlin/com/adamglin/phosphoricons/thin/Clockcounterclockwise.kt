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

public val ThinGroup.Clockcounterclockwise: ImageVector
    get() {
        if (_clockcounterclockwise != null) {
            return _clockcounterclockwise!!
        }
        _clockcounterclockwise = Builder(name = "Clockcounterclockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 80.0f)
                verticalLineToRelative(45.74f)
                lineToRelative(38.06f, 22.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.12f, 6.86f)
                lineToRelative(-40.0f, -24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 124.0f, 128.0f)
                lineTo(124.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcTo(91.42f, 91.42f, 0.0f, false, false, 62.93f, 63.0f)
                curveTo(53.05f, 73.0f, 44.66f, 82.47f, 36.0f, 92.86f)
                lineTo(36.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(72.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(40.47f, 100.0f)
                curveTo(49.61f, 89.0f, 58.3f, 79.0f, 68.6f, 68.6f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 1.75f, 120.49f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.5f, 5.82f)
                arcTo(92.0f, 92.0f, 0.0f, true, false, 128.0f, 36.0f)
                close()
            }
        }
        .build()
        return _clockcounterclockwise!!
    }

private var _clockcounterclockwise: ImageVector? = null
