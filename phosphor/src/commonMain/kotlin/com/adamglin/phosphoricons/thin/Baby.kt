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

public val ThinGroup.Baby: ImageVector
    get() {
        if (_baby != null) {
            return _baby!!
        }
        _baby = Builder(name = "Baby", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 136.0f)
                close()
                moveTo(164.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 164.0f, 120.0f)
                close()
                moveTo(153.87f, 164.62f)
                arcToRelative(49.0f, 49.0f, 0.0f, false, true, -51.74f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.26f, 6.76f)
                arcToRelative(57.0f, 57.0f, 0.0f, false, false, 60.26f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.26f, -6.76f)
                close()
                moveTo(228.0f, 128.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 128.0f, 28.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, true, 228.0f, 128.0f)
                close()
                moveTo(220.0f, 128.0f)
                arcToRelative(92.11f, 92.11f, 0.0f, false, false, -90.06f, -92.0f)
                curveTo(116.26f, 54.07f, 116.0f, 71.83f, 116.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                curveToRelative(0.0f, -0.78f, 0.16f, -17.31f, 12.0f, -35.64f)
                arcTo(92.0f, 92.0f, 0.0f, true, false, 220.0f, 128.0f)
                close()
            }
        }
        .build()
        return _baby!!
    }

private var _baby: ImageVector? = null
