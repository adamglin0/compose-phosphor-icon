package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 128.0f)
                lineTo(116.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(182.55f, 46.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.1f, 20.1f)
                curveTo(191.41f, 80.37f, 204.0f, 103.0f, 204.0f, 128.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, -152.0f, 0.0f)
                curveToRelative(0.0f, -25.0f, 12.59f, -47.63f, 34.55f, -61.95f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 73.45f, 46.0f)
                curveTo(44.56f, 64.78f, 28.0f, 94.69f, 28.0f, 128.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, 200.0f, 0.0f)
                curveTo(228.0f, 94.69f, 211.44f, 64.78f, 182.55f, 46.0f)
                close()
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
