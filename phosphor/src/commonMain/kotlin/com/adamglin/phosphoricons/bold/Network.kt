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

public val BoldGroup.Network: ImageVector
    get() {
        if (_network != null) {
            return _network!!
        }
        _network = Builder(name = "Network", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 108.0f)
                lineTo(140.0f, 108.0f)
                lineTo(140.0f, 92.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(164.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(112.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 92.0f, 40.0f)
                lineTo(92.0f, 72.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(16.0f)
                lineTo(24.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(52.0f, 132.0f)
                verticalLineToRelative(24.0f)
                lineTo(48.0f, 156.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(80.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(100.0f, 176.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(76.0f, 156.0f)
                lineTo(76.0f, 132.0f)
                lineTo(180.0f, 132.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 176.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(204.0f, 132.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(116.0f, 44.0f)
                horizontalLineToRelative(24.0f)
                lineTo(140.0f, 68.0f)
                lineTo(116.0f, 68.0f)
                close()
                moveTo(76.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 180.0f)
                lineTo(76.0f, 180.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(180.0f, 204.0f)
                lineTo(180.0f, 180.0f)
                horizontalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _network!!
    }

private var _network: ImageVector? = null
