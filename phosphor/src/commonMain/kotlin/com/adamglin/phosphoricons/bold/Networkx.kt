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

public val BoldGroup.Networkx: ImageVector
    get() {
        if (_networkx != null) {
            return _networkx!!
        }
        _networkx = Builder(name = "Networkx", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
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
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-8.0f)
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
                moveTo(224.49f, 176.49f)
                lineTo(209.0f, 192.0f)
                lineToRelative(15.52f, 15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(192.0f, 209.0f)
                lineToRelative(-15.51f, 15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(175.0f, 192.0f)
                lineToRelative(-15.52f, -15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(192.0f, 175.0f)
                lineToRelative(15.51f, -15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _networkx!!
    }

private var _networkx: ImageVector? = null
