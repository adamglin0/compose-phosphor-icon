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

public val BoldGroup.Champagne: ImageVector
    get() {
        if (_champagne != null) {
            return _champagne!!
        }
        _champagne = Builder(name = "Champagne", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(153.7f, 12.29f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 142.29f, 4.0f)
                lineTo(97.69f, 4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.41f, 8.29f)
                arcTo(453.85f, 453.85f, 0.0f, false, false, 71.92f, 72.58f)
                curveToRelative(-7.44f, 45.34f, -4.28f, 77.86f, 9.37f, 96.66f)
                arcTo(44.11f, 44.11f, 0.0f, false, false, 108.0f, 186.72f)
                lineTo(108.0f, 228.0f)
                lineTo(96.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(132.0f, 228.0f)
                lineTo(132.0f, 186.72f)
                arcToRelative(44.11f, 44.11f, 0.0f, false, false, 26.7f, -17.48f)
                curveToRelative(13.66f, -18.8f, 16.81f, -51.32f, 9.37f, -96.66f)
                arcTo(453.85f, 453.85f, 0.0f, false, false, 153.7f, 12.29f)
                close()
                moveTo(133.36f, 28.0f)
                curveToRelative(2.08f, 7.25f, 5.14f, 18.7f, 7.92f, 32.0f)
                lineTo(98.7f, 60.0f)
                curveToRelative(2.78f, -13.3f, 5.84f, -24.75f, 7.92f, -32.0f)
                close()
                moveTo(139.27f, 155.14f)
                curveToRelative(-4.4f, 6.0f, -10.52f, 8.86f, -19.28f, 8.86f)
                reflectiveCurveToRelative(-14.88f, -2.82f, -19.28f, -8.86f)
                curveTo(91.88f, 143.0f, 89.71f, 117.88f, 94.46f, 84.0f)
                horizontalLineToRelative(51.06f)
                curveTo(150.27f, 117.88f, 148.1f, 143.0f, 139.27f, 155.14f)
                close()
                moveTo(240.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 56.0f)
                close()
                moveTo(180.0f, 20.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 180.0f, 20.0f)
                close()
                moveTo(216.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 104.0f)
                close()
            }
        }
        .build()
        return _champagne!!
    }

private var _champagne: ImageVector? = null
