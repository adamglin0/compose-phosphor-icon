package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Subtract: ImageVector
    get() {
        if (_subtract != null) {
            return _subtract!!
        }
        _subtract = Builder(name = "Subtract", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 160.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -143.6f, 7.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(73.37f, 73.37f, 0.0f, false, false, 7.6f, 0.4f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 72.0f, -72.0f)
                arcToRelative(73.37f, 73.37f, 0.0f, false, false, -0.4f, -7.6f)
                horizontalLineToRelative(0.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 232.0f, 160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.63f, 81.35f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -93.28f, 93.28f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 93.28f, -93.28f)
                close()
                moveTo(32.0f, 96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, 64.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 32.0f, 96.0f)
                close()
                moveTo(160.0f, 224.0f)
                arcTo(63.81f, 63.81f, 0.0f, false, true, 98.0f, 176.0f)
                arcTo(80.07f, 80.07f, 0.0f, false, false, 176.0f, 98.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 160.0f, 224.0f)
                close()
            }
        }
        .build()
        return _subtract!!
    }

private var _subtract: ImageVector? = null
