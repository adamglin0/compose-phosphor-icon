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

public val FillGroup.Subway: ImageVector
    get() {
        if (_subway != null) {
            return _subway!!
        }
        _subway = Builder(name = "Subway", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 176.0f)
                lineTo(156.0f, 152.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                close()
                moveTo(140.0f, 176.0f)
                lineTo(140.0f, 152.0f)
                lineTo(116.0f, 152.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(176.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(88.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(96.0f)
                close()
                moveTo(152.0f, 24.0f)
                lineTo(104.0f, 24.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 32.0f, 96.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(76.58f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, -2.21f)
                lineTo(91.06f, 192.0f)
                lineTo(88.0f, 192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(64.0f, 88.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 88.0f, 64.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                horizontalLineToRelative(-3.06f)
                lineToRelative(10.9f, 21.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 2.21f)
                lineTo(216.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 96.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 152.0f, 24.0f)
                close()
                moveTo(147.06f, 192.0f)
                lineTo(108.94f, 192.0f)
                lineToRelative(-9.1f, 18.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 5.79f)
                horizontalLineToRelative(49.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, -5.79f)
                close()
                moveTo(80.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(12.0f)
                lineTo(100.0f, 152.0f)
                lineTo(80.0f, 152.0f)
                close()
            }
        }
        .build()
        return _subway!!
    }

private var _subway: ImageVector? = null
