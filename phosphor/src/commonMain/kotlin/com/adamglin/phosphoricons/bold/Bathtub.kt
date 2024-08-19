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

public val BoldGroup.Bathtub: ImageVector
    get() {
        if (_bathtub != null) {
            return _bathtub!!
        }
        _bathtub = Builder(name = "Bathtub", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 92.0f)
                lineTo(211.3f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 84.0f)
                lineTo(136.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.3f, 8.0f)
                lineTo(68.0f, 92.0f)
                lineTo(68.0f, 52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 8.24f, 6.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 23.52f, -4.78f)
                arcTo(32.22f, 32.22f, 0.0f, false, false, 44.0f, 52.0f)
                lineTo(44.0f, 92.0f)
                lineTo(16.0f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 4.0f, 104.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, 56.0f, 59.85f)
                lineTo(60.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(84.0f, 204.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(196.0f, 203.85f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 252.0f, 144.0f)
                lineTo(252.0f, 104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.0f, 92.0f)
                close()
                moveTo(148.0f, 108.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(24.0f)
                lineTo(148.0f, 132.0f)
                close()
                moveTo(228.0f, 144.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                lineTo(64.0f, 180.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                lineTo(28.0f, 116.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 116.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
