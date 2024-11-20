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

public val BoldGroup.MapPinPlus: ImageVector
    get() {
        if (_mapPinPlus != null) {
            return _mapPinPlus!!
        }
        _mapPinPlus = Builder(name = "MapPinPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(140.0f, 116.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 116.0f)
                lineTo(96.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(20.0f)
                lineTo(116.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(140.0f, 92.0f)
                horizontalLineToRelative(20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 104.0f)
                close()
                moveTo(220.0f, 104.0f)
                curveToRelative(0.0f, 32.38f, -14.85f, 66.57f, -42.94f, 98.87f)
                arcToRelative(259.0f, 259.0f, 0.0f, false, true, -42.18f, 39.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -13.76f, 0.0f)
                curveTo(117.64f, 239.4f, 36.0f, 181.36f, 36.0f, 104.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 184.0f, 0.0f)
                close()
                moveTo(196.0f, 104.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -136.0f, 0.0f)
                curveToRelative(0.0f, 33.31f, 20.0f, 63.37f, 36.7f, 82.71f)
                arcTo(249.35f, 249.35f, 0.0f, false, false, 128.0f, 216.89f)
                arcToRelative(249.35f, 249.35f, 0.0f, false, false, 31.3f, -30.18f)
                curveTo(176.0f, 167.37f, 196.0f, 137.31f, 196.0f, 104.0f)
                close()
            }
        }
        .build()
        return _mapPinPlus!!
    }

private var _mapPinPlus: ImageVector? = null
