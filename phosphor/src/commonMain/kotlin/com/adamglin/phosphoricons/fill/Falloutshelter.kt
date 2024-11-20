package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) {
            return _falloutShelter!!
        }
        _falloutShelter = Builder(name = "FalloutShelter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.94f, 124.55f)
                curveToRelative(-1.77f, -54.49f, -46.0f, -98.72f, -100.49f, -100.49f)
                arcTo(104.09f, 104.09f, 0.0f, false, false, 24.06f, 131.45f)
                curveToRelative(1.77f, 54.49f, 46.0f, 98.72f, 100.49f, 100.49f)
                arcTo(104.09f, 104.09f, 0.0f, false, false, 231.94f, 124.55f)
                close()
                moveTo(198.38f, 141.47f)
                lineTo(174.93f, 174.3f)
                arcToRelative(8.52f, 8.52f, 0.0f, false, true, -13.86f, 0.0f)
                lineTo(128.0f, 128.0f)
                lineTo(94.93f, 174.3f)
                arcToRelative(8.52f, 8.52f, 0.0f, false, true, -13.86f, 0.0f)
                lineTo(57.62f, 141.47f)
                arcTo(8.52f, 8.52f, 0.0f, false, true, 64.55f, 128.0f)
                lineTo(128.0f, 128.0f)
                lineTo(97.62f, 85.47f)
                arcTo(8.52f, 8.52f, 0.0f, false, true, 104.55f, 72.0f)
                horizontalLineToRelative(46.9f)
                arcToRelative(8.52f, 8.52f, 0.0f, false, true, 6.93f, 13.47f)
                lineTo(128.0f, 128.0f)
                horizontalLineToRelative(63.45f)
                arcTo(8.52f, 8.52f, 0.0f, false, true, 198.38f, 141.47f)
                close()
            }
        }
        .build()
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
