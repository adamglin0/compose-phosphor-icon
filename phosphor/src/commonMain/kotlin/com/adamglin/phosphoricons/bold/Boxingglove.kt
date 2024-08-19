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

public val BoldGroup.Boxingglove: ImageVector
    get() {
        if (_boxingglove != null) {
            return _boxingglove!!
        }
        _boxingglove = Builder(name = "Boxingglove", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 12.0f)
                lineTo(120.0f, 12.0f)
                arcTo(60.08f, 60.08f, 0.0f, false, false, 60.13f, 68.0f)
                lineTo(56.0f, 68.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f)
                verticalLineToRelative(29.19f)
                arcToRelative(20.13f, 20.13f, 0.0f, false, false, 4.38f, 12.5f)
                arcToRelative(11.46f, 11.46f, 0.0f, false, false, 0.94f, 1.0f)
                lineTo(60.0f, 181.0f)
                verticalLineToRelative(35.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(192.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(212.0f, 177.68f)
                lineToRelative(15.23f, -53.3f)
                arcToRelative(20.07f, 20.07f, 0.0f, false, false, 0.77f, -5.5f)
                lineTo(228.0f, 72.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 168.0f, 12.0f)
                close()
                moveTo(204.0f, 118.32f)
                lineTo(188.46f, 172.7f)
                arcTo(12.28f, 12.28f, 0.0f, false, false, 188.0f, 176.0f)
                verticalLineToRelative(36.0f)
                lineTo(84.0f, 212.0f)
                lineTo(84.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.56f, -8.53f)
                lineTo(44.0f, 131.45f)
                lineTo(44.0f, 104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 92.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(84.0f, 72.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f)
                close()
                moveTo(166.66f, 162.0f)
                lineToRelative(-9.0f, 6.0f)
                lineToRelative(9.0f, 6.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -13.32f, 20.0f)
                lineTo(136.0f, 182.42f)
                lineTo(118.66f, 194.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -13.32f, -20.0f)
                lineToRelative(9.0f, -6.0f)
                lineToRelative(-9.0f, -6.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.32f, -20.0f)
                lineTo(136.0f, 153.58f)
                lineTo(153.34f, 142.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 13.32f, 20.0f)
                close()
            }
        }
        .build()
        return _boxingglove!!
    }

private var _boxingglove: ImageVector? = null
