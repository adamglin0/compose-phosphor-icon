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

public val BoldGroup.Beanie: ImageVector
    get() {
        if (_beanie != null) {
            return _beanie!!
        }
        _beanie = Builder(name = "Beanie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 160.0f)
                lineTo(228.0f, 144.0f)
                arcToRelative(100.17f, 100.17f, 0.0f, false, false, -70.52f, -95.56f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -59.0f, 0.0f)
                arcTo(100.17f, 100.17f, 0.0f, false, false, 28.0f, 144.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -8.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 176.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 228.0f, 160.0f)
                close()
                moveTo(120.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 36.0f)
                close()
                moveTo(128.0f, 68.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, true, 76.0f, 76.0f)
                verticalLineToRelative(12.0f)
                lineTo(52.0f, 156.0f)
                lineTo(52.0f, 144.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 128.0f, 68.0f)
                close()
                moveTo(116.0f, 180.0f)
                verticalLineToRelative(24.0f)
                lineTo(84.0f, 204.0f)
                lineTo(84.0f, 180.0f)
                close()
                moveTo(140.0f, 180.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(24.0f)
                lineTo(140.0f, 204.0f)
                close()
                moveTo(44.0f, 180.0f)
                lineTo(60.0f, 180.0f)
                verticalLineToRelative(24.0f)
                lineTo(44.0f, 204.0f)
                close()
                moveTo(212.0f, 204.0f)
                lineTo(196.0f, 204.0f)
                lineTo(196.0f, 180.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _beanie!!
    }

private var _beanie: ImageVector? = null
