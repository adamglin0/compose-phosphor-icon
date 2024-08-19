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

public val BoldGroup.Subway: ImageVector
    get() {
        if (_subway != null) {
            return _subway!!
        }
        _subway = Builder(name = "Subway", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 96.0f)
                lineTo(228.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(204.0f, 96.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, -52.0f)
                lineTo(104.0f, 44.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 52.0f, 96.0f)
                lineTo(52.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(28.0f, 96.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, true, 76.0f, -76.0f)
                horizontalLineToRelative(48.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 228.0f, 96.0f)
                close()
                moveTo(188.0f, 96.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -18.89f, 26.47f)
                lineToRelative(2.0f, 5.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -6.68f, 15.6f)
                arcTo(11.86f, 11.86f, 0.0f, false, true, 160.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.14f, -7.54f)
                lineToRelative(-5.0f, -12.46f)
                lineTo(112.12f, 196.0f)
                lineToRelative(-5.0f, 12.46f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 216.0f)
                arcToRelative(11.86f, 11.86f, 0.0f, false, true, -4.46f, -0.86f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -6.68f, -15.6f)
                lineToRelative(2.0f, -5.07f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 68.0f, 168.0f)
                lineTo(68.0f, 96.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 96.0f, 68.0f)
                horizontalLineToRelative(64.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 188.0f, 96.0f)
                close()
                moveTo(92.0f, 96.0f)
                verticalLineToRelative(36.0f)
                horizontalLineToRelative(72.0f)
                lineTo(164.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(96.0f, 92.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 92.0f, 96.0f)
                close()
                moveTo(164.0f, 168.0f)
                lineTo(164.0f, 156.0f)
                lineTo(140.0f, 156.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 164.0f, 168.0f)
                close()
                moveTo(116.0f, 172.0f)
                lineTo(116.0f, 156.0f)
                lineTo(92.0f, 156.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _subway!!
    }

private var _subway: ImageVector? = null
