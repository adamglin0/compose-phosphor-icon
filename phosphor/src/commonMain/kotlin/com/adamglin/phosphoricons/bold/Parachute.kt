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

public val BoldGroup.Parachute: ImageVector
    get() {
        if (_parachute != null) {
            return _parachute!!
        }
        _parachute = Builder(name = "Parachute", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 120.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 12.0f)
                horizontalLineToRelative(0.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 20.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.85f, 8.79f)
                lineToRelative(0.22f, 0.2f)
                curveToRelative(0.17f, 0.15f, 0.35f, 0.31f, 0.54f, 0.45f)
                lineToRelative(0.19f, 0.16f)
                lineTo(116.0f, 198.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(140.0f, 198.0f)
                lineToRelative(91.2f, -68.4f)
                horizontalLineToRelative(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 120.0f)
                close()
                moveTo(211.15f, 108.0f)
                lineTo(179.63f, 108.0f)
                curveToRelative(-1.79f, -29.27f, -10.0f, -50.53f, -18.93f, -65.36f)
                arcTo(84.27f, 84.27f, 0.0f, false, true, 211.15f, 108.0f)
                close()
                moveTo(100.42f, 108.0f)
                curveTo(103.15f, 68.76f, 119.0f, 48.11f, 128.0f, 39.38f)
                curveToRelative(9.0f, 8.73f, 24.85f, 29.38f, 27.58f, 68.62f)
                close()
                moveTo(95.3f, 42.64f)
                curveToRelative(-9.0f, 14.83f, -17.14f, 36.09f, -18.93f, 65.36f)
                lineTo(44.85f, 108.0f)
                arcTo(84.27f, 84.27f, 0.0f, false, true, 95.3f, 42.64f)
                close()
                moveTo(68.0f, 132.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(36.0f)
                close()
                moveTo(140.0f, 132.0f)
                horizontalLineToRelative(48.0f)
                lineToRelative(-48.0f, 36.0f)
                close()
            }
        }
        .build()
        return _parachute!!
    }

private var _parachute: ImageVector? = null
